/*
 *  Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
    constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
    además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
    Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
    animas a simular el paso del tiempo en consola??????
 */
package Servicios;

import Entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServTiempo {
    
    Tiempo t = new Tiempo();
    Scanner leer = new Scanner(System.in);
    
    public void crearTiempo(int hora, int minuto, int segundos){
        System.out.print("Ingrese la hora: ");
        t.setHora(leer.nextInt());
        System.out.print("Ingrese los minutos: ");
        t.setMinutos(leer.nextInt());
        System.out.println("Ingrese los segundos: ");
        t.setSegundos(leer.nextInt());
    
    }
    
    public void imprimirHoraCompleta(){
        
    
    }
    
}
