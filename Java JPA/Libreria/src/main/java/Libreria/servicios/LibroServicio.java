/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.LibroJpaController;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in);
    LibroJpaController libroJpa = new LibroJpaController();
    Libro libro = new Libro();
    Autor autor;
    Editorial editorial;
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();

    //Método para crear un libro 
    public void crearLibro() throws Exception{

        int opt = 0;
        do {
            try {
                System.out.println("Ingrese el ISBN del libro");
                String isbn = leer.next();
                libro.setIsbn(Long.parseLong(isbn));
                //El título del libro
                System.out.println("Ingrese el título del libro");
                String titulo = leer.next();
                libro.setTitulo(titulo);
                //Año de ka publicación del libro en String
                System.out.println("Ingrese el año de publicación ");
                String anio = leer.next();
                libro.setAnio(Integer.parseInt(anio));
                //Número de ejemplares 
                System.out.println("Ingrese el número de ejemplares");
                int nEjemplares = leer.nextInt();
                libro.setEjemplares(nEjemplares);
                //Ejemplares prestados
                System.out.println("Ingrese ejemplares prestados ");
                int nEjepres = leer.nextInt();
                libro.setEjemplaresPrestados(nEjepres);
                
                //Ejemplares restantes
                libro.setEjemplaresRestantes(libro.getEjemplares()
                        - libro.getEjemplaresPrestados());
                //Creamos el autor para el libro
                as.crearAutor();
                //Creamos la editorial
                es.crearEditorial();
                //Enviamos al autor 
                libro.setAutor(autor);
                libro.setEditorial(editorial);
                System.out.println("Desea seguir creando libros");
                System.out.println("Ingrese la opción 1 o 2");
                System.out.println("1. SI");
                System.out.println("2. NO");
                opt = leer.nextInt();
                option(opt);
                libroJpa.create(libro);

            } catch (InputMismatchException e) {
                System.out.println("\nError en el ingreso de los datos ");

            }

        } while (opt != 2);

    }

    public void option(int option) throws Exception {

        switch (option) {
            case 1:
                crearLibro();
                break;
            case 2:
                System.out.println("Volver al menú");
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }
    }

}
