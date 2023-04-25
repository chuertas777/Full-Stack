/*
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
    salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package com.mycompany.ejercicio1;

import Servicios.ServPerro;

/**
 *
 * @author CamiloH
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        ServPerro srv = new ServPerro();
        srv.crearPerro();

    }
}
