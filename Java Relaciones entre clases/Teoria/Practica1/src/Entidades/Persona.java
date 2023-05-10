/*
 *  EJERCICIO PERSONA
    Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
    objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
    acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class Persona {
    private String nombre;
    private String apellido;
    
    private Dni dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Persona{");
        sb.append("\n nombre=" ).append(nombre);
        sb.append(" \n apellido=").append(apellido);
        sb.append("\n dni=").append(dni.getSerie() + "-" +  dni.getNumero());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
    
    
}
