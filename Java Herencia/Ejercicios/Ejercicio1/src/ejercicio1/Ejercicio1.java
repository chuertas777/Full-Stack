/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author CamiloH
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro1 = new Perro("Floky", "Carnivoro", 2, "Husky");
        perro1.Alimentarse();
        
        System.out.println("\n");
        
        Animal gato1 = new Gato("Tremendo", "Galletas", 5, "Siames");
        gato1.Alimentarse();
        
        System.out.println("\n");
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 3, "Fino");
        caballo1.Alimentarse();
        
        
    }
    
}
