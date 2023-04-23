/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServLibro {

    public Libro crearLibro(){
        Libro libro = new Libro();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro a registrar");
        libro.setISBN(leer.next());
        System.out.println("Ingrese el título del libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor del libro");
        libro.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas del libro");
        libro.setNpag(leer.nextInt());

        return libro;
    
    }

    public void mostrarLibros(Libro libro) {
        
        System.out.println("El ISBN del libro es: " + libro.getISBN());
        System.out.println("El Título del libro es: " + libro.getTitulo());
        System.out.println("El Autor del libro es: " + libro.getAutor());
        System.out.println("El total de Páginas del libro son: " + libro.getNpag());

    }

}
