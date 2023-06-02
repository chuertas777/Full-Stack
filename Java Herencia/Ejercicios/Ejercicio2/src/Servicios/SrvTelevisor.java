package Servicios;

import Entidades.Televisor;

import java.util.Scanner;

public class SrvTelevisor extends SrvElectrodomestico {

   Televisor tv = new Televisor();

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ---------- Elegir caracteristicas del Televisor --------------");
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas de su Televisor ");
        tv.setPulgadas(leer.nextInt());
        System.out.println("Desea ingresar un sintonizador TDT para su televisor (true/false)");
        tv.setSintonizadorTDT(leer.nextBoolean());
    }

    @Override
    public double precioFinal() {
        if (tv.getPulgadas() > 40) {
            this.setPrecio(this.getPrecio() * 1.3);
        }

        if (tv.isSintonizadorTDT()) {
            this.setPrecio(this.getPrecio() + 500);
        }

        return super.precioFinal();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Televisor {");
        sb.append("\n Precio Final: ").append("$").append(this.Precio);
        sb.append("\n Color: ").append(this.getColor());
        sb.append("\n Consumo energetico: ").append(this.getConsumo());
        sb.append("\n Peso: ").append(this.getPeso()).append("kg ");
        sb.append('}');
        return sb.toString();
    }


}
