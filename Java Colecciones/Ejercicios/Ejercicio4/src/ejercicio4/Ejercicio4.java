/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import Servicios.ServPelicula;

/**
 *
 * @author CamiloH
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServPelicula serv = new ServPelicula();
        System.out.println("--------  Ingresar Peliculas -------");
        serv.cargarPeliculas();
        System.out.println();
        System.out.println("------ Mostrar Peliculas  --------");
        serv.mostrarPeliculas();
        System.out.println();
        System.out.println("------ Mostrar la pelicula de mayor duración --------");
        serv.mostrarHora();
        System.out.println();
        System.out.println("------- Peliculas en orden descendente  -------");
        serv.ordDesc();
        System.out.println();
        System.out.println("------- Peliculas en orden ascendente  ---------");
        serv.ordAsc();
        System.out.println();
        System.out.println("------ Peliculas ordenadas por título  --------");
        serv.ordTit();
        System.out.println();
        System.out.println("------ Peliculas ordenadas por director --------");
        serv.ordDir();
    }
    
}
