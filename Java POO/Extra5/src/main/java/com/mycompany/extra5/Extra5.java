/*
 * 
    Crea una clase en Java donde declares una variable de tipo array de Strings que
    contenga los doce meses del año, en minúsculas. A continuación, declara una variable
    mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
    mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
    usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
    el mes secreto. Un ejemplo de ejecución del programa podría ser este:
    Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
    No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
    ¡Ha acertado!
    
 */
package com.mycompany.extra5;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Extra5 {

    public static void main(String[] args) {
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        System.out.println("Ingrese el uno de los doce meses del año en minuscula ");
        Scanner leer = new Scanner(System.in);
        String a = leer.next();

        String mesSecreto = mes[9];

        for (int i = 0; i < mes.length; i++) {
            if (mesSecreto == a) {
                System.out.println("¡Ha acertado! " + a);
                
            } else {
                System.out.println(" No ha acertado " + a);
                
            }
        }

    }
}
