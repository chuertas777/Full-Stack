package Servicios;

import Entidades.Electrodomestico;

public class SrvElectrodomestico extends Electrodomestico {

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
    /*

    public void crearElectrodomestico() {

        comprobarColor(this.getColor());

        comprobarConsumoEnergetico(this.getConsumo());

        this.setPeso(this.getPeso());

    }
    */

    public double precioFinal(Electrodomestico electrodomestico) {
        double precio = electrodomestico.getPrecio();
        
        switch (electrodomestico.getConsumo()) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;

        }
        
        double peso = electrodomestico.getPeso();

        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }

        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }
        if (peso >= 80) {
            precio += 1000;
        }
        return precio;
    }

}
