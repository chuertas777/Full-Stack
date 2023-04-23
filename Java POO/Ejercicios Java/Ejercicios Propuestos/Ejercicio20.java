/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese números entre 1 y 9 en la posicion " + i + "," + j);
                    int numero = read.nextInt();
                    matriz[i][j] = numero;
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        System.out.println("La matriz cuadrada es: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
        }
        int k = 0, l = 0;
        int[] sumF = new int[3];
        int[] sumC = new int[3];
        //Inicializar vectores suma
        for (int i = 0; i < 3; i++) {
            sumF[i] = 0;
            sumC[i] = 0;

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    k = k + matriz[i][j];
                }
                if (i + j == 2) {
                    l = l + matriz[i][j];
                }
                //Sumar filas
                sumF[i] = sumF[i] + matriz[i][j];

                //Sumar columnas
                sumC[j] = sumC[j] + matriz[j][i];
            }
        }
        boolean bandera = true;
        if (k != l) {
            bandera = false;
        }
        for (int i = 0; i < 3; i++) {
            if (sumF[i] != sumC[i] || k != sumC[i]) {
                bandera = false;
                break;
            }
        }
        System.out.println(" ");
        if (bandera == true) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz NO es mágica");
                
        }

    }
}
