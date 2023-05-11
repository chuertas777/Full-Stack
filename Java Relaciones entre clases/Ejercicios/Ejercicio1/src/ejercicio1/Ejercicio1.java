/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author EdwarVelasquez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.*/
    public static void main(String[] args) {
        Perro perro1 = new Perro("yeiko", "pitbull", 7, 0.5);
        Perro perro2 = new Perro("Palomo","Pastor", 3, 0.7);        
        Persona per1 = new Persona("Jhojan", "López", 20, 123, perro1);
        Persona per2 = new Persona("Vanessa", "Proaño", 18, 123, perro2);
        
        System.out.println("Las personas con sus datos y perros son: ");
        System.out.println(per1);
        System.out.println(" ");
        System.out.println(per2);
    }
    
}
