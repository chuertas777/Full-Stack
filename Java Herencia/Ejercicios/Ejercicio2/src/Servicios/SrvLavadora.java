package Servicios;


import Entidades.Lavadora;

import java.util.Scanner;

public class SrvLavadora extends SrvElectrodomestico {

    Lavadora lavadora = new Lavadora();

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);

        System.out.println(" ---------- Elegir caracteristicas de la Lavadora --------------");
        crearElectrodomestico();
        System.out.println("Ingrese el nivel de carga que tiene su lavadora");
        lavadora.setCarga(leer.nextInt());

    }

    @Override
    public double precioFinal() {
        if (lavadora.getCarga() > 30) {
            this.setPrecio(this.getPrecio() + 500);
        }
        return super.precioFinal();

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lavadora {");
        sb.append("\n Precio Final: ").append("$").append(this.Precio);
        sb.append("\n Color: ").append(this.getColor());
        sb.append("\n Consumo energetico: ").append(this.getConsumo());
        sb.append("\n Peso: ").append(this.getPeso()).append("Kg ");
        sb.append("\n Nivel de carga: ").append(lavadora.getCarga()).append("Lb ");
        sb.append('}');
        return sb.toString();
    }

}
