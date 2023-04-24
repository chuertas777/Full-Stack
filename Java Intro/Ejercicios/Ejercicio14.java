/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
                    El cambio de divisas es:
                    * 0.86 libras es un 1 €
                    * 1.28611 $ es un 1 €
                    * 129.852 yenes es un 1 €
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double euro;
        int option;
        System.out.println("Ingrese la cantidad de euros a convertir");
        euro = read.nextDouble();
        System.out.println("Menú conversión");
        System.out.println("1.Dólares");
        System.out.println("2.Yenes");
        System.out.println("3.Libras");
        System.out.println("A qué moneda desea convertir?");
        option = read.nextInt();
        conver(euro, option);
    }

    public static void conver(double euro, int option) {
        double result;
        switch (option) {
            case 1:
                result = 1.28611 * euro;
                System.out.println("La conversión a dólares es: " + result + " $");
                break;
            case 2:
                result = 129.852 * euro;
                System.out.println("La conversión a yenes es: " + result + " Y");
                break;
            case 3:
                result = 0.86 * euro;
                System.out.println("La conversión a libras es: " + result + " Lib.");
                break;
            default:
                System.out.println("Ingrese una opción válida");

        }
    }
}
