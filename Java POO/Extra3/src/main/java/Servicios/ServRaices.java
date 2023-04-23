/*
 * Luego, las operaciones que se podrán realizar son las siguientes:
   
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServRaices {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearRaiz(){
        Raices ra = new Raices();
        System.out.print("Ingrese el valor de a: ");
        ra.setA(leer.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        ra.setB(leer.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        ra.setC(leer.nextDouble());
        
        
        
        return ra;
    
    }

    /*
         Método getDiscriminante(): devuelve el valor del discriminante (double). El
        discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices dis) {
        //(b^2)-4*a*c

        double calcular = ((Math.pow(dis.getB(), 2)) - 4 * dis.getA() * dis.getC());

        return calcular;

    }

    /*
         Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
   que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices tener) {
        if (getDiscriminante(tener) >= 0) {
            
            return true;

        } else {
            return false;

        }

    }

    /*
         Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
        que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices tiene) {
        if (getDiscriminante(tiene) == 0) {
            return true;
        } else {
            return false;
        }

    }

    /*
         Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
        posibles soluciones.
        Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
            delante de -b
     */
    public boolean obtenerRaices(Raices obtener) {
        if (tieneRaices(obtener) == true) {
            double sol1, sol2;
            sol1 = (-obtener.getB()+ (Math.sqrt((Math.pow(obtener.getB(), 2)- (4*obtener.getA()*obtener.getC()) / (2*obtener.getA())))) );
            sol2 = (-obtener.getB()- (Math.sqrt((Math.pow(obtener.getB(), 2)- (4*obtener.getA()*obtener.getC()) / (2*obtener.getA())))) );
            System.out.println("Solución 1: " + sol1);
            System.out.println("Solución 2: " + sol2);
            return true;

        } else {
            return false;
        }

    }
    
    /*
         Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
        Es en el caso en que se tenga una única solución posible.
    */
    public void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz) == true) {
            System.out.println("Unica raíz: " + tieneRaiz(raiz) );
        } else{
            System.out.println("No tiene una única raíz "); 
        } 
        
    }
    
    /*
         Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
        de no existir solución, se mostrará un mensaje.
    */
    public void calcular(Raices cal){
        
        if (tieneRaices(cal) == true ) {
            System.out.println("Calculando... si tiene raices" );
        } else if(tieneRaiz(cal) == true){
            System.out.println("Calculando... si tiene raiz");
        } else {
            System.out.println("No tiene solución");
        }
        
        
        
        
    
    }
    
    

}
