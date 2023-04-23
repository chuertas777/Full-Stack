/*
 *  
      
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.CtaBancaria;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServCtaBancaria {

    /*
        c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
     */
    Scanner leer = new Scanner(System.in);
    

    public CtaBancaria crearCuenta() {
        CtaBancaria cta = new CtaBancaria();
        System.out.println("Bienvenido al Banco de Java");
        System.out.println("Ingrese el número de cuenta bancaria ");
        cta.setNumerocta(leer.nextInt());
        System.out.println("Ingrese el número de identificación o DNI ");
        cta.setDni(leer.nextLong());
        System.out.println("Ingrese el saldo de su cuenta ");
        cta.setSaldo(leer.nextInt());
        System.out.println("Ingrese el porcentaje de interes ");
        cta.setInteres(leer.nextDouble());

        return cta;

    }

    /*
        d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
    
     */
    public void depositar(CtaBancaria depositar) {
        double depo = leer.nextDouble();
        System.out.println("Ingrese la cantidad de dinero a ingresar ");
        depositar.setSaldo(depo + depositar.getSaldo());
        System.out.println("Su saldo actual es: " + depositar.getSaldo());
    }

    /*
        e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
        la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        pondrá el saldo actual en 0.
    
     */
    
    
    
    
}
