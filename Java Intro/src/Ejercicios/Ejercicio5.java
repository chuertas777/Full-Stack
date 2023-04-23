/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        double num1,doble,triple, raiz=0;
        System.out.println("Ingrese un número para calcular: ");
        num1 = leer.nextInt();
        
        doble = Math.pow(num1, 2);
        triple = Math.pow(num1, 3);
        raiz = Math.sqrt(num1);
        
        System.out.println("El resultado del número elevado a la 2 es: " + doble);
        System.out.println("El resultado del número a la triple es: " + triple);
        System.out.println("El resultado de la raíz es: " + raiz);
             
        
    }
    
}
