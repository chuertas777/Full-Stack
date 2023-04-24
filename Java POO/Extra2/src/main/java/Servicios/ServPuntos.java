/*
 *  Generar un objeto puntos
    usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
    los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
    que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
    calcular la distancia entre dos puntos consulte el siguiente link:
    http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPuntos {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos pt = new Puntos();
        System.out.print("Ingrese el valor para X1: ");
        pt.setX1(leer.nextDouble());
        System.out.print("Ingrese el valor para X2: ");
        pt.setX2(leer.nextDouble());
        System.out.print("Ingrese el valor para Y1: ");
        pt.setY1(leer.nextDouble());
        System.out.print("Ingrese el valor para Y2: ");
        pt.setY2(leer.nextDouble());

        return pt;
    }

    /*
        a través de otro método calcular y devolver la distancia
        que existe entre los dos puntos que existen en la clase Puntos.
     */
    public double calcularDistancia(Puntos dis) {
        double distancia = (Math.sqrt((Math.pow((dis.getX1() - dis.getX2()), 2)) + (Math.pow((dis.getY1() - dis.getY2()), 2))));
            System.out.println("La distancia entre los dos puntos: " + Math.abs(distancia));
        return distancia;

    }

}
