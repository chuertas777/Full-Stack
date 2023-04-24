/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1,cal=0;
        
        System.out.println("Ingrese un número para saber si es par o impar");
        num1 = leer.nextInt();
        
        cal = num1 % 2;
        
        if(cal == 0){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        }
        
        
    }
    
}
