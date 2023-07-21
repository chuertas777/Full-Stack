/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.persistencia.exceptions.NonexistentEntityException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class AutorServicio {

    Autor autor = new Autor();
    Controladora c = new Controladora();
    Scanner leer = new Scanner(System.in);
    List<Autor> autores = null;

    //Método para crear un nuevo autor en la libreria
    public Autor crearAutor() throws Exception {

        String nombre = "";
        do {
            try {

                while (nombre.isEmpty()) {
                    //campo nombre del autor
                    System.out.println("Ingrese el nombre del autor");
                    nombre = leer.nextLine();

                    if (nombre.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el nombre del autor");
                    }

                }
                autor.setNombre(nombre);
                c.crearAutor(autor);
                System.out.println("¡Autor creado exitosamente!");

            } catch (InputMismatchException e) {
                System.out.println("\nDatos invalidos, verifique nuevamente ");
            }

        } while (nombre.isEmpty());

        return autor;
    }

    //Método para consultar todos los autores
    public void consultarAutores() {

        try {

            autores = c.consultarAutores();
            System.out.println(autores);

        } catch (InputMismatchException e) {
            System.out.println("¡Upps Error!, Verifique los datos");
        }

    }

    //Método para consultar por nombre del autor
    public void consultarAutor() {

        String nombre = "";

        do {
            try {
                while (nombre.isEmpty()) {
                    System.out.println("Ingrese el nombre del autor a buscar");
                    nombre = leer.nextLine();

                    if (nombre.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el nombre del autor");
                    }
                }
                autores = c.consultarNombreAutor(nombre);
                System.out.println(autores);

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (nombre == null || nombre.isEmpty());

    }

    //Método para editar un autor por id 
    public void editarAutor() throws Exception {

        String nombre = "", ide = "";

        do {
            try {
                while (ide.isEmpty()) {
                    System.out.println("Ingrese el ID del autor a editar");
                    ide = leer.nextLine();

                    if (ide.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el campo ID del autor");
                    }

                }
                while (nombre.isEmpty()) {
                    System.out.println("Ingrese el nombre nuevo para el autor");
                    nombre = leer.nextLine();

                    if (nombre.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el nombre del autor");
                    }

                }
                c.editarAutor(Integer.parseInt(ide), nombre);
                System.out.println("¡Autor editado!");

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (nombre == null || nombre.isEmpty());

    }

    //Método para eliminar autor 
    public void eliminarAutor() throws NonexistentEntityException {

        String ide = "", isbn = "";

        do {
            try {
                while (ide.isEmpty()) {
                    System.out.println("Ingrese el ID del autor a eliminar");
                    ide = leer.nextLine();

                    if (ide.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el campo ID del autor");
                    }

                }
                System.out.println("Autor a eliminar es:");
                autor = c.consultarIDAutor(Integer.parseInt(ide));
                System.out.println(autor);
                
                while (isbn.isEmpty()) {
                    System.out.println("Ingrese el ISBN del libro para "
                            + "poder eliminar el autor");
                    isbn = leer.nextLine();

                    if (isbn.isEmpty()) {
                        System.out.println("No puede quedar vacio el campo "
                                + "ISBN del Libro");

                    }

                }
                
                c.eliminarAutor(Integer.parseInt(ide));
                System.out.println("¡Autor eliminado!");

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (ide == null || ide.isEmpty());

    }

}
