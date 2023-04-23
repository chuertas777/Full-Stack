/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServCircunferecia {

    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        Circunferencia crc = new Circunferencia();

        System.out.println("Ingrese el valor del radio, para crear la circunferencia: ");
        crc.setRadio(leer.nextDouble());

        return crc;

    }

    // Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    public void calcularArea(Circunferencia cirA) {
      
        cirA.setRadio(Math.PI * (Math.pow(cirA.getRadio(), 2)));
        System.out.println("El área de la circunferencia es: " + cirA.getRadio());

    }

    // Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public void calcularPerimetro(Circunferencia cirP) {
        cirP.setRadio(2 * Math.PI * cirP.getRadio());
        System.out.println("El perimetro de la circunferencia es: " + cirP.getRadio());

    }

}
