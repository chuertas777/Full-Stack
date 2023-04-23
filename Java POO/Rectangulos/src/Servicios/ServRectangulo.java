/*
 *  
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServRectangulo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
        La clase incluirá un método para crear el rectángulo
        con los datos del Rectángulo dados por el usuario.
     */
    public Rectangulo crearRectangulo() {
        Rectangulo rect = new Rectangulo();

        System.out.println("Ingresa el valor de la base: ");
        rect.setBase(leer.nextDouble());
        System.out.println("Ingrese el valor de la altura: ");
        rect.setAltura(leer.nextDouble());

        return rect;
    }

    /*
        También incluirá un método para calcular la superficie del rectángulo
     */
    public void calcularRect(Rectangulo superficie) {
        superficie.setReslt(superficie.getBase() * superficie.getAltura());
        System.out.println("El resultado de la superficie del rectangulo es: " + superficie.getReslt());

    }

    /*
        y un método para calcular el perímetro del rectángulo.
     */
    public void calcularPeri(Rectangulo perimetro) {
        perimetro.setReslt((perimetro.getBase() + perimetro.getAltura()) * 2);
        System.out.println("El resultado del perimetro del rectangulo es: " + perimetro.getReslt());

    }

    /*
        Por último, tendremos un método que dibujará el rectángulo mediante
        asteriscos usando la base y la altura.
     */
    public void dibujarRect(Rectangulo dibujo) {

        int a = (int) dibujo.getBase();
        int b = (int) dibujo.getAltura();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" Rectangulo dibujado");
        System.out.println(" ");

        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }

}
