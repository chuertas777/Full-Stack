/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author CamiloH
 */
public class Practica1 {

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dni dni = new Dni();
        Persona per = new Persona();
         Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el nombre de la persona ");
        per.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido");
        per.setApellido(leer.nextLine());
        System.out.println("Ingrese la serie");
        dni.setSerie(leer.next().charAt(0));
        System.out.println("Ingrese el DNI de la persona ");
        Dni dn1 = new Dni('A', leer.nextInt());
        //dni.setNumero(leer.nextInt());
        Persona per1 = new Persona(per.getNombre(), per.getApellido(), dn1);
        System.out.println(" ");
        System.out.println(per1.toString());
        
    }
    
}
