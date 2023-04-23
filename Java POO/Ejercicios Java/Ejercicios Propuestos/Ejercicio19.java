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
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("La Matriz 1 es: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero entero");
                int numero = read.nextInt();
                matriz[i][j] = numero;

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        int[][] matriz2 = new int[3][3];
        System.out.println(" ");
        System.out.println("La Matriz AT es: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = (matriz[j][i]) * -1;
                System.out.print(matriz2[i][j] + " ");

            }

        }
        boolean bandera = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz2[i][j]) {
                    bandera = false;
                    break;
                }

            }
        }
        System.out.println(" ");
        if (bandera == true) {
            System.out.println("La matriz es antimétrica");

        } else {
            System.out.println("La matriz NO es antimétrica");
        }
    }
}
