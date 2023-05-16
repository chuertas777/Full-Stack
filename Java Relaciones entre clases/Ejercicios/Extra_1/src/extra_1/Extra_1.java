/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra_1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        Perro perro1 = new Perro("Pintitas", "dalmata", 1, 0.80);
        Perro perro2 = new Perro("Firulais", "chandosito", 2, 0.90);
        Perro perro3 = new Perro("Lulo", "pitbull", 1, 1.20);
        Perro perro4 = new Perro("Cosita", "poodle", 6, 0.80);
        Perro perro5 = new Perro("Apolo", "labrador", 5, 0.80);
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);

        Persona persona1 = new Persona("Johan", "Lopez", 102345, new Perro());
        Persona persona2 = new Persona("Camilo", "Huertas", 1023457, new Perro());
        Persona persona3 = new Persona("Lina", "Ascanio", 1502345, new Perro());
        Persona persona4 = new Persona("Alexis", "Castillo", 1672345, new Perro());
        Persona persona5 = new Persona("Cristian", "Chikito", 182345, new Perro());
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        for (Persona persona : personas) {
            System.out.println("" + persona);

        }
        
        System.out.println("--------Bienvenidos a la perrera municipal------- ");
        System.out.println("La lista de perros disponibles para adopción son: ");
        for (Perro perro : perros) {
            System.out.println("" + perro);
            
        }
        
        System.out.println("¿Que perro desea adoptar?" +  " S/N");
        
        
        System.out.println("¿Ingrese el nombre del perro?" + " S/N");
        String nperro = leer.next();
        System.out.println("Ingrese su nombre ");
        String name = leer.next();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(name)) {
                for (Perro perro : perros) {
                    if (perro.getNombre().equals(nperro)) {
                        System.out.println("¡Felicidades! Has adoptado un perro"
                                + "..." + perro.getNombre());
                        persona.setPerro(perro);
                    }
                    
                }
            }
            
            
            
        }
        for (Persona persona : personas) {
            System.out.println("" + persona);
            
        }
        
        

    }

}
