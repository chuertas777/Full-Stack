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
        System.out.println("-----------Barajar----------------");
        bar.barajar();
        System.out.println("-------------Barajado--------------");
        System.out.println(bar);
        System.out.println("------------Siguiente Carta---------------");
        bar.siguienteCarta();
        System.out.println("Monton" + bar.toString2());
        System.out.println("------------Monton de cartas---------------");
        System.out.println(bar.toString2());
        System.out.println("------------Cartas disponibles---------------");
        bar.cartasDisponibles();
        System.out.println("-------------Dar Cartas--------------");
        bar.darCartas(5);
        System.out.println("-------------Monton--------------");
        System.out.println(bar.toString2());
        System.out.println("-------------Cartas del Monton--------------");
        bar.cartasMonton();
        System.out.println("-------------Mostrar Baraja--------------");
        bar.mostrarBaraja();
        System.out.println("------------Cartas disponibles---------------");
        bar.cartasDisponibles();
    }
    
}
