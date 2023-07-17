/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import java.sql.SQLException;

/**
 *
 * @author Camilo Huertas
 */
public final class ProductoDAO extends DAO {

    //Consultar la tabla productos nombre y precio
    public Collection<Producto> consultaNombreProductos() throws SQLException, Exception {

        try {

            String sql = "SELECT nombre FROM producto";
            consultarBD(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
            desconectarBD();
            return productos;

        } catch (SQLException e) {
            e.printStackTrace();
            desconectarBD();
            throw new Exception("Error de sistema");
        }

    }

    //Consultar nombre y precio 
    public Collection<Producto> consultaNombrePrecioProductos() throws SQLException, Exception {

        try {

            String sql = "SELECT nombre, precio FROM producto";
            consultarBD(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBD();
            return productos;

        } catch (SQLException e) {
            e.printStackTrace();
            desconectarBD();
            throw new Exception("Error de sistema");
        }

    }

    //Consultar nombre y precio del producto que este entre 120 y 202
    public Collection<Producto> consultaxPrecioProducto() throws SQLException, Exception {

        try {

            String sql = "SELECT nombre, precio FROM producto WHERE precio "
                    + "BETWEEN 120 AND 202";
            consultarBD(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBD();
            return productos;

        } catch (SQLException e) {
            e.printStackTrace();
            desconectarBD();
            throw new Exception("Error de sistema");
        }

    }

    //Buscar y listar todos los productos que son portatiles
    public Collection<Producto> consultaxtipoProducto() throws SQLException, Exception {

        try {

            String sql = "SELECT nombre, precio FROM producto WHERE nombre "
                    + "like '%Portátil%'";
            consultarBD(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBD();
            return productos;

        } catch (SQLException e) {
            e.printStackTrace();
            desconectarBD();
            throw new Exception("Error de sistema");
        }

    }

    //Listar el nombre y el precio del producto mas barato
    public Collection<Producto> consultaProductoBarato() throws SQLException, Exception {

        try {

            String sql = "SELECT nombre, precio FROM producto order by precio "
                    + "asc limit 1";
            consultarBD(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBD();
            return productos;

        } catch (SQLException e) {
            e.printStackTrace();
            desconectarBD();
            throw new Exception("Error de sistema");
        }

    }

    //Ingresar un producto en la base de datos
    public void insertarProducto(Producto producto) throws SQLException, Exception {

        try {

            if (producto == null) {
                throw new Exception("Usted debería ingresar un producto");

            }

            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "values ('" + producto.getNombre() + "','" + producto.getPrecio() + "',"
                    + "'" + producto.getCodigoFabricante() + "') ";
            alterTable(sql);

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            desconectarBD();
        }

    }

}
