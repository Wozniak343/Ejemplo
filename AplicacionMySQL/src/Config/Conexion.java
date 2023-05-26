package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecaucc","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro al conectar! " + e);
        }
    }
    
    public Connection getConnection(){
        System.out.println("Se conecto a la BD");
        return con;
    }
}
