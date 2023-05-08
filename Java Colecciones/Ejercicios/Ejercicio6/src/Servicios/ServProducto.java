/*
 *  Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
    Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import Entidades.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author CamiloH
 */
public class ServProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> producto = new HashMap();
    Productos pro = new Productos();

    // Introducir un elemento
    public Productos crearProducto() {

        String opcion;

        do {
            System.out.println("Ingrese el nombre del producto:  ");
            pro.setLlave(leer.next());
            System.out.println("Ingrese el precio del producto:  ");
            pro.setPrecio(leer.nextDouble());
            pro.setProductos(producto);
            producto.put(pro.getLlave(), pro.getPrecio());
            System.out.println("¿Desea agregar otro producto?  s/n : ");
            opcion = leer.next();

            return pro;
        } while (opcion.contains("s"));

    }

    //método para editar el precio del producto
    public void editarPrecio() {
        String opcion;

        do {

            System.out.println("¿Ingrese la llave del producto?  ");
            String keys = leer.next();
            for (Map.Entry<String, Double> entry : producto.entrySet()) {
                if (entry.getKey().equals(keys)) {
                    System.out.println("Ingrese el nuevo precio para el producto ");
                    pro.setPrecio(leer.nextDouble());
                    pro.setProductos(producto);
                    producto.put(pro.getLlave(), pro.getPrecio());
                } else {
                    System.out.println("No existe el producto ");
                }

            }
            System.out.println("¿Desea seguir modificando el precio del producto?  s/n : ");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("s"));

    }

    //Mostrar productos
    public void mostrarProductos() {
        System.out.println("La lista de productos son:");
        for (Map.Entry<String, Double> entry : producto.entrySet()) {
            System.out.println("Producto: " + entry.getKey());
            System.out.println("Precio:  " + entry.getValue());

        }
    }

    //Eliminar Productos
    public void eliminarProductos() {
        String opcion;
        do {

            System.out.println("¿Ingrese la llave del producto a eliminar?  ");
            String keys = leer.next();
            for (Map.Entry<String, Double> entry : producto.entrySet()) {
                if (entry.getKey().equals(keys)) {
                    producto.remove(keys);
                } else {
                    System.out.println("No existe el producto ");
                }

            }
            System.out.println("¿Desea eliminar otro producto?  s/n : ");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("s"));

    }

    //Menú 
    public void menu() {
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Para ingresar productos");
            System.out.println("2. Para modificar el precio de los productos");
            System.out.println("3. Para eliminar un producto");
            System.out.println("4. Mostrar los productos");
            System.out.println("5. Para salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    editarPrecio();
                    break;
                case 3:
                    eliminarProductos();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 5);

    }

}
