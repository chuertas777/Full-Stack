/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulos;

import Entidades.Rectangulo;
import Servicios.ServRectangulo;

/**
 *
 * @author CamiloH
 */
public class Rectangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServRectangulo rect1 = new ServRectangulo();
        Rectangulo rect = rect1.crearRectangulo();
        
        rect1.calcularRect(rect);
        rect1.calcularPeri(rect);
        rect1.dibujarRect(rect);
        
        
    }
    
}
