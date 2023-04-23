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
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor de la nota :");
        int num1=leer.nextInt();
        
        while(num1<0 || num1>10){
            System.out.println("Ingrese una nota entre 0 y 10 :");
            num1 = leer.nextInt();
        }
        
        System.out.println("El valor de la nota es:" + num1);
        
        
        
    }
    
}
