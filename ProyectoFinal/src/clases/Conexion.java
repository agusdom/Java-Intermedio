
package clases;

import java.sql.*;

public class Conexion {
    //Conexión Local
    public static Connection Conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds","root","");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local");
        }
        return null;
    }
}
