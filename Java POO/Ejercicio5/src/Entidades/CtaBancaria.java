/*
 * *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
   numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
   Las operaciones asociadas a dicha clase son:
   a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
   b) Agregar los métodos getters y setters correspondientes
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class CtaBancaria {
    
    private int numerocta;
    private long dni;
    private double saldo;
    private double interes; 
    
    public CtaBancaria() {
    }

    public CtaBancaria(int numerocta, long dni, double saldo, double interes) {
        this.numerocta = numerocta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumerocta() {
        return numerocta;
    }

    public void setNumerocta(int numerocta) {
        this.numerocta = numerocta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }
    
    
    
}
