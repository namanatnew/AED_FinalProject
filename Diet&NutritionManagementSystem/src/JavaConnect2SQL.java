
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
public class JavaConnect2SQL {
    
    public static void main(String[] args){
        
        try {
            String connectionUrl = 
                "jdbc:sqlserver://DESKTOP-2C1PKQK;databaseName=nutritiondb;integratedSecurity=true";
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("connected");
        } 
        catch (SQLException ex) {
            System.out.println("oops");
            Logger.getLogger(JavaConnect2SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
