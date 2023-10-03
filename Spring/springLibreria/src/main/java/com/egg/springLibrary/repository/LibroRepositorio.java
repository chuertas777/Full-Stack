/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.egg.springLibrary.repository;

import com.egg.springLibrary.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CamiloH
 */
@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long>{
    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro findBookByTitle(@Param("titulo") String titulo);
    
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
    public List<Libro> findBookByAuthor(@Param("nombre") String nombre);
}
