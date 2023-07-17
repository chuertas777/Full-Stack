/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Televisor extends Electrodomestico{

    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizadorTDT, double Precio, String color, char consumo, double peso) {
        super(Precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
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
        final StringBuffer sb = new StringBuffer("Televisor{");
        sb.append("\npulgadas=").append(pulgadas);
        sb.append("\n sintonizadorTDT=").append(sintonizadorTDT);
        sb.append("\n Precio=").append(Precio);
        sb.append("\n color='").append(color).append('\'');
        sb.append("\n consumo=").append(consumo);
        sb.append("\n peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
}
