/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ext_ejercicio4;

import Entidades.Estudiante;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import Entidades.SistemaGestionFacultad;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class Ext_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        SistemaGestionFacultad estudiante = new Estudiante(
                "matematicas", "erik", "narvaez", 
                123456, "soltero");
        SistemaGestionFacultad profesor = new Profesor("literatura",
                "kleyden", "baez", 1234, "casado", 
                1990, 1);
        SistemaGestionFacultad pServicio = new PersonalServicio(
                "biblioteca", "reyna", "reynosa", 
                12345, "soltera", 2000, 2);

        String op = "";

        int bandera = 7;
        int p = 0;
        do {
                

            System.out.println("Menú");
            System.out.println("1.-CAMBIO DE ESTADO CIVIL ");
            System.out.println("2.-REASIGNACIÓN DE DESPACHO ");
            System.out.println("3.-MATRICULACIÓN DE UN ESTUDIANTE ");
            System.out.println("4.-CAMBIO DE DEPARTAMENTO ");
            System.out.println("5.-TRASLADO DE SECCIÓN DEL PERSONAL SERVICIO");
            System.out.println("6.-MOSTRAR DATOS ");
            System.out.println("7.-SALIR");

             p = leer.nextInt();

            switch (p) {
                case 1:
                    System.out.println("A que persona desea cambiar el estado civil? "
                            + "Estudiante, profesor o pservicio ");
                    op = leer.next();
                    if (op.equalsIgnoreCase("estudiante")) {
                        estudiante.cambioEstadoCivil();

                    } else if (op.equalsIgnoreCase("profesor")) {
                        profesor.cambioEstadoCivil();
                    } else if (op.equalsIgnoreCase("pservicio")) {
                        pServicio.cambioEstadoCivil();
                    } else {
                        System.out.println("Opción incorrecta ");
                    }
                    break;
                case 2:
                    pServicio.reasignacionDespacho();
                    profesor.reasignacionDespacho();
                    break;
                case 3:
                    estudiante.matriculaEstudiante();
                    break;
                case 4:
                    profesor.cambioDepartamento();
                    break;
                case 5:
                    pServicio.trasladoSeccion();
                case 6:
                    System.out.println(estudiante);
                    System.out.println("-------------");
                    System.out.println(profesor);
                    System.out.println("-------------");
                    System.out.println(pServicio);
                    System.out.println("-------------");
                default:
                    System.out.println("Opción incorrecta");
                    ;
            }

        } while (bandera != p);

    }

}
