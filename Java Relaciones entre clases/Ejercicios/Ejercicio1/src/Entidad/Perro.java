/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author EdwarVelasquez
 */
public class Perro {
    private String nombre, raza;
    private int edad;
    private double tamaño;

    public Perro() {
    }

        public Perro(String nombre, String raza, int edad, double tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{nombre=").append(nombre);
        sb.append("\nRaza=").append(raza);
        sb.append("\nEdad=").append(edad);
        sb.append("\nTamaño=").append(tamaño);        
        return sb.toString();
    }
        
   
    
    
    
}
