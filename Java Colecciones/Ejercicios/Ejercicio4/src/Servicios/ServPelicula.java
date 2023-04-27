/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPelicula {

    Pelicula peli = new Pelicula();
    Scanner read = new Scanner(System.in);
    ArrayList<Pelicula> movie = new ArrayList();

    public void cargarPeliculas() {
        String ask = "s";
        while (ask.equalsIgnoreCase("s")) {

            System.out.println("Ingrese el nombre de la película");
            peli.setTitulo(read.nextLine());
            System.out.println("Ingrese el nombre del director");
            peli.setDirector(read.nextLine());
            System.out.println("Ingrese la duración de la película en minutos");
            peli.setDuracion(read.nextInt());
            Pelicula cinema = new Pelicula(peli.getTitulo(), peli.getDirector(), peli.getDuracion());
            movie.add(cinema);
            System.out.println("¿Desea añadir otra película?(S/N)");
            ask = read.next();
            read.nextLine();
        }

    }

    public void mostrarPeliculas() {
        for (Pelicula cinepolis : movie) {
            System.out.println(cinepolis.toString());
        }
    }

    public void mostrarHora() {
        for (Pelicula cinepolis : movie) {
            if (cinepolis.getDuracion() > 60) {
                System.out.println(cinepolis.toString());
            }
        }
    }

    public void ordDesc() {
        movie.sort(Pelicula.ordDesc);
        mostrarPeliculas();
    }

    public void ordAsc() {
        movie.sort(Pelicula.ordAsc);
        mostrarPeliculas();
    }

    public void ordTit() {
        movie.sort(Pelicula.ordTitulo);
        mostrarPeliculas();
    }

    public void ordDir() {
        movie.sort(Pelicula.ordDirec);
        mostrarPeliculas();
    }

}
