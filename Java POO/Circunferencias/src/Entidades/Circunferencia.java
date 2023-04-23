/*
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Circunferencia {
    
    //Atributo privado
    private double radio;

    //Constructor por defecto
    public Circunferencia() {
    }

    //Constructor por parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    
    //Get del atributo creado
    public double getRadio() {
        return radio;
    }
    
    //Set del atributo creado
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
}
