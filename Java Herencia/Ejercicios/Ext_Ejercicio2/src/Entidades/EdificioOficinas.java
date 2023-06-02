/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * @author CamiloH
 */
public class EdificioOficinas extends Edificio {

    private int npisos;
    private int noficinas;
    private int cantpersonas;


    public EdificioOficinas() {
    }

    public EdificioOficinas(int npisos, int noficinas, int cantpersonas, double ancho,
                            double largo, double alto) {
        super(ancho, largo, alto);
        this.npisos = npisos;
        this.noficinas = noficinas;
        this.cantpersonas = cantpersonas;

    }

    public int getNpisos() {
        return npisos;
    }

    public void setNpisos(int npisos) {
        this.npisos = npisos;
    }

    public int getNoficinas() {
        return noficinas;
    }

    public void setNoficinas(int noficinas) {
        this.noficinas = noficinas;
    }

    public int getCantpersonas() {
        return cantpersonas;
    }

    public void setCantpersonas(int cantpersonas) {
        this.cantpersonas = cantpersonas;
    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        System.out.println("La superficie del edificio de oficinas " + (ancho *
                largo * npisos));
    }

    @Override
    public void calcularVolumen(double ancho, double largo, double alto) {
        System.out.println("El volumen del edificio de oficinas " + ancho *
                largo * npisos);
    }

    public void cantPersonas() {
        System.out.println("En un piso entran " + cantpersonas * noficinas);
        System.out.println("En el edificio el total de personas son: " + cantpersonas
                * noficinas * npisos);
    }


}
