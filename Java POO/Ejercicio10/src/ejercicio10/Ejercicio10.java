/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, , y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
 */
package ejercicio10;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author CamiloH
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] vector1 = new double[50];
        double[] vector2 = new double[20];
        
        Random aleatorio = new Random();
        
        Arrays.setAll(vector1, (i) -> aleatorio.nextDouble()*10);
        
        Arrays.setAll(vector2, (i) -> aleatorio.nextDouble());
        
        
        //System.out.println(String.format("%.3f",Arrays.toString(vector1)));
        //System.out.format("%s", Arrays.toString(vector1));
        DecimalFormat df = new DecimalFormat("0.00");
        Arrays.stream(vector1).forEach(e -> System.out.print(df.format(e) + " \n " ));    
        System.out.println(" --------------------------------------- ");
        
        /*
            el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
            ordenados al arreglo B de 20 elementos
        */
        Arrays.sort(vector1);
        Arrays.stream(vector1).forEach(e -> System.out.print(df.format(e) + " \n " )); 
        
        System.out.println(" --------------------------------------- ");
        System.arraycopy(Arrays.copyOf(vector1, 10), 0, vector2, 0, 10);
        Arrays.fill(vector2, 10, 20, 0.5);
        Arrays.stream(vector2).forEach(e -> System.out.print(df.format(e) + " \n " ));     
    }
    
}
