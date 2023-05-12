/*
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
    del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
    tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author CamiloH
 */
public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;

    //Metodo para llenar las posiciones aletoriamente
    public void llenarRevolver() {
        Random azar= new Random();
        posicionActual = azar.nextInt(5)+1;
        posicionAgua = azar.nextInt(5)+1;

    }

    public boolean mojar() {
        return (posicionActual == posicionAgua);
    }

    public void siguienteChorro() {
        if (posicionActual < 6) {
            posicionActual += 1;
        } else {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RevolverAgua{");
        sb.append("posicionActual=").append(posicionActual);
        sb.append(", posicionAgua=").append(posicionAgua);
        sb.append('}');
        return sb.toString();
    }

}
