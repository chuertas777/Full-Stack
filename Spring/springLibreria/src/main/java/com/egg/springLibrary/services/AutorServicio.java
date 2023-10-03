/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.services;

import com.egg.springLibrary.entidades.Autor;
import com.egg.springLibrary.excepciones.MyException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.egg.springLibrary.repository.AutorRepositorio;

/**
 *
 * @author CamiloH
 */
@Service
public class AutorServicio {
    // Instanciar los repositorios como variables globales
    @Autowired
    AutorRepositorio autorRepositorio;
    
    // CREATE AN AUTHOR -------------------------------------------------------------------------------------------------------
    @Transactional
    public void crearAutor(String nombre) throws MyException{
        
       validar(nombre);
        
        // INSTANCIAR EL OBJETO AUTHOR
        Autor autor = new Autor();
        
        // setear atributos del objeto (el id no porque se autogenera)
        autor.setNombre(nombre);
        
        
        
        //guardar en la bd
        autorRepositorio.save(autor);
    }
    
    // TAKE ALL AUTHORS -------------------------------------------------------------------------------------------------------
    public List<Autor> listAllAuthors(){
        
        List<Autor> autores = new ArrayList();
        
        autores = autorRepositorio.findAll();
        //Metodo propio del jpaRepo es traer todos los datos de la tabla con el ".findAll()"
        return autores;
    }
    
    // UPDATE AUTHOR ----------------------------------------------------------------------------------------------------------
    @Transactional
    public void actualizarByAutor(String idAutor, String nombreAutor) throws MyException{
        
        validar(nombreAutor);
        // en caso de que el id del autor este mal digitado o que no se encuentre, se debe de usar un optional
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        
        // verificamos si el optional devuelve algo
        if (respuestaAutor.isPresent()) {
            // le pasamos el resultado a un objeto del tipo autor
            Autor autor = respuestaAutor.get();
            
            //seteamos el valor del nombre
            autor.setNombre(nombreAutor);
            
            //guardamos
            autorRepositorio.save(autor);
        }
    }
    
     private void validar(String nombreAutor) throws MyException {

        if (nombreAutor.isEmpty() || nombreAutor == null ) {
            throw new MyException("el nombre del autor  no puede ser nulo o estar vacio");
        }
       
    }
}
