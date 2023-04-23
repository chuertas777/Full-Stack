/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N;
        System.out.println("Ingrese un número mayor que cero para formar un cuadrado con *");
        N = read.nextInt();
        String[][] cuadrado = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i>0 && i<N-1 && j>0 && j<N-1) {
                    cuadrado[i][j]=" ";       
                }else{
                    cuadrado[i][j]="*"; 
                } 
            }   
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(cuadrado[i][j]);
            } 
            System.out.println("");
        }
    }
    
}
