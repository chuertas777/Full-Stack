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
    private boolean mojado = false;

    public boolean disparo(RevolverAgua r) {
        System.out.println(r);
        if (r.mojar()) {
            mojado = true;
        } else {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("numJ=").append(numJ);
        sb.append(", nombre=").append(nombre);
        sb.append(", mojado=").append(mojado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    

}
