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
public class Persona {

    private String nombre, apellido;
    private int dni;
    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Persona> personas = new ArrayList<>();
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(Perro perro) {
        this.perros.add(perro);
    }

    

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Persona persona) {
        this.personas.add(persona);
    }
    
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        sb.append("\n nombre=").append(nombre);
        sb.append("\n apellido=").append(apellido);
        sb.append("\n dni=").append(dni);
        sb.append("\n perro=").append(perros);
        
        return sb.toString();
    }
    
    

}
