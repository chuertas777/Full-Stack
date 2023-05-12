/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import Entidades.Baraja;

/**
 *
 * @author CamiloH
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baraja bar = new Baraja();
        System.out.println("---------------------------");
        System.out.println(bar);
        bar.barajar();
        System.out.println("---------------------------");
        System.out.println(bar);
    }
    
}
