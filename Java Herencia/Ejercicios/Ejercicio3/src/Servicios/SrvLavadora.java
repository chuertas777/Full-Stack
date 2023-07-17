package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

public class SrvLavadora extends SrvElectrodomestico {

    Lavadora lavadora = new Lavadora();

    @Override
    public double precioFinal(Electrodomestico electrodomestico) {
        if (lavadora.getCarga() > 30) {
            this.setPrecio(this.getPrecio() + 500);
        }
        return super.precioFinal(electrodomestico);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n Lavadora {");
        sb.append("\n Precio Final: ").append("$").append(this.Precio);
        sb.append("\n Color: ").append(this.getColor());
        sb.append("\n Consumo energetico: ").append(this.getConsumo());
        sb.append("\n Peso: ").append(this.getPeso()).append("Kg ");
        sb.append("\n Nivel de carga: ").append(lavadora.getCarga()).append("Lb ");
        sb.append("\n  ");
        sb.append('}');
        
        return sb.toString();
    }

}
