/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author CamiloH
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        Juego j = new Juego();
        RevolverAgua ra = new RevolverAgua();
        ra.llenarRevolver();
        System.out.println("Inicio "+ra);
        
        for (int i = 1; i <= 6; i++) {
            Jugador ju = new Jugador();
            System.out.println("Ingrese el nombre del jugador: " );
             ju.setNombre(leer.next());
             ju.setNumJ(i);
            jugadores.add(ju);
        }
        
        j.llenarJuego(jugadores, ra);
        j.ronda();
        
        
        
        
    }
    
}
