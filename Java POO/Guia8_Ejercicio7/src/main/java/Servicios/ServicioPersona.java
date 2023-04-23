package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner read = new Scanner(System.in);
    Persona person = new Persona();

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre: ");
        person.setNombre(read.next());
        System.out.println("Ingrese su edad: ");
        person.setEdad(read.nextInt());
        System.out.println("Ingrse el sexo ('H' hombre, 'M' mujer, 'O' otro): ");
        person.setSexo(read.next());
        System.out.println("Ingrese el peso: ");
        person.setPeso(read.nextDouble());
        System.out.println("Ingese su altura: ");
        person.setAltura(read.nextDouble());
        return person;
    }

    public double calcularIMC(Persona imc) {

        double indice = imc.getPeso() / Math.pow(imc.getAltura(), 2);

        if (indice < 20) {
            System.out.println("La persona" + imc.getNombre() + " esta por debajo del peso ideal, con un peso de: " + imc.getPeso());
            return -1;

        } else if (indice >= 20 && indice <= 25) {
            System.out.println("La persona" + imc.getNombre() + " esta por en el peso ideal, con un peso de: " + imc.getPeso());
            return 0;

        } else if (indice > 25) {
            System.out.println("La persona" + imc.getNombre() + " esta por encima peso ideal, con un peso de: " + imc.getPeso());
            return 1;

        } else {
            return 2;
        }

    }

    public boolean esMayorDeEdad(Persona mayorEdad) {
        boolean mayoria = false;
        if (mayorEdad.getEdad() >= 18) {
            mayoria = true;
        }
        return mayoria;
    }

}
