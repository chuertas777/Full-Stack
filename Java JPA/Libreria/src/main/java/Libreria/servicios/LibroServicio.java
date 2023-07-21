/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.exceptions.NonexistentEntityException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Controladora c = new Controladora();
    Libro libro = new Libro();
    Autor autor;
    Editorial editorial;
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    List<Libro> libros = null;

    //Método para crear un libro 
    public void crearLibro() throws Exception {

        String isbn = "", titulo = "", anio = "", nEjemplares = "", nEjepres = "";

        int opt = 0;
        do {
            try {

                System.out.println("------------------------------------------------");
                //ISBN del Libro
                while (isbn.isEmpty()) {

                    System.out.println("Ingrese el ISBN del libro");
                    isbn = leer.nextLine();

                    if (isbn.isEmpty()) {
                        System.out.println("Debe ingresar el ISBN del libro");
                    }
                }
                libro.setIsbn(Long.parseLong(isbn));

                //El título del libro
                while (titulo.isEmpty()) {

                    System.out.println("Ingrese el título del libro");
                    titulo = leer.nextLine();

                    if (titulo.isEmpty()) {
                        System.out.println("Debe ingresar el título del libro");
                    }
                }
                libro.setTitulo(titulo);

                //Año de la publicación del libro en String
                while (anio.isEmpty()) {

                    System.out.println("Ingrese el año de publicación ");
                    anio = leer.nextLine();
                    if (anio.isEmpty()) {
                        System.out.println("Debe ingresar el año de "
                                + "publicación del libro");
                    }
                }
                libro.setAnio(Integer.parseInt(anio));

                //Número de ejemplares
                while (nEjemplares.isEmpty()) {

                    System.out.println("Ingrese el número de ejemplares");
                    nEjemplares = leer.nextLine();
                    if (nEjemplares.isEmpty()) {
                        System.out.println("Debe ingresar el número de "
                                + "ejemplares existentes del libro");
                    }
                }
                libro.setEjemplares(Integer.parseInt(nEjemplares));

                //Ejemplares prestados
                while (nEjepres.isEmpty()) {

                    System.out.println("Ingrese ejemplares prestados ");
                    nEjepres = leer.nextLine();
                    if (nEjepres.isEmpty()) {
                        System.out.println("Debe ingresar el número de "
                                + "ejemplares prestados");
                    }

                }
                libro.setEjemplaresPrestados(Integer.parseInt(nEjepres));

                //Ejemplares restantes
                if (libro.getEjemplares() < libro.getEjemplaresPrestados()) {
                    throw new NullPointerException("No hay ejemplares "
                            + "suficientes para prestar");
                }
                libro.setEjemplaresRestantes(libro.getEjemplares()
                        - libro.getEjemplaresPrestados());

                //Creamos el autor para el libro
                autor = as.crearAutor();
                //Creamos la editorial
                editorial = es.crearEditorial();
                //Enviamos al autor 
                libro.setAutor(autor);
                libro.setEditorial(editorial);
                System.out.println("¡Libro creado exitosamente!");
                System.out.println("------------------------------------------------");
                System.out.println("Desea seguir creando libros");
                System.out.println("Ingrese la opción 1 o 2");
                System.out.println("1. SI");
                System.out.println("2. NO");
                opt = leer.nextInt();
                option(opt);
                c.crearLibro(libro);

            } catch (InputMismatchException e) {
                System.out.println("\nError en el ingreso de los datos ");

            }

        } while (opt != 2);

    }

    //Opciones del menú libro
    public void option(int option) throws Exception {

        switch (option) {
            case 1:
                crearLibro();
                break;
            case 2:
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }
    }

    //Método para consultar todos los libros
    public void consultarLibros() {
        try {

            libros = c.consultarLibros();
            System.out.println("------------------------------------------------");
            System.out.println(libros);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    //Método para editar un Libro por ISBN
    public void editarLibro() throws Exception {
        String isbn = "", titulo = "";

        do {
            try {
                System.out.println("------------------------------------------------");
                //ISBN del Libro
                while (isbn.isEmpty()) {

                    System.out.println("Ingrese el ISBN del libro que desea editar");
                    isbn = leer.nextLine();

                    if (isbn.isEmpty()) {
                        System.out.println("Debe ingresar el ISBN del libro");
                    }
                }
                System.out.println("Libro a editar es este: ");
                libro = c.consultarISBNLibro(Long.parseLong(isbn));
                System.out.println(libro);

                //El título del libro
                while (titulo.isEmpty()) {

                    System.out.println("Ingrese el nuevo título para el libro");
                    titulo = leer.nextLine();

                    if (titulo.isEmpty()) {
                        System.out.println("Debe ingresar el título del libro");
                    }
                }

                c.editarLibro(Long.parseLong(isbn), titulo);
                System.out.println("¡Libro editado!");

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (isbn == null || isbn.isEmpty());
    }

    //Método para eliminar un libro por ISBN
    public void eliminarLibro() throws NonexistentEntityException {
        String isbn = "";

        do {
            try {
                while (isbn.isEmpty()) {
                    System.out.println("Ingrese el ISBN del Libro a eliminar");
                    isbn = leer.nextLine();

                    if (isbn.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el campo ISBN del libro");
                    }

                }
                System.out.println("Libro a eliminar: ");
                libro = c.consultarISBNLibro(Long.parseLong(isbn));
                System.out.println(libro);
                String opcionEliminar = "";
                do {
                    while (opcionEliminar.isEmpty()) {
                        System.out.println("¿Esta seguro que desea "
                                + "eliminar este registro?");
                        System.out.println("1.SI");
                        System.out.println("2.NO");
                        opcionEliminar = leer.nextLine();

                        if (opcionEliminar.isEmpty()) {
                            System.out.println("No puede quedar vacio el "
                                    + "campo de la opción a revisar");

                        }

                        switch (Integer.parseInt(opcionEliminar)) {
                            case 1:
                                c.eliminarLibro(Long.parseLong(isbn));
                                System.out.println("¡Libro eliminado "
                                        + "exitosamente!");
                                break;
                            case 2:
                                System.out.println("No se llevo a cabo la operación");
                            default:
                                System.out.println("¡Error no se reconoce "
                                        + "la opción ingresada");
                        }

                    }
                } while (opcionEliminar == null || opcionEliminar.isEmpty());

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (isbn == null || isbn.isEmpty());

    }

    //Método para consultar un libro por isbn 
    public void consultarISBNLibro() throws Exception {
        String isbn = "";

        do {
            try {
                System.out.println("------------------------------------------------");
                System.out.println("Ingrese el isbn del libro para consultar: ");
                isbn = leer.nextLine();
                if (isbn == null || isbn.isEmpty()) {
                    throw new InputMismatchException("El campo isbn "
                            + "no puede quedar vacio ");

                }
                libro = c.consultarISBNLibro(Long.parseLong(isbn));
                System.out.println("------------------------------------------------");
                System.out.println(libro);

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique el isbn ingresado");
            }
        } while (isbn == null || isbn.isEmpty());

    }

    //Método para consultar por Título en la entidad Libro
    public void consultarTituloLibro() {
        String titulo = "";

        do {
            try {
                System.out.println("------------------------------------------------");
                System.out.println("Ingrese el título del libro para consultar: ");
                titulo = leer.nextLine();
                if (titulo == null || titulo.isEmpty()) {
                    throw new InputMismatchException("El campo título "
                            + "no puede quedar vacio ");

                }
                libros = c.consultarNombreLibro(titulo);
                System.out.println("------------------------------------------------");
                System.out.println(libros);

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique el título del "
                        + "libro ingresado");
            }
        } while (titulo == null || titulo.isEmpty());

    }

    //Método para consultar por nombre del autor
    public void consultarLibrosAutor() {

        String nombre = "";

        do {
            try {
                while (nombre.isEmpty()) {
                    System.out.println("Ingrese el nombre del autor para "
                            + "buscar los libros");
                    nombre = leer.nextLine();

                    if (nombre.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el nombre del autor");
                    }
                }
                libros = c.consultarLibroAutor(nombre);
                System.out.println(libros);

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (nombre == null || nombre.isEmpty());

    }

    //Método para consultar por nombre de la Editorial
    public void consultarLibroEditorial() {
        String nombre = "";

        do {
            try {
                while (nombre.isEmpty()) {
                    System.out.println("Ingrese el nombre de la editorial "
                            + "para buscar los libros");
                    nombre = leer.nextLine();

                    if (nombre.isEmpty()) {
                        System.out.println("No puede quedar "
                                + "vacio el nombre de la editorial");
                    }
                }
                libros = c.consultarLibroEditorial(nombre);
                System.out.println(libros);

            } catch (InputMismatchException e) {
                System.out.println("¡Upps Error!, Verifique los datos");
            }

        } while (nombre == null || nombre.isEmpty());

    }

}
