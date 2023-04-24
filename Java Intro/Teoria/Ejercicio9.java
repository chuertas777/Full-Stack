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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int contador = 0;
        int suma = 0;
        int num = 0;
        do{
            contador = contador+1;
            System.out.println("Ingrese 20 números, si el número ingresado es cero se saldra del programa:");
                num =leer.nextInt();
        if(num > 0){
            suma = suma + num;
        } 
        if(contador == 5){
            System.out.println("La suma de los números es: " + suma );
        }
        
    }while(num!=0);
        if(contador !=5){
            System.out.println("Se capturo el número cero");
        }   
         
    }
}    
