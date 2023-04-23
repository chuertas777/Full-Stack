/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Ahorcado {
    
    private char[] palabra;
    private int cantl;
    private int cantm;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantl, int cantm) {
        this.palabra = palabra;
        this.cantl = cantl;
        this.cantm = cantm;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantl() {
        return cantl;
    }

    public void setCantl(int cantl) {
        this.cantl = cantl;
    }

    public int getCantm() {
        return cantm;
    }

    public void setCantm(int cantm) {
        this.cantm = cantm;
    }
    
    
    
}
