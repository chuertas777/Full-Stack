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
    
    private String nombre,raza;
    private int edad;
    private double tamanio;
    private ArrayList<Perro> perros = new ArrayList<>();

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(Perro perro) {
        this.perros.add(perro);
    }
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("Perro{");
        sb.append("\n nombre=").append(nombre);
        sb.append("\n raza=").append(raza);
        sb.append("\n edad=").append(edad);
        sb.append("\n tama�o=").append(tamanio);
        //sb.append('}');
        return sb.toString();
    }
    

    
    
    
}
