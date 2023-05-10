
package Entidades;

public class Perro {
        
         private String nombre,raza;
         private int edad;
         private double tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
         
         
         
     
}
