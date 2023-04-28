/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPaises {

    // HashSet<String> listaP = new HashSet();
    HashSet<Paises> listaP = new HashSet();
    Paises paises = new Paises();
    Scanner leer = new Scanner(System.in);

    public void ingresarPaises() {
        String opcion;

        do {

            System.out.println("Ingrese el nombre del pa�s");

            paises.setPais(leer.nextLine());
            Paises pa = new Paises(paises.getPais());
            listaP.add(pa);

            System.out.println("�Desea agregar otro pa�s?  s/n : ");
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("");
    }

    public void mostrarPaises() {
        for (Paises paises1 : listaP) {
            System.out.println("Pais: " + paises1);
        }

    }

    public void ordenarPaises() {
        ArrayList<Paises> ordenar = new ArrayList(listaP);
        //Collections.sort(ordenar);
        Collections.sort(ordenar, Paises.ordenP);
        for (Paises ordenAlfa : ordenar) {
            System.out.println("Pa�s:" + ordenAlfa);
        }

    }

}
