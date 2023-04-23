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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 2, b = 5, c = 7, d = 9, aux;
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("el nuevo valor de A es: " + a);
        System.out.println("el nuevo valor de B es: " + b);
        System.out.println("el nuevo valor de C es: " + c);
        System.out.println("el nuevo valor de D es: " + d);
    }

}
