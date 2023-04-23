/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import Entidades.Cafetera;
import Servicios.ServCafetera;

/**
 *
 * @author CamiloH
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServCafetera caf = new ServCafetera();

        Cafetera dl = new Cafetera();
        
        caf.llenarCafetera(dl);
        caf.servirTaza(dl);
        caf.vaciarCafetera(dl);
        caf.agregarCafe(dl);
        
    }

}
