/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ALUMNO
 */
public class Main {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    
    static String db="ilimitados";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://127.0.0.1/"+db;
    
    public static Connection Enlace(Connection conn) throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(login);
        } catch (Exception e) {
        }
        return conn;
    }
}
