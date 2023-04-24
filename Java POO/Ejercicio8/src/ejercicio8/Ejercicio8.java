/*
 * En el main se creará el objeto y se le pedirá al usuario que ingrese
    una frase que puede ser una palabra o varias palabras separadas por un espacio en
    blanco y a través de los métodos set, se guardará la frase y la longitud de manera
    automática según la longitud de la frase ingresada. Deberá además implementar los
    siguientes métodos:
 */
package ejercicio8;

import Entidades.Cadena;
import Servicios.ServCadena;

/**
 *
 * @author CamiloH
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServCadena srv = new ServCadena();

        Cadena cad = srv.crearFrase();
        srv.mostrarVocales(cad);
        srv.invertirFrase(cad);
        srv.vecesRepetido(cad);
        srv.compararLongitud(cad);
        srv.unirFrases(cad);
        srv.contiene(cad);
    }

}
