/*
 *      
       
       
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class SrvMovil {

    Scanner leer = new Scanner(System.in);

    /*
         Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
       instanciar un objeto Celular y poder cargarlo en nuestro programa.
     */
    public void cargarCelular(Movil cargar) {
        System.out.print("Ingrese la marca del móvil: ");
        cargar.setMarca(leer.next());
        System.out.print("Ingrese el modelo del móvil: ");
        cargar.setModelo(leer.next());
        System.out.print("Ingrese el precio del móvil: ");
        cargar.setPrecio(leer.nextDouble());
        System.out.print("Ingrese la cantidad de memoria ram: ");
        cargar.setMemoriaRam(leer.nextInt());
        System.out.print("Ingrese la capacidad de almacenamiento: ");
        cargar.setDisco(leer.nextInt());

    }

    /*
         Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
       números de un celular. Para ello, puede utilizarse un bucle repetitivo
     */
    public void ingresarCodigo(Movil codigo) {

        for (int i = 0; i < codigo.getCodigo().length; i++) {
            codigo.getCodigo()[i] = (int) (Math.random() * 10);

        }

    }

}
