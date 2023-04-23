/*
 * 
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class ServPersona {

    Scanner leer = new Scanner(System.in);

    /*
         Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
        al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
        O. Si no es correcto se deberá mostrar un mensaje   
     */
    public Persona crearPersona() {
        Persona per = new Persona();
        System.out.println("Ingrese su nombre: ");
        per.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        per.setEdad(leer.nextInt());
        System.out.println("Ingrese su tipo de genero 'H' Hombre 'M' Mujer o 'O' para otro: ");
        per.setSexo(leer.next().toUpperCase());            
        System.out.println("Ingrese su peso por ejemplo 80,5kg");
        per.setPeso(leer.nextDouble());
        System.out.println("Ingrese su estatura por ejemplo 1,75cm: ");
        per.setAltura(leer.nextDouble());

        return per;

    }

    /*
         Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
        significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
        Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
        persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
        de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
        función devuelve un 1.
    
     */
    public void calcularIMC(Persona imc) {
        imc.setPeso(imc.getPeso() / Math.pow(imc.getAltura(), 2));

        if (imc.getPeso() < 20) {
            System.out.println(imc.getNombre() + "Esta debajo de su peso ideal " + " -1  " + imc.getPeso());

        } else if (imc.getPeso() >= 20 && imc.getPeso() <= 25) {
            System.out.println(imc.getNombre() + "Se encuentra en su peso ideal " + " 0  " + imc.getPeso());

        } else if (imc.getPeso() > 25) {
            System.out.println(imc.getNombre() + "Tiene sobrepeso " + " 1 " + imc.getPeso());
        }

    }
    
    /*
         Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
          devuelve un booleano.
    */
    public void esMayorDeEdad(Persona mayor){
        boolean mayoria;
        if(mayor.getEdad() >= 18){
            System.out.println("Es una persona mayor de edad ");
            mayoria = true;
        }
    
    }
    

}
