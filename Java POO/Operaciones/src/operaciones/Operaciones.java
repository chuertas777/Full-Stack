/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Entidades.Operacion;
import Servicios.ServOperacion;

/**
 *
 * @author CamiloH
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServOperacion ope1 = new ServOperacion();
        
        Operacion ope = ope1.crearOperacion();
        
        ope1.calcularSuma(ope);
        ope1.calcularResta(ope);
        ope1.calcularMulti(ope);
        ope1.calcularDivi(ope);
        
    }
    
}
