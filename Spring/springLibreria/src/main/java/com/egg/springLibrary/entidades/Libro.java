/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


/**
 *
 * @author CamiloH
 * Data reemplaza el getter y setter
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
public class Libro implements Serializable {
    @Id
    private Long isbn;
    
    private String titulo;
    private Integer ejemplares;
    private LocalDate registration;
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Editorial editorial;
}
