/*
 *        
           
 */
package Servicios;

import Entidades.Alumno;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServAlumno {

    Alumno al = new Alumno();
    Scanner leer = new Scanner(System.in);

    /*
           En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
           toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
           pregunta al usuario si quiere crear otro Alumno o no.
     */
    public void crearAlumno() {
        String letra = "";
        int p = 0, suma = 0;

          //Método para pedirle al usuario el nombre del alumno y las notas que tiene ese alumno 
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            al.setNombre(leer.nextLine());
            al.setAlumnos(al.getNombre());
            System.out.println("Ingrese las notas del alumno: ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota" + (i + 1) + ": ");
                al.setNota(leer.nextInt());
                al.setNotas(al.getNota());
               
            }
             
            System.out.println("¿Desea ingresar otra alumno? \n  Y para Si o N para No ");
            letra = leer.nextLine();
           //Verificar que la letra ingresada fue correcta o no 
            do {
                if (!letra.equalsIgnoreCase("y") && !letra.equalsIgnoreCase("n")) {
                    System.out.println("Letra incorrecta, vuelva a ingresar ");
                    letra = leer.nextLine();
                } else {
                    break;
                }
            } while (true);

        } while (letra.equals("y"));
        System.out.println("Gracias por ingresar la lista de alumnos, vuelva pronto");
        for (String alumnos : al.getAlumnos()) {
            System.out.println("Alumno:: " + alumnos);

        }
    }

    /*
           Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
           Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
           final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
           del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
           promedio final, devuelto por el método y mostrado en el main.
     */
    public void notaFinal() {
        
        System.out.println("Ingrese el nombre del alumno a buscar: ");
        String alumno = leer.nextLine();
        Iterator<String> buscar = al.getAlumnos().iterator();

        while (buscar.hasNext()) {
            if (buscar.next().equals(alumno)) {
                System.out.println("Alumno: " + alumno);
                 
                int suma=0;       
                for (int not : al.getNotas()) {
                    System.out.println("Nota :   " + not);
                    suma += not;      
                      
                }
                double promedio = (double) suma /al.getNotas().size();
                System.out.println("Promedio: " + promedio);       
                break;
            } else {
                System.out.println("El alumno no existe en la lista");
            }

        }

    }

}
