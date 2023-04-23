/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPass {

    /*
        Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
        teclado)
     */
    Pass pa = new Pass();
    Scanner leer = new Scanner(System.in);

    public void datosUsuario(String pass, String nombre, int dni) {
        pa.setPass(pass);
        pa.setNombre(nombre);
        pa.setDni(dni);
    }

    /*
        Crear un método para ingresar una contraseña (crearPass). En este método, debemos
    validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
    Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.

     */
    public void crearPass(String contra) {
        do {
            if (contra.length() == 10) {
                System.out.println("Es correcto");
                pa.setPass(contra);

            } else {
                System.out.println("Incorrecto");
            }

        } while (contra.length() != 10);

    }

    /*
        Crear un método para analizar la contraseña(analizarPass). Donde:
        o SI Existe al menos una letra z : Es nivel MEDIO
        o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
        o Si ninguna condición se cumple es nivel BAJO
     */
    public void analizaPass() {
        int cont = 0;
        /*
        for (int i = 0; i < pa.getPass().length(); i++) {
            if (pa.getPass().substring(i, i + 1).equals("a")) {
                cont ++;
            }

        }
         */
        cont = pa.getPass().length() - pa.getPass().replace("a", "").length();

        if (pa.getPass().contains("z")) {
            System.out.println("Es nivel MEDIO ");

        } else if (pa.getPass().contains("z") && cont == 2) {
            System.out.println("Es nivel ALTO");
        } else {
            System.out.println("Es nivel BAJO");
        }

    }

    /*
        Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
        debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
        acceso a modificar los datos.
        
        
        
     */
    public void modificarNombre(String password) {
        if (pa.getPass().equals(password)) {
            System.out.println("Modifique su nombre: ");
            pa.setNombre(leer.next());
        } else {
            System.out.println("Error en contraseña ");
        }

    }

    public void modificarDni(String password) {
        if (pa.getPass().equals(password)) {
            System.out.println("Modifique su DNI: ");
            pa.setDni(leer.nextInt());
        } else {
            System.out.println("Error en contraseña ");
        }

    }

    public void modificarContraseña(String password) {

        if (pa.getPass().equals(password)) {
            System.out.println("Modifique su Contraseña: ");
            crearPass(leer.next());

        } else {
            System.out.println("Error en contraseña ");
        }

    }

    /*
        A través de un menú de opciones:
        o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
        contraseña valida).
        o B) Mensaje al usuario que tipo de NIVEL es su contraseña
        o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
        dar permiso
        o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
        SINO impedir cambios
        o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
        SINO impedir cambios
     */
    public void menu() {
        char letra;
        System.out.println("Elija la opción ");
        System.out.println(" A para ingresar contraseña ");
        System.out.println(" B verificar el nivel de su contraseña");
        System.out.println(" C para modificar contraseña ");
        System.out.println(" D para modificar nombre ");
        System.out.println(" E para modificar DNI ");
        switch (leer.next().toUpperCase().charAt(0)) {
            case 'A':
                System.out.println("Definir una contraseña");
                crearPass(leer.next());
                break;
            case 'B':
                analizaPass();
                break;
            case 'C':
                System.out.println("Ingrese su contraseña anterior");
                modificarContraseña(leer.next());
                break;
            case 'D':
                System.out.println("Ingrese su contraseña ");
                modificarNombre(leer.next());
                break;
            case 'E':
                System.out.println("Ingrese su contraseña ");
                modificarDni(leer.next());
                break;

            default:
                break;
        }

    }

}
