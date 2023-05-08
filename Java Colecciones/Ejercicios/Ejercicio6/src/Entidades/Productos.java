/*
 * Se necesita una aplicaci�n para una tienda en la cual queremos almacenar los distintos 
    productos que venderemos y el precio que tendr�n. Adem�s, se necesita que la 
    aplicaci�n cuente con las funciones b�sicas.
 */
package Entidades;

import java.util.HashMap;

/**
 *
 * @author CamiloH
 */
public class Productos {

    private HashMap<String, Double> productos = new HashMap();
    private String llave;
    private Double precio;

    public Productos() {
    }

    public HashMap<String, Double> getProductos() {
        return productos;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setProductos(HashMap<String, Double> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Productos{" + "productos=" + productos + '}';
    }

}
