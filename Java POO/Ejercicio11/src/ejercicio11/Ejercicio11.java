/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
    clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
    se puede conseguir instanciando un objeto Date con constructor vacío.
    Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la fecha de la siguiente manera ");
        int dia, mes, anio;
         

        System.out.println("Ingresa el día:");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);
        System.out.println("La fecha ingresada es: " + fecha);
        
        LocalDate fechActual = LocalDate.now();
        System.out.println("La fecha actual es:" + fechActual);
        
        long difer = ChronoUnit.YEARS.between(fecha, fechActual);
        System.out.println("La diferencia de años es: " + difer);
        
    }

}
