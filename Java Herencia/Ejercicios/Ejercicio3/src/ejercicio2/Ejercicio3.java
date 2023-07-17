/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.SrvElectrodomestico;
import java.util.ArrayList;

/**
 * @author CamiloH
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SrvElectrodomestico srv = new SrvElectrodomestico();
        ArrayList<Electrodomestico> equipos = new ArrayList<>();

        equipos.add(new Televisor(24, true, 1000, "azul", 'A', 30));
        equipos.add(new Televisor(32, false, 1100, "blanco", 'B', 40));
        equipos.add(new Lavadora(24, 1000, "negro", 'D', 40));
        equipos.add(new Lavadora(30, 1500, "gris", 'F', 60));

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico equipo : equipos) {
            System.out.println("--------------------------");
            System.out.println(equipo);    
        }
        
 
        for (Electrodomestico equipo : equipos) {
            double precioFinal = srv.precioFinal(equipo);
            precioTotalElectrodomesticos += precioFinal;

            if (equipo instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (equipo instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }

        }
        System.out.println("------------------------------------");       
        System.out.println("Precio total de los electrodomésticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de las lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: " + precioTotalTelevisores);

    }

}
