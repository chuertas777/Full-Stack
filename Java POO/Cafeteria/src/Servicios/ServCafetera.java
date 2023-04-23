/*
 * 
    
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServCafetera {

    Scanner leer = new Scanner(System.in);

    /*
         Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
          máxima.
    
     */
    public void llenarCafetera(Cafetera llenar) {
        llenar.setCantActual(llenar.getCapMax());
        System.out.println(llenar.getCantActual());

    }

    /*
         Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
     */
    public void servirTaza(Cafetera servir) {
        System.out.println("Ingrese el tamaño de la taza vacia");
        int tamano = leer.nextInt();

        if (tamano < servir.getCantActual()) {
            servir.setCantActual(servir.getCantActual() - tamano);
            System.out.println(servir.getCantActual());
        } else {
            System.out.println("No alcanza para llenar la taza");
            servir.setCantActual(0);
        }

    }

    /*
         Método vaciarCafetera(): pone la cantidad de café actual en cero.        
     */
    public void vaciarCafetera(Cafetera vaciar) {
        System.out.println("Se ha vaciado la cafetera");
        vaciar.setCantActual(0);
        System.out.println(vaciar.getCantActual());
    }

    /*
         Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        recibe y se añade a la cafetera la cantidad de café indicada.
    
     */
    public void agregarCafe(Cafetera agregar) {
        System.out.println("Ingrese la cantidad de café que desea ingresar");
        double cafe = leer.nextDouble();
        agregar.setCantActual(agregar.getCantActual() + cafe);
        System.out.println(agregar.getCantActual());

    }

}
