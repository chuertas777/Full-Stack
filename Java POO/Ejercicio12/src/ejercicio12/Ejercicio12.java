/*
    *  Y los siguientes
   
 */
package ejercicio12;

import Entidades.Persona;
import Servicios.ServPersona;

/**
 *
 * @author CamiloH
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        ServPersona srv = new ServPersona();
        Persona per = srv.crearPersona();
        
        srv.calcularEdad(per);
        srv.menorQue(per);
        srv.mostrarPersona(per);
        
        
    }
    
}
