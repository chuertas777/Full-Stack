/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class MenuLibreria {

    Scanner leer = new Scanner(System.in);
    LibroServicio ls = new LibroServicio();

    public void menuPrincipal() throws Exception {
        int option = 0;

        do {
            try {
                System.out.println(" ---------------------------------- ------------ ");
                System.out.println(" -------- Bienvenidos a la libreria ------------ ");
                System.out.println("Menú Principal, ingrese la opción: ");
                System.out.println("1. Ingrese para ir al menú autor");
                System.out.println("2. Ingrese para ir al menú libro");
                System.out.println("3. para salir del programa");
                String opt = leer.nextLine();
                option = Integer.parseInt(opt);
                optionsMenu(option);

            } catch (NumberFormatException e) {
                System.out.println("\nError! Ingrese un valor númerico valido ");
                option = 0;

            }

        } while (option != 3);

    }

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
                optionsAuthor(opAutor);

            } catch (NumberFormatException e) {
                System.out.println("\nError, verifique el valor ingresado");
            }
        } while (opAutor != 6);

    }

    public void libroMenu() throws Exception {
       
        
        int opLibro = 0;

        do {

            try {
                 System.out.println("----------------Menú Libro----------------------");
                System.out.println("Ingrese el número de la opción: ");
                System.out.println("1. Crear un libro");
                System.out.println("2. Volver al menú principal");
                
                String opt = leer.nextLine();
                opLibro = Integer.parseInt(opt);
                optionLibro(opLibro);

            } catch (NumberFormatException e) {
                System.out.println("\nError, verifique el valor ingresado");
            }
        } while (opLibro != 2);
        

    }

    public void optionsMenu(int option) throws Exception {

        switch (option) {
            case 1:
                autorMenu();
                break;
            case 2:
                libroMenu();
                break;
            case 3:
                System.out.println("Ha elegido salir de la aplicación");
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }

    }

    public void optionsAuthor(int option) throws Exception {

        switch (option) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                menuPrincipal();
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }
    }

    public void optionLibro(int option) throws Exception {

        switch (option) {
            case 1:
                ls.crearLibro();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }
    }

}
