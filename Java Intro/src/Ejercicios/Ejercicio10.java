/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Camilo Huertas
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int limite, numero,suma=0;
        do {
        System.out.println("Ingrese un número límite");
        limite = read.nextInt();
        } while (limite<=0);
        
        do {
            System.out.println("Ingrese un número");
            numero = read.nextInt();
            suma +=numero;  //suma = suma + numero
            System.out.println("la suma actual es " + suma);
        } while (suma<=limite);
        System.out.println("Terminó la suma");
        System.out.println("La suma es " + suma);
        
        
    }
    
}
