/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import Servicios.ServAlumno;

/**
 *
 * @author CamiloH
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServAlumno srv = new ServAlumno();
        System.out.println("Hello world");
        srv.crearAlumno();
        srv.notaFinal();
        
        
    }
    
}