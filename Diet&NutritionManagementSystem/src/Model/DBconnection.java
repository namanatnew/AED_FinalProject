package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naman
 */
public class DBconnection {
    static final String connectionUrl = "jdbc:sqlserver://DESKTOP-2C1PKQK;databaseName=nutritiondb;integratedSecurity=true;encrypt=false";
    public static Connection connectDB(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conn =  DriverManager.getConnection(connectionUrl);
            System.out.println("Connected to the DB");
            return conn;
        } 
        catch (SQLException ex) {
            System.out.println("Could not connect to the DB");
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
