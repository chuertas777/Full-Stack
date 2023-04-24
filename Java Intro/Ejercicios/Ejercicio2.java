/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre ="";
        
        System.out.println("Ingrese sú nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        }
    }
    
