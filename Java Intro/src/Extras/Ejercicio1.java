/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
 */
package Extras;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int min,tdias,thoras = 0;
        
        System.out.println("Ingresa la cantidad de minutos");
        min = read.nextInt();
        
        tdias = min / 1440;
        thoras = (min / 60) -(tdias*24);
        
        System.out.println("Total de días: " + tdias + "  total horas " + thoras);
        
        
    }
    
}
