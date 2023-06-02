/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import Entidades.Televisor;
import Servicios.SrvLavadora;
import Servicios.SrvTelevisor;

/**
 * @author CamiloH
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SrvTelevisor srv1 = new SrvTelevisor();
        System.out.println("");
        System.out.println("");
        srv1.crearTelevisor();
        srv1.precioFinal();

        System.out.println("");
        System.out.println("");
        System.out.println(" ------------------------------------------------------------");

        SrvLavadora srv2 = new SrvLavadora();
        srv2.crearLavadora();
        srv2.precioFinal();

        System.out.println(" ------------------------- Electrodomesticos -----------------------------");
        System.out.println(srv1);
        System.out.println("");
        System.out.println(srv2);


    }

}
