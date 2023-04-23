/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author CamiloH
 */
public class Listas {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Listas
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20, y = 4, a = 2, b = 6, c = 9;

        numerosA.add(x);
        numerosA.add(y);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        //numerosA.remove(0);
        //numerosA.remove(3);
        Iterator<Integer> it = numerosA.iterator();
        while (it.hasNext()) {
            if (it.next() == x) {
                it.remove();
            }
        }

        Iterator iterador = numerosA.iterator();
        System.out.println("Elementos de la lista: ");
        while (iterador.hasNext()) {
            System.out.println(iterador.next() + " ");
        }
        System.out.println(" ");
        Collections.sort(numerosA);

        for (Integer integer : numerosA) {
            System.out.println("Mostrar lista: " + integer);
        }

        //Conjuntos
        HashSet<Integer> numero = new HashSet();
        int r = 20, t = 4, d = 2, e = 6, q = 9;
        numero.add(r);
        numero.add(t);
        numero.add(d);
        numero.add(e);
        numero.add(q);
        //numero.remove(r);
        ArrayList<Integer> numerosConjunto = new ArrayList(numero);
        Collections.sort(numerosConjunto);

        for (Integer integer : numerosConjunto) {
            System.out.println("Conjunto ordenado: " + integer);
        }

        Iterator<Integer> it2 = numero.iterator();
        while (it2.hasNext()) {
            if (it2.next() == 6) {
                it2.remove();
            }

        }

        for (Integer conjunto : numero) {
            System.out.println("Los valores del Conjunto: " + conjunto);
        }

        //Mapas
        HashMap<String, Integer> mapa = new HashMap();
        int v = 20, n = 4, m = 2, l = 6, p = 9;
        String nom1 = "carlos", nom2 = "claudia", nom3 = "sara", nom4 = "ramiro",
                nom5 = "maria";

        mapa.put(nom1, v);
        mapa.put(nom2, n);
        mapa.put(nom3, m);
        mapa.put(nom4, l);
        mapa.put(nom5, p);
        //mapa.remove(nom1);
        //mapa.remove(nom2, n);

        
        //Ordena por llaves y las mayusculas influyen
        TreeMap<String, Integer> mapaTree = new TreeMap(mapa);

        for (Map.Entry<String, Integer> entry : mapaTree.entrySet()) {
            Object key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Llave " + key);
            System.out.println("Valor " + value);

        }

       
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            Object key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("LLave: " + key);
            System.out.println("Valor: " + value);
        }
         
    }
}
