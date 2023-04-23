/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CamioH
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, tam = 0;
        int pos = -1;

        System.out.println("Ingrese el tamaño del vector");

        //Tamaño del vector 
        num = leer.nextInt();
        //Creo el vector con tamaño n
        int[] vector = new int[num];
        //Guardar numeros del vector 

        //LLeno el vector 
        llenaVector(vector);

    }

    //Funcion para llenar el vector e imprimir los elementos de cada posición
    public static int[] llenaVector(int[] vector) {
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(100000);
            ObtenerDigi(vector[i]);
            System.out.println(" " + "[" + vector[i] + "]" + "   ");

        }

        for (int i = 0; i < vector.length; i++) {
            switch (ObtenerDigi(vector[i])) {
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
                case 3:
                    cnt3++;
                    break;
                case 4:
                    cnt4++;
                    break;
                case 5:
                    cnt5++;
                    break;
                default:
                    throw new AssertionError();
            }

        }

        System.out.println("Números de un dígito hay: " + cnt1);
        System.out.println("Números de dos dígitos hay: " + cnt2);
        System.out.println("Números de tres dígitos hay: " + cnt3);
        System.out.println("Números de cuatro dígitos hay: " + cnt4);
        System.out.println("Números de cinco dígitos hay: " + cnt5);

        return vector;
    }

    //Función para convertir el número a cadena y luego obtener su tamaño 
    public static int ObtenerDigi(int num) {
        String res = Integer.toString(num);
        int tam = res.length();
        return tam;

    }

}
