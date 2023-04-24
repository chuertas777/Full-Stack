/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int total,grados = 0;
        System.out.println("Ingrese la cantidad de grados centigrados: ");
        grados = leer.nextInt();
        
        total = 32 +(9*(grados/5));
        System.out.println("Su equivalente en grados Fahrenheit es: " + total);
       
    
    }
}
