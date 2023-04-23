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
public class Ejercicio10 {
   public static void main(String[] args) {
   
       Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese un número");
       for (int i=0; i<5; i++){    
           i = leer.nextInt();
           if(i > 0 && i < 21){
               System.out.print(i);
               for(int j=1; j<=i; j++ ){
                   System.out.print("*");
               }             
           }
        } 
        
   } 
}
