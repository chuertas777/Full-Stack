/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Fracciones {
    
        private double numerador1;
    private double numerador2;
    private double denominador1;
    private double denominador2;

    public Fracciones() {
    }

    public Fracciones(double numerador1, double numerador2, double denominador1, double denominador2) {
        this.numerador1 = numerador1;
        this.numerador2 = numerador2;
        this.denominador1 = denominador1;
        this.denominador2 = denominador2;
    }

    public double getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(double numerador1) {
        this.numerador1 = numerador1;
    }

    public double getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(double numerador2) {
        this.numerador2 = numerador2;
    }

    public double getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(double denominador1) {
        this.denominador1 = denominador1;
    }

    public double getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(double denominador2) {
        this.denominador2 = denominador2;
    }

    
    
}
