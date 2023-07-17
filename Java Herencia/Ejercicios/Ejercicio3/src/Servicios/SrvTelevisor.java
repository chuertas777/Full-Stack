package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;


public class SrvTelevisor extends SrvElectrodomestico {

   Televisor tv = new Televisor();


    @Override
    public double precioFinal(Electrodomestico electrodomestico) {
        if (tv.getPulgadas() > 40) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() * 1.3);
        }

        if (tv.isSintonizadorTDT()) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
        }

        return super.precioFinal(electrodomestico);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n Televisor {");
        sb.append("\n Precio Final: ").append("$").append(this.Precio);
        sb.append("\n Color: ").append(this.getColor());
        sb.append("\n Consumo energetico: ").append(this.getConsumo());
        sb.append("\n Peso: ").append(this.getPeso()).append("kg ");
        sb.append("\n  ");
        sb.append('}');
        
        return sb.toString();
    }


}
