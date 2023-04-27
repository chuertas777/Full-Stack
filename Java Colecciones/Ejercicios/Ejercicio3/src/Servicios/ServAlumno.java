/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Ingenieria
 */
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServAlumno {

    List<Alumno> alumnos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void crearAlumnos() {

        String opcion = "s";

        while (opcion.equals("s")) {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese las tres notas del alumno:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota " + (i + 1) + ": ");
                int nota = scanner.nextInt();
                notas.add(nota);
            }
            scanner.nextLine(); // limpiar buffer

            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);

            System.out.println("¿Desea crear otro alumno? (s/n)");
            opcion = scanner.nextLine();
            if (!opcion.equals("s") ||!opcion.equals("n") ) {
            System.out.println("Ingrese la letra correcta ");

        } else {
            
            }
            
            
        }

    }

    public void notaFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a buscar:");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                double promedio = alumno.calcularPromedio();
                System.out.println("El promedio del alumno " + nombre + " es: " + promedio);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
        }
    }
}
