/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author CamiloH
 */
public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private RevolverAgua ra;

    public void llenarJuego(ArrayList<Jugador> j, RevolverAgua r) {
        this.jugadores = j;
        this.ra = r;

    }

    public void ronda() {

        for (Jugador jugador : jugadores) {
            if (jugador.disparo(ra)) {
                System.out.println("Siguiente jugador ");

            } else {
                System.out.println("Fin de juego ");
                break;
            }

        }

    }

}
