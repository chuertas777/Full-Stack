/*
            * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
           alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
           con sus 3 notas. 
          
 */
package Entidades;

import java.util.List;

/**
 *
 * @author CamiloH
 */
public class Alumno {
    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public double calcularPromedio() {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (double) sum / notas.size();
    }
}
