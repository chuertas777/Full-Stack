/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
   una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
   tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
   iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Extras;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int a = 1, b = 2, c = 3, d = 4;
        
        int aux;
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("El valor de A es: "+ a  );
        System.out.println("El valor de A es: "+ b  );
        System.out.println("El valor de A es: "+ c  );
        System.out.println("El valor de A es: "+ d  );
    }
    
   
}
