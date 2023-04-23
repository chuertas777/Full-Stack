/*
 * 

 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author CamiloH
 */
public class ServMatematica {

    /*
        a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
     */
    public void devolverMayor(double num1, double num2) {
        System.out.println("El numero mayor entre: " + String.format("%.2f",num1) + " y " + String.format("%.2f",num2) + " es: " + String.format("%.2f", Math.max(num1, num2)));
    }
    /*
        b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor número. Previamente se deben redondear ambos valores.
    
     */
    public void calcularPotencia(double num1, double num2) {
        double a = Math.round(num1);
        double b = Math.round(num2);

        System.out.println("La potencia entre  " + String.format("%.2f",Math.max(a, b)) + " y " + String.format("%.2f",Math.min(a, b)) + " es: : " + String.format("%.2f", Math.pow(Math.max(a, b), Math.min(a, b))));

    }

    /*
        c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 
     */
    public void calculaRaiz(double num1, double num2) {
        double abs1 = Math.abs(num1);
        double abs2 = Math.abs(num2);

        System.out.println("La raíz cuadrada de " + String.format("%.2f", Math.min(abs1, abs2)) + " es:  " + Math.sqrt(Math.min(abs1, abs2)));

    }
}
