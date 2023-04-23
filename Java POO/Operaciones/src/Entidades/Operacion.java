/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
    numero2. A continuación, se deben crear los siguientes métodos:
    a) Método constructor con todos los atributos pasados por parámetro.
    b) Metodo constructor sin los atributos pasados por parámetro.
    c) Métodos get y set.
    
 */
package Entidades;

/**
 *
 * @author CamiloH
 */

    // Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2
public class Operacion {
    
    private double num1;
    private double num2;
    private double res;

    
    
    // Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

    // Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        
    }
    
    // Métodos get y set.

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    
    
    
    
    
}
