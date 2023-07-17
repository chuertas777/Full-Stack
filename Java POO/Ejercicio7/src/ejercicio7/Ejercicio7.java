/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Entidades.Persona;
import Servicios.ServPersona;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServPersona per = new ServPersona();
        
        Persona p1 = per.crearPersona();
        per.calcularIMC(p1);
        
        Persona p2 = per.crearPersona();
        per.esMayorDeEdad(p2);
        
        
        
        
    }
    
}
