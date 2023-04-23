/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Fracciones;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServFracciones {

    Fracciones frac = new Fracciones();
    Scanner leer = new Scanner(System.in);

    public void crearFrac() {

        System.out.println("Ingrese la primera fracción: ");
        System.out.println("Ingrese el numerador 1: ");
        frac.setNumerador1(leer.nextDouble());
        System.out.println("Ingrese el denominador 1: ");
        frac.setDenominador1(leer.nextDouble());
        System.out.println("Ingrese la segunda fracción: ");
        System.out.println("Ingrese el numerador 2: ");
        frac.setNumerador2(leer.nextDouble());
        System.out.println("Ingrese el denominador 2: ");

    }

    public void menu() {
        int num = 0;
        do {
            System.out.println("Elija una opción para operar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restart");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Para salir");

            switch (num) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                default:
                    break;

            }
        } while (num < 5);

    }

    public void sumar() {
        if (frac.getDenominador1() == frac.getDenominador2()) {
            System.out.println(" Suma =  " + (frac.getNumerador1() + frac.getNumerador2()) + "/" + frac.getDenominador1());
            System.out.println(" = " + (frac.getNumerador1() + frac.getNumerador2()) / frac.getDenominador1());

        } else {
            System.out.println(" Suma = " + ((frac.getNumerador1() * frac.getDenominador2())+
                    (frac.getNumerador2()*frac.getDenominador1()) ));
            System.out.println(" " + () );
            
        }

    }

    public void restar() {

    }

    public void multiplicar() {

    }

    public void dividir() {

    }

}
