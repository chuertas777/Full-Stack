/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Camilo Huertas
 */
public class ProductoService {

    private ProductoDAO pDao;
    Producto producto;
    Scanner read = new Scanner(System.in);

    public ProductoService() {
        pDao = new ProductoDAO();

    }

    //Método para imprimir el nombre del producto 
    public void imprimirNombreProductos() throws Exception {
        try {
            Collection<Producto> productos = pDao.consultaNombreProductos();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos para mostrar");

            } else {
                System.out.println("Nombre");
                for (Producto producto1 : productos) {
                    System.out.println(producto1.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Método para imprimir el nombre y el precio del producto 
    public void imprimirNombrePrecioProductos() throws Exception {
        try {
            Collection<Producto> productos = pDao.consultaNombrePrecioProductos();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos para mostrar");

            } else {
                System.out.println("Nombre           /       Precio");
                for (Producto producto1 : productos) {
                    System.out.println(producto1.getNombre() + "      "
                            + producto1.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Método para imprimir el nombre y el precio del producto entre 120 y 202 
    public void consultaxPrecioProducto() throws Exception {
        try {
            Collection<Producto> productos = pDao.consultaxPrecioProducto();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos para mostrar");

            } else {
                System.out.println("Nombre           /       Precio");
                for (Producto producto1 : productos) {
                    System.out.println(producto1.getNombre() + "      "
                            + producto1.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Método para imprimir el producto por tipo nombre portátil 
    public void consultarTipoProducto() throws Exception {
        try {
            Collection<Producto> productos = pDao.consultaxtipoProducto();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos para mostrar");

            } else {
                System.out.println("Nombre           /       Precio");
                for (Producto producto1 : productos) {
                    System.out.println(producto1.getNombre() + "      "
                            + producto1.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Método para imprimir el producto mas barato 
    public void consultarProductoBarato() throws Exception {
        try {
            Collection<Producto> productos = pDao.consultaProductoBarato();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos para mostrar");

            } else {
                System.out.println("Nombre           /       Precio");
                for (Producto producto1 : productos) {
                    System.out.println(producto1.getNombre() + "      "
                            + producto1.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Método para insertar un producto en la tabla producto
    public void insertarProducto() throws Exception {

        do {
            try {
                producto = new Producto();
                System.out.println("Ingrese el nombre del producto");
                producto.setNombre(read.nextLine());
                System.out.println("Ingrese el precio del producto");
                Double precio = read.nextDouble();
                System.out.println("Ingrese el código del fabricante");
                int cod_fab = read.nextInt();

                try {
                    producto.setPrecio(precio);
                    producto.setCodigoFabricante(cod_fab);

                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un valor valido");
                    continue;
                }
                if (producto.getNombre() == null || producto.getNombre().isEmpty()) {
                    throw new IllegalArgumentException("\nDebería indicar un "
                            + "nombre!");
                }
                if (producto.getPrecio() <= 0) {
                    throw new IllegalArgumentException("\nDebería indicar un "
                            + "precio!");

                }
                pDao.insertarProducto(producto);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }

        } while (producto.getNombre() == null || producto.getNombre().isEmpty()
                || producto.getPrecio() <= 0 );

    }
    
    
    
    

}
