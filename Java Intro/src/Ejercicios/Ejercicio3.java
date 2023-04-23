/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio3 {
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String frase, mayus, min="";
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        mayus = frase.toUpperCase();
        min = frase.toLowerCase();
        
        System.out.println("Frase en mayusculas: " + mayus);
        System.out.println("Frase en minusculas: " + min);
        
        
        
   }
}
