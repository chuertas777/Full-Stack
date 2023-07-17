package tienda.persistencia;
//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Diego Sánchez
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectarBD() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=FALSE";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }

    }

    protected void desconectarBD() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected void alterTable(String sql) throws Exception {
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            // conexion.rollback();
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */

            throw ex;
        } finally {
            desconectarBD();
        }
    }

    protected void consultarBD(String sql) throws Exception {
        try {
            conectarBD();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
