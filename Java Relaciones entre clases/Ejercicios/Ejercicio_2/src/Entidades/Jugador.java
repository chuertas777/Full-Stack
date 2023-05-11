/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Jugador {

    private int numJ;
    private String nombre;
    private boolean mojado = true;

    public boolean disparo(RevolverAgua r) {

        if (r.mojar() == true) {
            mojado = false;
        } else {
            mojado = true;
            r.siguienteChorro();
        }

        return mojado;
    }

    public Jugador() {
    }

    public Jugador(int numJ, String nombre) {
        this.numJ = numJ;
        this.nombre = nombre;
    }

    public int getNumJ() {
        return numJ;
    }

    public void setNumJ(int numJ) {
        this.numJ = numJ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    
    

}
