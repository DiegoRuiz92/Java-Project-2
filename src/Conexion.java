import java.sql.*;

public class Conexion {
    Connection conectar = null;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:registro.db");
        }
        catch(Exception e)
        {
            System.out.printf(e.getMessage());
        }
        return conectar; 
    }    
}
