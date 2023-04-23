/*
 * 
    
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Cafetera {

    /*
        Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
        (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
        cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
        métodos:
         Constructor predeterminado o vacío
         Constructor con la capacidad máxima y la cantidad actual

     Métodos getters y setters.
    
     */
    private double capMax = 2000;
    private double cantActual = 0;

    public Cafetera() {
    }

    public Cafetera(double capMax, double cantActual) {
        this.capMax = capMax;
        this.cantActual = cantActual;
    }

    public double getCapMax() {
        return capMax;
    }

    public void setCapMax(double capMax) {
        this.capMax = capMax;
    }

    public double getCantActual() {
        return cantActual;
    }

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }

}
