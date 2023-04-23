/*
 *     Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
       corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
       resultado del calculo.
       
       La letra correspondiente al dígito verificador se calculará a traves de un método que
       funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
       número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
       buscar en un array (vector) de caracteres la posición que corresponda al resto de la
       división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Servicios;

import Entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServNif {

    /*
         Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
         corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
         resultado del calculo.
    
     */
    Scanner leer = new Scanner(System.in);

    public Nif crearNif() {
        Nif nif = new Nif();
        System.out.print("Ingrese el DNI ");
        nif.setDni(leer.nextLong());

        //Sacamos el residuo de la división entre el DNI previamente ingresado y el 23
        long result = nif.getDni() % 23;

        //Array de char con 22 posiciones
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        /* ciclo for para recorrer el array y luego comprobar si el residuo es 
        igual a alguna de las posiciones del array, identificar la letra y pasarla 
        a un String
            
         */
        for (int x = 0; x < letra.length; x++) {
            if (result == x) {
                nif.setLetra(String.valueOf(letra[x]));
                break;
            }
        }

        return nif;
    }

    /*
         Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
       en mayúscula; por ejemplo: 00395469-F).
     */
    public void mostrar(Nif imprimir) {
        System.out.println("SU DNI es: " + imprimir.getDni() + "-" + imprimir.getLetra());

    }

}
