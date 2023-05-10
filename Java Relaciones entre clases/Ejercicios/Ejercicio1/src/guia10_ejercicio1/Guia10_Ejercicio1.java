package guia10_ejercicio1;

import Entidades.Perro;
import Entidades.Persona;

public class Guia10_Ejercicio1 {

    public static void main(String[] args) {

        //   Perro perro1 =new Perro("Franki","Pitbull",1,30);
        Persona person1 = new Persona("Jhon", "Benabides", 21, 151651,
                new Perro("Franki", "Pitbull", 1, 30));
        Persona person2 = new Persona("Camilo", "Huertas", 32, 848916,
                new Perro("Rambo", "Pitbull", 1, 30));

        System.out.println(person1 + "\n \n "  + person2);
        
    }

}
