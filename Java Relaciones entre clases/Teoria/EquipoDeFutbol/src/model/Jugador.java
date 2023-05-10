package model;

/**
 *
 * @author QuinSDev
 */
public class Jugador {
    
    private String nombre, apellido, posicion;
    private int numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append("\nApellido: ").append(apellido);
        sb.append("\nPosición: ").append(posicion);
        sb.append("\nNúmero: ").append(numero);
        sb.append("\n");
        return sb.toString();
    }
    
    
    
}
