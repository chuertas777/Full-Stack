/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import Libreria.persistencia.EditorialJpaController;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class EditorialServicio {

    Scanner leer = new Scanner(System.in);
    Editorial editorial = new Editorial();
    EditorialJpaController editorialJpa = new EditorialJpaController();

    public void crearEditorial() throws Exception {
        int opt = 0;

        do {
            try {
                //campo nombre del autor
                System.out.println("Ingrese el nombre de la editorial");
                String nombre = leer.nextLine();

                if (nombre.isEmpty()) {
                    throw new NullPointerException("Debe ingresar el "
                            + "nombre de la editorial ");
                }

                System.out.println("Desea seguir creando editoriales");
                System.out.println("Ingrese la opción 1 o 2");
                System.out.println("1. SI");
                System.out.println("2. NO");

                editorial.setNombre(nombre);
                editorialJpa.create(editorial);
                opt = leer.nextInt();
                option(opt);
            } catch (InputMismatchException e) {
                System.out.println("\nDatos invalidos, verifique nuevamente ");
            }

        } while (opt != 2);

    }

    public void option(int option) throws Exception {

        switch (option) {
            case 1:
                crearEditorial();
                break;
            case 2:
                System.out.println("Volver al menú");
                break;
            default:
                System.out.println("\nOpción invalida! Intente de nuevo.");
        }
    }

}
