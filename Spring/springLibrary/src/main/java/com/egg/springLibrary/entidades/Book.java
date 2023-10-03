/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.entidades;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Book {
    @Id
    private Long isbn; 
    private String title;
    private Integer copies;
    private LocalDate registration;
    
    @ManyToOne
    private Author author;
    
    @ManyToOne
    private Editorial editorial;
   
    /*
    @OneToOne
    private Image imagen;
    */
}
