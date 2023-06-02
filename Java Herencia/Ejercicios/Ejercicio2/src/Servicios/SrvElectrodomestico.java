package Servicios;


import Entidades.Electrodomestico;

import java.util.Scanner;

public class SrvElectrodomestico extends Electrodomestico {


    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Bienvenido a su tienda de electrodomesticos ");

        System.out.println("¿De que color desea su electrodomestico?");
        System.out.println("Colores disponibles son: blanco, negro, rojo, azul y gris.");
        System.out.println("Ingrese el color: ");
        this.setColor(leer.next().toUpperCase());
        comprobarColor(this.getColor());
        System.out.println("La lista de consumo energetico esta dada sobre la siguiente lista ");
        System.out.println(" letra " + "   precio  ");
        System.out.println("   A " + "     $1000  ");
        System.out.println("   B " + "     $800  ");
        System.out.println("   C " + "     $600  ");
        System.out.println("   D " + "     $500  ");
        System.out.println("   E " + "     $300  ");
        System.out.println("   F " + "     $100  ");
        System.out.println(" De acuerdo a la anterior tabla Ingrese la letra correspondiente A,B,C,D,E,F del " +
                "consumo energetico");
        this.setConsumo(leer.next().toUpperCase().charAt(0));
        comprobarConsumoEnergetico(this.getConsumo());

        System.out.println("Ingrese el peso del electrodomestico tenga presente la siguiente tabla");
        System.out.println("       PESO        " + "  PRECIO  ");
        System.out.println(" Entre 1 y 19 kg " + "     $100  ");
        System.out.println(" Entre 20 y 49 kg " + "    $500  ");
        System.out.println(" Entre 50 y 79 kg " + "    $800  ");
        System.out.println(" Mayor que 80 kg " + "     $1000  ");
        this.setPeso(leer.nextDouble());
        this.Precio = 1000;


    }


    //Este método permite comprobar el consumo energetico que utiliza el thisctrodomestico
    public void comprobarConsumoEnergetico(char letra) {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean encontrado = false;

        for (char m : letras) {
            String letter = String.valueOf(letra);
            String letter1 = String.valueOf(m);
            if (letter.equalsIgnoreCase(letter1)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            this.consumo = letra;
        } else {
            this.consumo = 'F';
        }

    }

    public void comprobarColor(String color) {
        String[] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        boolean encontrado = false;

        for (String colore : colores) {
            if (colore.equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = "BLANCO";
        }

    }


    public double precioFinal() {

        switch (this.getConsumo()) {
            case 'A':
                this.setPrecio(this.getPrecio() + 1000);
                break;
            case 'B':
                this.setPrecio(this.getPrecio() + 800);
                break;
            case 'C':
                this.setPrecio(this.getPrecio() + 600);
                break;
            case 'D':
                this.setPrecio(this.getPrecio() + 500);
                break;
            case 'E':
                this.setPrecio(this.getPrecio() + 300);
                break;
            case 'F':
                this.setPrecio(this.getPrecio() + 100);
                break;

        }

        if (this.getPeso() >= 1 && this.getPeso() <= 19) {
            this.setPrecio(this.getPrecio() + 100);
        }

        if (this.getPeso() >= 20 && this.getPeso() <= 49) {
            this.setPrecio(this.getPrecio() + 500);
        }
        if (this.getPeso() >= 50 && this.getPeso() <= 79) {
            this.setPrecio(this.getPrecio() + 800);
        }
        if (this.getPeso() >= 80) {
            this.setPrecio(this.getPrecio() + 1000);
        }
        return this.getPrecio();
    }


}
