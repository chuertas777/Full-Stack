/*
 *     Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
       un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
       está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
       ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
       la lista ordenada.
 */
package Servicios;

import Entidades.Perro;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServPerro {

    Scanner leer = new Scanner(System.in);
    Perro pe = new Perro();

    public void crearPerro() {
        String letra = "";

        do {
            System.out.println("Ingrese la raza del perro");
            pe.setRaza(leer.nextLine());
            pe.setRazas(pe.getRaza());
            System.out.println("�Desea ingresar otra raza de perro? \n  Y para Si o N para No ");
            letra = leer.nextLine();

            do {
                if (!letra.equalsIgnoreCase("y") && !letra.equalsIgnoreCase("n")) {
                    System.out.println("Letra incorrecta, vuelva a ingresar ");
                    letra = leer.nextLine();
                } else {
                    break;
                }
            } while (true);

        } while (letra.equals("y"));
        System.out.println("Gracias por ingresar las razas de perros, vuelva pronto");

        for (String razaP : pe.getRazas()) {
            System.out.println("Raza: " + razaP);

        }
        System.out.println("Ingrese el nombre de la raza a buscar: ");
        String razab = leer.nextLine();
        Iterator<String> buscar = pe.getRazas().iterator();

        while (buscar.hasNext()) {
            if (buscar.next().equals(razab)) {
                buscar.remove();
                System.out.println("Raza eliminada " + razab);
                for (String listaP : pe.getRazas()) {
                    System.out.println("Raza: " + listaP);
                }

                break;
            } else {
                System.out.println("La raza no se encuentra en la lista ");
                System.out.println("Raza es: " + razab);
            }

        }

    }

}
