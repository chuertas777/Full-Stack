/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class MenuLibreria {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    LibroServicio ls = new LibroServicio();
    AutorServicio as = new AutorServicio();

    public void menuPrincipal() throws Exception {
        int option = 0;
        //Menú main
        do {
            try {

                System.out.println(" ---------------------------------- ------------ ");
                System.out.println(" -------- Bienvenidos a la libreria ------------ ");
                System.out.println("Menú Principal, ingrese la opción: ");
                System.out.println("1. Ir al menú Autor");
                System.out.println("2. Ir al menú Libro");
                System.out.println("3. Ir al menú Editorial");
                System.out.println("4. Salir del programa");
                String opt = leer.nextLine();

                option = Integer.parseInt(opt);
                optionsMenu(option);

            } catch (NumberFormatException e) {
                System.out.println("\nError! Ingrese un valor númerico valido ");
                option = 0;

            }

        } while (option != 4);

    }

    //Opciones del menú principal
    public void optionsMenu(int option) throws Exception {

        switch (option) {
            case 1:
                autorMenu();
                break;
            case 2:
                libroMenu();
                break;
            case 3:
                editorialMenu();
                break;
            case 4:
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }

    }

    //Menú autor 
    public void autorMenu() throws Exception {

        int opAutor = 0;

        do {

            try {
                System.out.println("----------------Menú Autor----------------------");
                System.out.println("Ingrese el número de la opción: ");
                System.out.println("1. Crear un nuevo autor");
                System.out.println("2. Consultar autores");
                System.out.println("3. Modificar autor");
                System.out.println("4. Eliminar autor");
                System.out.println("5. Búsqueda de un Autor por nombre.");
                System.out.println("6. Volver al menú anterior");
                String opt = leer.nextLine();
                opAutor = Integer.parseInt(opt);
                optionAutor(opAutor);

            } catch (NumberFormatException e) {
                System.out.println("\nError, verifique el valor ingresado");
            }
        } while (opAutor != 6);

    }

    //Ir a las opciones del menú autor
    public void optionAutor(int option) throws Exception {

        switch (option) {
            case 1:
                as.crearAutor();
                break;
            case 2:
                as.consultarAutores();
                break;
            case 3:
                as.editarAutor();
                break;
            case 4:
                as.eliminarAutor();
                break;
            case 5:
                as.consultarAutor();
                break;
            case 6:
                menuPrincipal();
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }
    }

    //Menú libro
    public void libroMenu() throws Exception {
        int opLibro = 0;

        do {
            try {
                System.out.println("----------------Menú Libro----------------------");
                System.out.println("Ingrese el número de la opción: ");
                System.out.println("1. Crear un libro");
                System.out.println("2. Consultar libros");
                System.out.println("3. Editar libro por ISBN");
                System.out.println("4. Eliminar libro por ISBN");
                System.out.println("5. Búsqueda de un libro por ISBN.");
                System.out.println("6. Búsqueda de un libro por Título.");
                System.out.println("7. Búsqueda de un libro/s por nombre de Autor.");
                System.out.println("8. Búsqueda de un libro/s por nombre de Editorial.");
                System.out.println("9. Volver al menú principal");

                String opt = leer.nextLine();
                opLibro = Integer.parseInt(opt);
                optionLibro(opLibro);

            } catch (NumberFormatException e) {
                System.out.println("\nError, verifique el valor ingresado");
            }
        } while (opLibro != 9);

    }

    //Ir a las opciones del menú libro
    public void optionLibro(int option) throws Exception {

        try {

            switch (option) {
                case 1:
                    ls.crearLibro();
                    break;
                case 2:
                    ls.consultarLibros();  
                    break;
                case 3:
                    ls.editarLibro();
                    break;
                case 4:
                    ls.eliminarLibro();
                    break;
                case 5:
                    ls.consultarISBNLibro();
                    
                    break;
                case 6:
                    ls.consultarTituloLibro();
                    break;
                case 7:
                    ls.consultarLibrosAutor();
                    break;
                case 8:
                    ls.consultarLibroEditorial();
                    break;
                case 9:    
                    menuPrincipal();
                    break;
                default:
                    System.out.println("\nOpción invalida! Intente de nuevo.");
            }

        } catch (NullPointerException e) {
            System.out.println(e.getMessage()
            );
        }
    }

    private void editorialMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
