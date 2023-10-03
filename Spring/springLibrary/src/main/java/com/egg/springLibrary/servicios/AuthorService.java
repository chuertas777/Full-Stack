/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.servicios;

import com.egg.springLibrary.entidades.Author;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.repositorios.AuthorRepository;
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
public class AuthorService {

    // Instanciar los repositorios como variables globales
    @Autowired
    private AuthorRepository aRepo;

    // Crear Autor
    @Transactional
    public void createAuthor(String nameA) throws MyException {

        validar(nameA);
        // INSTANCIAR EL OBJETO AUTHOR
        Author author = new Author();

        // setear atributos del objeto (el id no porque se autogenera)
        author.setName(nameA);

        //guardar en la bd
        aRepo.save(author);
    }

    // Listar Autores
    public List<Author> listAllAuthors() {

        List<Author> authors = new ArrayList();

        authors = aRepo.findAll();
        //Metodo propio del jpaRepo es traer todos los datos de la tabla con el ".findAll()"
        return authors;
    }

    // Actualizar autor 
    public void modificarAutor(String idA, String nameA) throws MyException {

        validar(nameA);
        // en caso de que el id del autor este mal digitado o que no se encuentre, se debe de usar un optional
        Optional<Author> answerA = aRepo.findById(idA);

        // verificamos si el optional devuelve algo
        if (answerA.isPresent()) {
            // le pasamos el resultado a un objeto del tipo autor
            Author author = answerA.get();

            //seteamos el valor del nombre
            author.setName(nameA);

            //guardamos
            aRepo.save(author);
        }
    }

    //Captura el id del autor 
    public Author getOne(String id) {
        return aRepo.getOne(id);
    }

    //Método para validar si el campo esta vacio o no
    private void validar(String nombreAutor) throws MyException {

        if (nombreAutor.isEmpty() || nombreAutor == null) {
            throw new MyException("el nombre del autor  no puede ser nulo o estar vacio");
        }

    }
}
