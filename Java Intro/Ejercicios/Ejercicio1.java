/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
    
        int num1, num2, sum = 0;
        
        System.out.println("Ingrese el primer número ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        
        sum = num1 + num2;
        System.out.println("El total de la suma es: " + sum);
                
    
    }
}
