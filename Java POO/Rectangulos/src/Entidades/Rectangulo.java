/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. 
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    private double reslt;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setReslt(double reslt) {
        this.reslt = reslt;
    }

    public double getReslt() {
        return reslt;
    }
    
    
    
}
