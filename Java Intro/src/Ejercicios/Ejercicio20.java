/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
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
