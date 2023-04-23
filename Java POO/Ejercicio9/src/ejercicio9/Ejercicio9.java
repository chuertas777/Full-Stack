/*
 * 
     En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

 */
package ejercicio9;

import Entidades.Matematica;
import Servicios.ServMatematica;

/**
 *
 * @author CamiloH
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServMatematica srv = new ServMatematica();
        
        Matematica mat = new Matematica();
        
        srv.devolverMayor(Math.random()*10, Math.random()*10);
        srv.calcularPotencia(Math.random()*10, Math.random()*10);
        srv.calculaRaiz(Math.random()*10, Math.random()*10);
        
    }
    
}
