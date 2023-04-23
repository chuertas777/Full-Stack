/*
 *     Crear una entidad Movil con los atributos
       marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
       un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
       correspondiente al código.
       A continuación, se implementarán los siguientes métodos:
        Un constructor por defecto.
        Un constructor con todos los atributos como parámetro.
        Métodos getters y setters de cada atributo.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author CamiloH
 */
public class Movil {
    
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int disco;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int disco) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.disco = disco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", disco=" + disco + ", codigo=" + Arrays.toString(codigo) + '}';
    }

    
    
    
    
}
