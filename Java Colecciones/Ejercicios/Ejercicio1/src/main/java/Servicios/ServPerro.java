/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPerro {

    Scanner leer = new Scanner(System.in);
    Perro pe = new Perro();

    public void crearPerro(){
        String letra = "";

        do {
            System.out.println("Ingrese la raza del perro");
            pe.setRaza(leer.nextLine());
            pe.setRazas(pe.getRaza());
            System.out.println("¿Desea ingresar otra raza de perro? \n  Y o N ");
            letra = leer.nextLine();
            
            do {
                if (!letra.equalsIgnoreCase("y") && !letra.equalsIgnoreCase("n")) {
                    System.out.println("Letra incorrecta, vuelva a ingresar ");
                    letra = leer.nextLine();
                }else{
                    break;
                }
            } while (true);
            
            
        } while (letra.equals("y"));
        System.out.println("Gracias por ingresar las razas de perros, vuelva pronto");

        for (String razaP : pe.getRazas()) {
            System.out.println("Raza: " + razaP);
            
        }
        
    }

}
