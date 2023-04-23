/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String code;
        int correctos=0,incorrectos=0;
        do {
        System.out.println("Ingrese un código");
        code = read.nextLine();
    
        if ((code.startsWith("X")) && (code.endsWith("O")) && (code.length()==5))   {
          correctos++;  
        }else   {
            incorrectos++;
        }
         } while (!code.equals("&&&&&"));
        
        System.out.println("Cantidad correctas= " + correctos);
        System.out.println("Cantidad incorrectas= " + incorrectos);
    }
    
}
