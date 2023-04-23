/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
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
