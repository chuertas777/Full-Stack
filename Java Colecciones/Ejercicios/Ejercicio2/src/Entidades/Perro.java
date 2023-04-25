/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author CamiloH
 */
public class Perro {
    
    private ArrayList<String> razas = new ArrayList();
    private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(String raza) {
        this.razas.add(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    
}
