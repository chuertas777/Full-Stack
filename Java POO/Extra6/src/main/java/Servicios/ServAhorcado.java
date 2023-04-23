/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();
    String hidden = "";

    /*
        Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
        vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
        de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
        máximas, el valor que ingresó el usuario y encontradas en 0.
     */
    public Ahorcado crearJuego() {

        System.out.print("Ingrese la palabra ");
        ah.setPalabra(leer.next().toCharArray());
        System.out.print("Ingrese la cantidad de jugadas máxima ");
        ah.setCantm(leer.nextInt());
        ah.setCantl(0);

        return ah;

    }

    /*
        Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
        buscar como se usa el vector.length.
     */
    public void longitud() {
        System.out.println("La longitud de la palabra es: " + ah.getPalabra().length);
        for (int i = 0; i < ah.getPalabra().length; i++) {
            hidden += "+";
            System.out.print("  _  ");

        }

        System.out.println(" ");

    }

    /*
        Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
        letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public boolean buscar(char letra) {
        boolean letraEncontrada = false;
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (letra == ah.getPalabra()[i]) {
                letraEncontrada = true;
                break;
            }
        }
        //System.out.println(letraEncontrada ? " si fue encontrada " : " no fue encontrada");
        if (letraEncontrada = true) {
            System.out.println("Si fue encontrada ");

        } else {
            System.out.println("No fue encontrada ");
        }
        return letraEncontrada;
    }

    /*
        Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
        cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
        devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
        busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas(char letra) {
        boolean letraEncontrada = false;
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (letra == ah.getPalabra()[i]) {
                hidden = hidden.substring(0, i) + letra + hidden.substring(i + 1);
                ah.setCantl(ah.getCantl()+1);
                
                letraEncontrada = true;
            }
        }
        System.out.println(hidden);
        return letraEncontrada;
    }

    /*
        Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public void intentos(boolean show) {
        
        if (!show) {
            ah.setCantm(ah.getCantm() - 1);
            System.out.println("El número de intentos es: " + ah.getCantm());
        }
    }

    /*
        Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
     */
    public void juego() {
        crearJuego();
        longitud();
        boolean show;
        do {
            System.out.println("Ingrese una letra: ");
            char leter = leer.next().charAt(0);
            buscar(leter);
            show = encontradas(leter);
            intentos(show);
            //System.out.println(ah.getCantl());
        } while (ah.getCantm() > 0 && ah.getCantl() < ah.getPalabra().length);

    }

}
