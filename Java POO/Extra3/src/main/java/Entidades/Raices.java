/*
 *  Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
   ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
   Hay que insertar estos 3 valores para construir el objeto a través de un método
   constructor.
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Raices {
    
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
}
