/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
    ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
    distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals()..
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author DanielPalma
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String code;
        int correctos=0,incorrectos=0;
        do {
        System.out.println("Ingrese un código");
        code = read.nextLine();
    
        if ((code.startsWith("X")) && (code.endsWith("O")) && (code.length()==5))   {
          correctos++;  
        }else   {
            incorrectos++;
        }
         } while (!code.equals("&&&&&"));
        
        System.out.println("Cantidad correctas= " + correctos);
        System.out.println("Cantidad incorrectas= " + incorrectos);
    }
    
}
