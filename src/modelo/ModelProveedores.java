/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ALUMNO
 */
public class ModelProveedores {

    public static Statement sta(Statement st) throws SQLException {
        Main.conn = Main.Enlace(Main.conn);
        st = Main.conn.createStatement();
        return st;
    }
    
  public static ResultSet EnlEst(ResultSet rs) throws SQLException
    {
        Main.st = sta(Main.st);
        rs = Main.st.executeQuery("select * from proveedores");
        return rs;
        
    }    
}
