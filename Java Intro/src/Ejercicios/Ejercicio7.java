/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String texto, frase = "";
        System.out.println("Ingrese una frase");
        texto = leer.next();
        
        if(texto.equals("eureka")){
            System.out.println("El mensaje es correcto");
        
        } else{
            System.out.println("El mensaje es incorrecto");
        }
        
        
        
    
    }
}
