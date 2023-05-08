/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
    productos que venderemos y el precio que tendrán. Además, se necesita que la 
    aplicación cuente con las funciones básicas.
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
