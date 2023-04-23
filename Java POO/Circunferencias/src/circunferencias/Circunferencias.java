/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencias;

import Entidades.Circunferencia;
import Servicios.ServCircunferecia;

/**
 *
 * @author CamiloH
 */
public class Circunferencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServCircunferecia crc1 = new ServCircunferecia();
        
        Circunferencia cir = crc1.crearCircunferencia();
        
        crc1.calcularArea(cir);
        crc1.calcularPerimetro(cir);
        
    }
    
}
