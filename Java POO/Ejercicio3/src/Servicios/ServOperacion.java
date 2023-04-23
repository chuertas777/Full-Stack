/*
 * 
    
    

    
    
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServOperacion {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public Operacion crearOperacion() {

        Operacion oper = new Operacion();
        System.out.println("Ingrese el primer número: ");
        oper.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo número: ");
        oper.setNum2(leer.nextInt());

        return oper;

    }

    // e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void calcularSuma(Operacion ope1) {

        ope1.setRes(ope1.getNum1() + ope1.getNum2());
        System.out.println("La suma entre los dos números es: " + ope1.getRes());

    }

    // f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void calcularResta(Operacion ope2) {
        ope2.setRes(ope2.getNum1() - ope2.getNum2());
        System.out.println("La resta entre los dos números es: " + ope2.getRes());

    }

    /*
        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
        fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
        Si no, se hace la multiplicación y se devuelve el resultado al main
     */
    public void calcularMulti(Operacion ope3) {
        if (ope3.getNum1() == 0 || ope3.getNum2() == 0) {
            System.out.println("Esta intentando realizar una multiplicación por cero ");
        } else {
            ope3.setRes(ope3.getNum1() * ope3.getNum2());
            System.out.println("La multiplicación entre los dos números es: " + ope3.getRes());
        }

    }

    /*
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
        una división por cero, el método devuelve 0 y se le informa al usuario el error se le
        informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    public void calcularDivi(Operacion ope4) {
        if(ope4.getNum2() == 0){
            System.out.println("Esta intentando realizar una división por cero ");
        
        } else{
            ope4.setRes(ope4.getNum1() / ope4.getNum2());
            System.out.println("El resultado de la división es: " + ope4.getRes());
        
        }
    }

}
