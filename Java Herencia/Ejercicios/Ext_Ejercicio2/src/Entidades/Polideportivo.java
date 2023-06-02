/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean estado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean estado, double ancho, double 
            largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        System.out.println("El polideportivo " + nombre + " tiene una superficie: "
                + "" + ancho * largo );
        
    }

    @Override
    public void calcularVolumen(double ancho, double largo, double alto) {
        System.out.println("El polideportivo " + nombre + " tiene un volumen: "
                + ancho * largo * alto);
    }

}
