/*

/*
            * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
           alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
           con sus 3 notas. 
           
 */
package Servicios;

/**
 *
 * @author CamiloH
 */
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
           toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
           pregunta al usuario si quiere crear otro Alumno o no.
           Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
           
*/

public class ServAlumno {

    List<Alumno> alumnos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void crearAlumnos() {

        String opcion = "s";

        while (opcion.equals("s")) {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese las tres notas del alumno:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota " + (i + 1) + ": ");
                int nota = scanner.nextInt();
                notas.add(nota);
            }
            scanner.nextLine(); // limpiar buffer

            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);

            System.out.println("¿Desea crear otro alumno? (s/n)");
            opcion = scanner.nextLine();
            if (!opcion.equals("s") ||!opcion.equals("n") ) {
            System.out.println("Ingrese la letra correcta ");

        } else {
            
            }
            
            
        }

    }
    /*
        Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
           final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
           del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
           promedio final, devuelto por el método y mostrado en el main..
    */

    public void notaFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a buscar:");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                double promedio = alumno.calcularPromedio();
                System.out.println("El promedio del alumno " + nombre + " es: " + promedio);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
        }
    }
}
