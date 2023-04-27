/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.pkg1;

import Servicios.ServAlumno;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServAlumno servAlumno = new ServAlumno();
        servAlumno.crearAlumnos();
        servAlumno.notaFinal();
    }

}
