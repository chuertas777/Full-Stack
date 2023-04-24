package ejercicios;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio21 {
    /*
    *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
    * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
    * se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    * que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
    * la matriz M en la cual empieza el primer elemento de la submatriz P.
    */

    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        
        boolean bandera = true;
        int fila ;
        int columna ;
        int F, C, cont, contf, contc;
        
        
        cont = 0;
        int[][] matrizA = new int[10][10];
        int[][] matrizB = new int[3][3];
        
        //llenar la matriz A con numeros aleatorios del 0 al 10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizA[i][j] = (int)(Math.random() * 10);
            }
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("---------------------MATRIZ-A---------------------");
        System.out.println("--------------------------------------------------");
        ImprimirMatriz(matrizA, 10, 10);
        
        //que el usuario llene la matriz B con numeros dentro del rango de 0 a 10
        System.out.println("Para la matriz 3x3: ");
        System.out.println("Ingrese numeros enteros del 0 al 10");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + " , " + j + " ]: ");
                matrizB[i][j] = scaner.nextInt();
            }
        }
        //IMPRIMIR AMBAS MATRICES
        
        System.out.println("--------------------------------------------------");
        System.out.println("---------------------MATRIZ-B---------------------");
        System.out.println("--------------------------------------------------");
        ImprimirMatriz(matrizB, 3, 3);
        
        //verificar si la matriz B se encuentra en la matriz A
        //Guardar la posicion
        F = 0;
        C = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizA[i][j] == matrizB[0][0]) {
                    bandera = true;
                    contf = 0;
                    F = i;
                    C = j;

                    for (fila = F; fila < F + 3; fila++) {
                        contc = 0;
                        for (columna = C; columna < C + 3; columna++) {
                            if (matrizA[fila][columna] != matrizB[contf][contc]) {
                                bandera = false;
                                break;
                            } else {
                                contc++;
                            }

                        }
                        if (bandera == true) {
                            contf++;
                        } else {
                            break;
                        }

                    }
                    if (bandera == true) {

                        i = 8;
                        j = 8;
                    }
                }
                
            }
        }

        if (bandera == true) {
            System.out.println(F);
            System.out.println(C);
            System.out.println("La matriz 3x3 se encuentra en la posicion: ");
            for (int i = F; i < F + 3; i++) {
                for (int j = C; j < C + 3; j++) {
                    System.out.print(" [ " + (i) + " , " + (j) + "] ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Matriz no encontrada");
        }

    }
    
    public static void ImprimirMatriz(int[][] vector, int fil, int colum){
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colum; j++) {
                if (vector[i][j] < 0) {
                    System.out.print(" [" + vector[i][j] + "] ");
                }else{
                    System.out.print(" [ " + vector[i][j] + "] ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
