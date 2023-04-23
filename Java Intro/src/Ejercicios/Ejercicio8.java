/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String texto = "";
        int cant =0; 
        System.out.println("Ingrese una palabra ");
        texto = leer.next();
        cant = texto.length();
        
        if(cant == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    
    }
}
