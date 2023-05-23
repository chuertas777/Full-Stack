/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPerrera {

    Perro perros = new Perro();
    Persona personas = new Persona();
    ArrayList<Perro> adoptados = new ArrayList<>();

    Scanner leer = new Scanner(System.in);

    public void adopcionPerros() {
        crearPerro();
        System.out.println("--------Bienvenidos a la perrera municipal------- ");
        System.out.println("--------------------------------------------------");
        crearPersona();
        mostrarPerros();
        adoptar();

    }

    public void crearPerro() {

        perros.setPerros(new Perro("pintitas", "dalmata", 1,
                0.80));
        perros.setPerros(new Perro("firulais", "chandosito", 2,
                0.90));
        perros.setPerros(new Perro("lulo", "pitbull", 1,
                1.20));
        perros.setPerros(new Perro("cosita", "poodle", 6,
                0.80));
        perros.setPerros(new Perro("apolo", "labrador", 5,
                0.80));

    }

    public void crearPersona() {

        System.out.println("¿Cuantas personas desea agregar, ingrese el número?");
        int numP = leer.nextInt();
        for (int i = 0; i < numP; i++) {
            System.out.println("\nIngrese el nombre de la persona");
            personas.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            personas.setApellido(leer.next());
            System.out.println("Ingrese el  DNI ");
            personas.setDni(leer.nextInt());
            personas.setPersonas(new Persona(personas.getNombre(), 
                    personas.getApellido(), personas.getDni()));

        }

    }

    public void mostrarPerros() {

        System.out.println("La lista de perros disponibles para adopción son: ");
        for (Perro perros : perros.getPerros()) {
            System.out.println(perros.toString());

        }

    }

    public void adoptar() {
        for (Persona personas : personas.getPersonas()) {
            System.out.print(" \n" + personas.getNombre());
            System.out.println("\n ¿Ingrese el nombre del perro que desea adoptar?");
            String nomP = leer.next().toLowerCase();
            
            boolean disponiblePerro = false;
            for (Perro perro : adoptados) {
                String nombrePerro = perro.getNombre().toLowerCase();
                if (nomP.equalsIgnoreCase(nombrePerro)) {
                    System.out.println("El perro ya fue adotado, no está disponible ");
                    disponiblePerro = true;
                    break;
                }
                
            }
            
            if (!disponiblePerro) {
                boolean adoptar = false;
                for (Perro perro : perros.getPerros()) {
                    String nombP = perro.getNombre().toLowerCase();
                   
                    if (nombP.equals(nomP)) {
                        adoptados.add(perro);
                        int indexP = adoptados.indexOf(perro);
                        personas.getPersonas().get(indexP).setPerros(perro);
                        perros.getPerros().remove(perro);
                        adoptar = true;
                        break;
                    }
                }
                
                if (!adoptar) {
                    System.out.println("El nombre no se encuentra en la base de "
                            + "datos ");

                }    
                         
            }      
            
        }
            for (Persona persona1 : personas.getPersonas()) {
                System.out.println("\n" + persona1.toString());
            }
        

    }

}
