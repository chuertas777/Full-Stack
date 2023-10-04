/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.servicios;

import com.egg.springLibrary.entidades.*;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.repositorios.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CamiloH
 */
@Service
public class BookService {

    // Instanciar los repositorios como variables globales
    @Autowired
    private BookRepository libroRepositorio;
    @Autowired
    private AuthorRepository autorRepositorio;
    @Autowired
    private EditorialRepository editorialRepositorio;

    // Crear Libro
    @Transactional
    public void createBook(Long isbnB, String titleB, Integer copiesB, String idAuthor, String idEditorial) throws MyException {
        //VALIDAR QUE LOS ATRIBUTOS NO ESTEN VACIOS
        validar(isbnB, titleB, copiesB, idAuthor, idEditorial);

        // INSTANCIAR EL OBJETO LIBRO
        Book book = new Book();

        //Metodo propio del jpaRepo, encontrar por ID
        Author author = autorRepositorio.findById(idAuthor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();

        // setear los datos
        book.setIsbn(isbnB);
        book.setTitle(titleB);
        book.setCopies(copiesB);

        book.setRegistration(LocalDate.now());

        book.setAuthor(author);
        book.setEditorial(editorial);

        // para guardar en la bd
        libroRepositorio.save(book);
    }

    // Listar Libros
    public List<Book> listAllBooks() {

        List<Book> books = new ArrayList();

        books = libroRepositorio.findAll();
        //Metodo propio del jpaRepo es traer todos los datos de la tabla con el ".findAll()"
        return books;
    }

    // Actualizar Libro
    @Transactional
    public void updateOnlyOneBook(Long isbnB, String titleB, String idAuthorB,
            String idEditorialB, Integer copiesB) throws MyException {

        //VALIDAR QUE LOS ATRIBUTOS NO ESTEN VACIOS
        validar(isbnB, titleB, copiesB, idAuthorB, idEditorialB);

        //caso de que el isbn este mal tipeado o que no exista el isbn, se debe de poner el optional
        Optional<Book> answerB = libroRepositorio.findById(isbnB);
        //hacer un optional para el autor y la editorial para el mismo caso del isbn
        Optional<Author> answerA = autorRepositorio.findById(idAuthorB);
        Optional<Editorial> answerE = editorialRepositorio.findById(idEditorialB);

        //instanciamos objetos de las clase autor y editorial
        Author author = new Author();
        Editorial editorial = new Editorial();

        if (answerA.isPresent()) {
            // le pasamos el autor del optional al objeto que ya instanciamos 
            author = answerA.get();

        }

        if (answerE.isPresent()) {
            // le pasamos la editorial del optional al objeto que ya instanciamos 
            editorial = answerE.get();
        }

        //Comprobar que el optional del libro contenga algo 
        if (answerB.isPresent()) {
            //en caso de que si encuentre
            Book book = answerB.get(); //Instanciar un objeto de tipo libro

            //seteamos todos los valores del libro
            book.setIsbn(isbnB);
            book.setTitle(titleB);
            book.setAuthor(author);
            book.setCopies(copiesB);
            book.setEditorial(editorial);

            //le guardamos
            libroRepositorio.save(book);
        }
    }

    // Eliminar Libro 
    @Transactional
    public void eliminarLibro(Long isbn) throws MyException {
        // Verificar si el libro existe
        Optional<Book> answerA = libroRepositorio.findById(isbn);

        // Verificamos si el optional devuelve algo
        if (answerA.isPresent()) {
            // Obtener el libro
            Book book = answerA.get();

            // Eliminar libro de la base de datos
            libroRepositorio.delete(book);

        }
    }

    public Book getOne(Long isbn) {
        return libroRepositorio.getOne(isbn);
    }

    // Método para manejar excepciones
    private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditor) throws MyException {

        if (isbn == null) {
            throw new MyException("el isbn no puede ser nulo");
        }
        if (titulo.isEmpty() || titulo == null) {
            throw new MyException("el titulo no puede ser nulo o estar vacio");
        }
        if (ejemplares == null) {
            throw new MyException("ejemplares no puede ser nulo");
        }
        if (idAutor.isEmpty() || idAutor == null) {
            throw new MyException("el Autor no puede ser nulo o estar vacio");
        }

        if (idEditor.isEmpty() || idEditor == null) {
            throw new MyException("La Editorial no puede ser nula o estar vacia");
        }
    }
}
