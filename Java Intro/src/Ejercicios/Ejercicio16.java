/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);
        int num, num2 = 0;
        
        boolean res;
        System.out.println("Ingrese el tamaño del vector");
        num = read.nextInt();
        int[] vector = new int[num];
        //Creamos el vector
        
        //Ciclo para para rellenar el vector
        for (int i = 0; i < num; i++) {
            vector[i] = new Random().nextInt(10);
            System.out.println("" + vector[i]);
            //Verificación del número
            System.out.println("Ingrese el número a buscar");
            num2 = read.nextInt();
            res = Encontrar(vector, num2, i);
            if (res == true) {
                System.out.println("El número es este:  " + num2 + "   esta en la posición: " +  getPositionInVector(vector, num2));
                break;
            } else {
                System.out.println("El número no se encuentra:  ");
                break;
            }
        }

    }

    public static boolean Encontrar(int vector[], int num, int i) {
        for (i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                return true;
            }
        }
        return false;
    }

    
    public static int getPositionInVector(int[] vector, int num) {
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
}
