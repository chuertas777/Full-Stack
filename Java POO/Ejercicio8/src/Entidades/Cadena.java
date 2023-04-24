/*
 *  
 */
package Entidades;

/**
 *
 * @author CamiloH
 * 
 */

/*
    Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
    String) y su longitud.
*/
public class Cadena {

    private String frase;
    private int cadena;

    public Cadena() {
    }

    public Cadena(String frase, int cadena) {
        this.frase = frase;
        this.cadena = cadena;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getCadena() {
        return cadena;
    }

    public void setCadena(int cadena) {
        this.cadena = cadena;
    }

}
