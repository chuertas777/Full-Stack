/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.services;

import com.egg.springLibrary.repository.LibroRepositorio;
import com.egg.springLibrary.repository.AutorRepositorio;
import com.egg.springLibrary.repository.EditorialRepositorio;
import com.egg.springLibrary.entidades.*;
import com.egg.springLibrary.excepciones.MyException;
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
public class LibroServicio {

    // Instanciar los repositorios como variables globales
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
     AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    // CREATE A BOOK ----------------------------------------------------------------------------------------------------------
    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MyException {
        //VALIDAR QUE LOS ATRIBUTOS NO ESTEN VACIOS
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        // INSTANCIAR EL OBJETO LIBRO
        Libro libro = new Libro();

        //Metodo propio del jpaRepo, encontrar por ID
        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();

        // setear los datos
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);

        libro.setRegistration(LocalDate.now());

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        // para guardar en la bd
        libroRepositorio.save(libro);
    }

    // TAKE ALL BOOKS ---------------------------------------------------------------------------------------------------------
    public List<Libro> listAllBooks() {

        List<Libro> libros = new ArrayList();

        libros = libroRepositorio.findAll();
        //Metodo propio del jpaRepo es traer todos los datos de la tabla con el ".findAll()"
        return libros;
    }

    // UPDATE BOOK -----------------------------------------------------------------------------------------------------------
    @Transactional
    public void actualizarByLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MyException {

        //VALIDAR QUE LOS ATRIBUTOS NO ESTEN VACIOS
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        //caso de que el isbn este mal tipeado o que no exista el isbn, se debe de poner el optional
        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);
        //hacer un optional para el autor y la editorial para el mismo caso del isbn
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);

        //instanciamos objetos de las clase autor y editorial
        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get(); // le pasamos el autor del optional al objeto que ya instanciamos 
        }

        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get(); // le pasamos la editorial del optional al objeto que ya instanciamos
        }

        //Comprobar que todos 3 optional contienen algo
        if (respuestaLibro.isPresent()) {
            //en caso de que si encuentre
            Libro libro = respuestaLibro.get(); //Instanciar un objeto de tipo libro

            //seteamos todos los valores del libro
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEjemplares(ejemplares);
            libro.setEditorial(editorial);

            //le guardamos
            libroRepositorio.save(libro);
        }
    }

    // METODO PARA MANEJAR LA EXCEPCION ----------------------------------------------------------------------------------------------
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
