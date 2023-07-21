/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class EditorialServicio {

    Scanner leer = new Scanner(System.in);
    Editorial editorial = new Editorial();
    Controladora c = new Controladora();

    public Editorial crearEditorial() throws Exception {
        String nombre = "";

        do {
            try {

                while (nombre.isEmpty()) {
                    //campo nombre de la editorial
                    System.out.println("Ingrese el nombre de la editorial");
                    nombre = leer.nextLine();
                    
                    if (nombre.isEmpty()) {
                        System.out.println("Debe ingresar el "
                            + "nombre de la editorial");           
                    }
                }
                editorial.setNombre(nombre);
                c.crearEditorial(editorial);
                System.out.println("¡Editorial creada exitosamente!");

            } catch (InputMismatchException e) {
                System.out.println("\nDatos invalidos, verifique nuevamente ");
            }

        } while (nombre == null || nombre.isEmpty());

        return editorial;

    }

}
