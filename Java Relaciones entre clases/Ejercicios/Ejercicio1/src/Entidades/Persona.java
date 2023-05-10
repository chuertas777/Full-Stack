
package Entidades;


public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int doc;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int doc, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.doc = doc;
        this.perro = perro;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("\nnombre=").append(nombre);
        sb.append("\nApellido=").append(apellido);
        sb.append("\nEdad=").append(edad);
        sb.append("\nDoc=").append(doc);
        sb.append("\nPerro=").append(perro.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
