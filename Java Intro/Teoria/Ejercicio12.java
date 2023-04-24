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
public class Ejercicio12 {
     public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num1,num2=0;
            
            System.out.println("Escribir el primer número: ");
            num1 = leer.nextInt();
            System.out.println("Escribir el segundo número: ");
            num2 = leer.nextInt();
            
            EsMulti(num1, num2);
            
     }
     
     public static void EsMulti(int num1, int num2){
            int multi=0;
            
            if(num1 % num2 == 0){
                System.out.println("Este número " + num1 + " es  multiplo de " + num2 );
            
            } else if(num2 % num1 == 0){
                System.out.println("Este número " + num2 + " es  multiplo de " + num1  );
            
            } else {
                System.out.println("Este número no es multiplo");
            }          
     
     }
            
}
