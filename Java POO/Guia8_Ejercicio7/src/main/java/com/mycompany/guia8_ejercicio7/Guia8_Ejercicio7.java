package com.mycompany.guia8_ejercicio7;

import Entidades.Persona;
import Servicios.ServicioPersona;

public class Guia8_Ejercicio7 {

    public static void main(String[] args) {

        ServicioPersona servicios = new ServicioPersona();

        int raq = 0, normales = 0, fat = 0, mayores = 0, menores = 0;

        Persona person1 = servicios.crearPersona();
        if (servicios.esMayorDeEdad(person1)) {
            mayores++;
        } else {
            menores++;
        }
        if (servicios.calcularIMC(person1) == -1) {
            raq++;
        } else if (servicios.calcularIMC(person1) == 0) {
            normales++;
        } else {
            fat++;
        }

        Persona person2 = servicios.crearPersona();
        if (servicios.esMayorDeEdad(person2)) {
            mayores++;
        } else {
            menores++;
        }
        if (servicios.calcularIMC(person2) == -1) {
            raq++;
        } else if (servicios.calcularIMC(person2) == 0) {
            normales++;
        } else {
            fat++;
        }

        Persona person3 = servicios.crearPersona();
         if (servicios.esMayorDeEdad(person3)) {
            mayores++;
        } else {
            menores++;
        }
        if (servicios.calcularIMC(person3) == -1) {
            raq++;
        } else if (servicios.calcularIMC(person3) == 0) {
            normales++;
        } else {
            fat++;
        }

        Persona person4 = servicios.crearPersona();
         if (servicios.esMayorDeEdad(person4)) {
            mayores++;
        } else {
            menores++;
        }
        if (servicios.calcularIMC(person4) == -1) {
            raq++;
        } else if (servicios.calcularIMC(person4) == 0) {
            normales++;
        } else {
            fat++;
        }

        System.out.println("El porcentaje de mayores de edad es: " +  (mayores) *25 + " %" );
        System.out.println("El porcentaje de menores de edad es: " +  (menores) *25 + " %" );
        System.out.println("El porcentaje de los delgados es: " +  (raq) * 25  + " %" );
        System.out.println("El porcentaje de los normales es: " +  (normales) *25+ " %" );
        System.out.println("El porcentaje de los gordos es: " +  (fat) *25 + " %" );
        

    }

}
