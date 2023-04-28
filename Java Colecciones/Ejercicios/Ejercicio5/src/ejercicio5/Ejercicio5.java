/*
            * Se requiere un programa que lea y guarde pa�ses, y para evitar que se ingresen repetidos 
           usaremos un conjunto. El programa pedir� un pa�s en un bucle, se guardar� el pa�s en el 
           conjunto y despu�s se le preguntar� al usuario si quiere guardar otro pa�s o si quiere salir, 
           si decide salir, se mostrar� todos los pa�ses guardados en el conjunto. (Recordemos hacer 
           los servicios en la clase correspondiente)
           Despu�s deberemos mostrar el conjunto ordenado alfab�ticamente: para esto recordar 
           c�mo se ordena un conjunto.
           Por �ltimo, al usuario se le pedir� un pa�s y se recorrer� el conjunto con un Iterator, se 
           buscar� el pa�s en el conjunto y si est� en el conjunto se eliminar� el pa�s que ingres� el 
           usuario y se mostrar� el conjunto. Si el pa�s no se encuentra en el conjunto se le informar� 
           al usuario.
 */
package ejercicio5;

import Servicios.ServPaises;

/**
 *
 * @author CamiloH
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServPaises srv = new ServPaises();
        srv.ingresarPaises();
        System.out.println("-------------Mostrar Paises---------------");
        srv.mostrarPaises();
        System.out.println("-------------Ordenar Paises alfabeticamente -----------");
        srv.ordenarPaises();
        System.out.println("-------------Eliminar paises -----------");
        srv.eliminarPaises();
         
    }
    
}
