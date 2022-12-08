/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organisation;

import Model.Database.DBconnection;
import Model.Product.ProductDirectory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author naman
 */
public class GroceryStores {
    String name;
    String email;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addStore(String name, String email, String password){
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn
                    .prepareStatement("""
                                    INSERT INTO grocerystores (name, email, password) 
                                    VALUES(?,?,?)""");
            st.setString(1,name);
            st.setString(2,email);
            st.setString(10,password);
            
            int res = st.executeUpdate();
            System.out.println("store added"); 
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean alreadyExist(String product_name){
        Connection dbconn = DBconnection.connectDB();
        
            PreparedStatement st;
            boolean isExist = false;
        try {
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            SELECT * FROM grocerystores 
                                                            WHERE name = ?""");
            st.setString(1, product_name);
            ResultSet res = st.executeQuery();
            if(res.next()){
                isExist = true;
            }
            return isExist;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
            
            return isExist;
        }
            
    }
    
}
