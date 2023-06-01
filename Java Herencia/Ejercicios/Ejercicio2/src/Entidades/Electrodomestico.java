/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Electrodomestico {

    protected double Precio;
    protected String color;
    protected char consumo;
    protected double peso;
    
    public Electrodomestico() {
    }

    public Electrodomestico(double Precio, String color, char consumo, double peso) {
        this.Precio = Precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
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
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean encontrado = false;

        for (String colore : colores) {
            if (colore.equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }

    }

    public void crearElectrodomestivo() {
        
    }

    public void precioFinal() {

    }

}
