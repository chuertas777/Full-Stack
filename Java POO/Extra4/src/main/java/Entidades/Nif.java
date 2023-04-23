/*
 *     4. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
       correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
       letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
        Métodos getters y setters para el número de DNI y la letra.
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Nif {
    
    private long dni;
    private String letra;

    public Nif() {
    }

    public Nif(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
