/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     
        String text,caract, letra = "";
      
        System.out.println("Ingrese una palabra");
        text = leer.next();
        caract = text.substring(0,1);
        letra = "a";
        if(caract.equals(letra)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        System.out.println("Probar " + caract);
       
        
        
        
        
        
    }
    
}
