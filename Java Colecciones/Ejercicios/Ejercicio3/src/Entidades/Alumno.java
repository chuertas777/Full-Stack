/*
            * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
           alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
           con sus 3 notas. 
          
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author CamiloH
 */
public class Alumno {
    
    private ArrayList<String> alumnos = new ArrayList();
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();
    private int nota;

    public Alumno() {
    }

    public ArrayList<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumno) {
        this.alumnos.add(alumno);
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(int nota) {
        this.notas.add(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
    
    
}
