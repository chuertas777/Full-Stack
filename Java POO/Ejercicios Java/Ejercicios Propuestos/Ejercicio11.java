/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double num1, num2, suma, resta, multi, div;
        int opcion;
        String opcion2="";
        System.out.println("Ingrese un número");
        num1 = read.nextDouble();
        System.out.println("Ingrese otro número");
        num2 = read.nextDouble();

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.print("Elija una opción: ");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma es" + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta es" + resta);
                    break;
                case 3:
                    multi = num1 * num2;
                    System.out.println("La multiplicación es" + multi);
                    break;
                case 4:
                    div = num1 / num2;
                    System.out.println("La división es" + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcion2 = read.next();
                 
                    break;
                default:
                    System.out.println("Ingrese un número correcto");
            }
        } while (opcion2.equalsIgnoreCase("N"));

    }

}
