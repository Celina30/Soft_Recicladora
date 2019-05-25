
package modelo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexionbd {
    private final String base= "ilimitados";
    private final String user="root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user,this.password);
            System.out.println("Conexion exitosa");
            System.out.println(con);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexionbd.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return con;
    }
}
