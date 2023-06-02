/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double Precio, String color, char consumo, double peso) {
        super(Precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(double Precio) {
        super.setPrecio(Precio);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public char getConsumo() {
        return super.getConsumo();
    }

    @Override
    public void setConsumo(char consumo) {
        super.setConsumo(consumo);
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lavadora{");
        sb.append("\ncarga=").append(carga);
        sb.append("\n Precio=").append(Precio);
        sb.append("\n color='").append(color).append('\'');
        sb.append("\n consumo=").append(consumo);
        sb.append("\n peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
}
