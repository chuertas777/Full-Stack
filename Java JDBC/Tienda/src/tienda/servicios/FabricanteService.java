/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Camilo Huertas
 */
public class FabricanteService {

    Fabricante fabricante;
    FabricanteDAO fDao;
    Scanner read = new Scanner(System.in);

    //Método para insertar un fabricante en la tabla fabricante
    public void insertarFabricante() throws Exception {

        do {
            try {
                fabricante = new Fabricante();
                System.out.println("Ingrese el código del fabricante");
                fabricante.setCodigo(read.nextInt());
                System.out.println("Ingrese el nombre del fabricante");
                fabricante.setNombre(read.next());

                try {
                    fabricante.getCodigo();

                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un valor valido");
                    continue;
                }

                if (fabricante.getCodigo() <= 0) {
                    throw new NumberFormatException("\nVerfique el valor "
                            + "ingresado");
                }

                if (fabricante.getNombre() == null || fabricante.getNombre().isEmpty()) {
                    throw new IllegalArgumentException("\nDebería indicar un "
                            + "nombre para el fabricante!");
                }

                fDao.insertarFabricante(fabricante);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (fabricante.getNombre() == null
                || fabricante.getNombre().isEmpty() || fabricante.getCodigo() <= 0);

    }

}
