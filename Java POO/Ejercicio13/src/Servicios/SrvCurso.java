/*
 * 
   
   
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class SrvCurso {

    /*
        método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
        que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
        en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
        nombre de cada alumno.
    
     */
    Scanner leer = new Scanner(System.in);

    public Curso cargarAlumnos() {
        Curso crs = new Curso();

        for (int i = 0; i < crs.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            crs.getAlumnos()[i] = leer.next();

        }

        return crs;
    }

    /*
         Método crearCurso(): el método crear curso, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
        al atributo alumnos
     */
    public void crearCurso(Curso crear) {
        System.out.println("Ingrese el nombre del curso");
        crear.setNombreCurso(leer.next());
        System.out.println("Ingrese cantidad de dias por semana");
        crear.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese la cantidad de horas por día");
        crear.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        crear.setPrecioPorHora(leer.nextInt());
        System.out.println("Ingrese el turno mañana o tarde");
        crear.setTurno(leer.next());

        cargarAlumnos();

    }
    
    /*
         Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
        en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
        día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
        se repite el encuentro.
    */
    public double calcularGananciaSemanal(Curso cal){
        double res = cal.getCantidadHorasPorDia()* cal.getPrecioPorHora()* cal.getAlumnos().length* cal.getCantidadDiasPorSemana();
        
        return res;
    }
    

}
