/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
   (Tipo Date), constructor vacío, constructor parametrizado, get y set.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author CamiloH
 */
public class Persona {
    
    private String nombre;
    private LocalDate fechaN;
    

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaN) {
        this.nombre = nombre;
        this.fechaN = fechaN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    
    
    
    
    
}
