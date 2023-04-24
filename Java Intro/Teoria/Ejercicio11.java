/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio11 {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        String cadena =" ";

        System.out.println("Ingrese una cadena de texto");
        cadena = leer.nextLine();

        System.out.println("La palabra códificada es: " + codificar(cadena));

        
    }
    
    public static String codificar(String palabra){
        String texto = "";
            texto = palabra.replace('a', '@').replace('e', '#').replace('i','$').replace('o','%').replace('u','*');  
       
        return texto;
 
        
    }
}   