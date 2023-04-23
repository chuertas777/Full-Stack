/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
   traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
   obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CamioH
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[4][4]; // Le ponemos la dimension a la matriz, 

        //Llenamos la matriz con número aleatorios del 1 al 10
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = new Random().nextInt(10);

            }
        }
        //Imprimimos la matriz A
        System.out.println("  Matriz A ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[i][j] + "]");

            }

            System.out.println(" ");
        }

        System.out.println(" ");
        //Imprimimos la matriz B
        System.out.println("  Matriz B ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[j][i] + "]");

            }
            System.out.println(" ");

        }

        //
    }

}
