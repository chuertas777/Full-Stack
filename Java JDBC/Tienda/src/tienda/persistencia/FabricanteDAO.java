/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.SQLException;
import tienda.entidades.Fabricante;

/**
 *
 * @author Camilo Huertas
 */
public class FabricanteDAO extends DAO {

    //Ingresar un fabricante en la base de datos
    public void insertarFabricante(Fabricante fabricante) throws SQLException, Exception {

        try {

            if (fabricante == null) {
                throw new Exception("Usted debería ingresar un fabricante");

            }

            String sql = "INSERT INTO fabricante (codigo,nombre) "
                    + "values ('" + fabricante.getCodigo() + "','" + fabricante.getNombre() + "')";
            alterTable(sql);

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            desconectarBD();
        }

    }

}
