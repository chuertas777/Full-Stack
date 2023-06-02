/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ext_ejercicio2;

import Entidades.Edificio;
import Entidades.EdificioOficinas;
import Entidades.Polideportivo;

import java.util.ArrayList;

/**
 * @author CamiloH
 */
public class Ext_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Edificio> edificios = new ArrayList<>();
        Edificio edi1 = new Polideportivo("Colpatria", true, 200, 500, 20);
        Edificio edi2 = new Polideportivo("Wolswagen", false, 300, 350, 50);
        edificios.add(edi1);
        edificios.add(edi2);

        Edificio edi3 = new EdificioOficinas(2, 3, 9, 400, 450, 3);
        Edificio edi4 = new EdificioOficinas(2, 6, 12, 500, 650, 4);
        edificios.add(edi3);
        edificios.add(edi4);

        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie(edificio.getAncho(), edificio.getLargo());
            edificio.calcularVolumen(edificio.getAncho(), edificio.getLargo(), edificio.getAlto());

        }

        Polideportivo poli = new Polideportivo();
        if (poli.isEstado()) {


        }


    }

}
