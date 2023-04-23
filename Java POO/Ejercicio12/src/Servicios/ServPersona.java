/*
 * métodos:
  
   
   
    Metodo mostrarPersona(): este método muestra la persona creada en el método
   anterior.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPersona {

    /*
          Agregar un método de creación del objeto que respete la siguiente firma:
        crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
        usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
        fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p1 = new Persona();

        System.out.print("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        int d, m, a;
        System.out.println("Ingrese su fecha de nacimiento ");
        System.out.print("Ingrese el día: ");
        d = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        m = leer.nextInt();
        System.out.print("Ingrese el año: ");
        a = leer.nextInt();
        LocalDate fecha = LocalDate.of(a, m, d);
        p1.setFechaN(fecha);

        return p1;
    }

    /*
         Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
        en cuenta que para conocer la edad de la persona también se debe conocer la fecha
        actual.
     */
    public long calcularEdad(Persona cedad) {
        LocalDate fechaActual = LocalDate.now();
        Long dif = ChronoUnit.YEARS.between(cedad.getFechaN(), fechaActual);

        System.out.println("Su edad es: " + dif);

        return dif;
    }

     /*
          Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
        edad y retorna true en caso de que el receptor tenga menor edad que la persona que
        se recibe como parámetro, o false en caso contrario.
    
     */
    public boolean menorQue(Persona menor) {
        System.out.print("Ingrese la otra edad de la otra persona: ");
        int e = leer.nextInt();
            
    
        if (calcularEdad(menor) < e) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    
    /*
         Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.
    */
    
    public void mostrarPersona(Persona mostrar){
        System.out.println("Nombre de la persona ingresada: " + mostrar.getNombre());
        System.out.println("Fecha de nacimiento de la persona: " + mostrar.getFechaN());
        System.out.println("La edad actual es: " + calcularEdad(mostrar));
    }

}
