/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organisation;

import Model.Database.DBconnection;
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
public class GroceryStoresDirectory {
    
    public void addStore(String name, String contact, String email, String password){
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn
                    .prepareStatement("""
                                    INSERT INTO grocerystores (name, contact, email, password) 
                                    VALUES(?,?,?)""");
            st.setString(1,name);            
            st.setString(2,contact);
            st.setString(3,email);
            st.setString(4,password);
            
            int res = st.executeUpdate();
            System.out.println("store added"); 
            
        } catch (SQLException ex) {
            Logger.getLogger(GroceryStoresDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean alreadyExist(String store_name){
        Connection dbconn = DBconnection.connectDB();
        
            PreparedStatement st;
            boolean isExist = false;
        try {
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                            SELECT * FROM grocerystores 
                                                            WHERE name = ?""");
            st.setString(1, store_name);
            ResultSet res = st.executeQuery();
            if(res.next()){
                isExist = true;
            }
            return isExist;
        } catch (SQLException ex) {
            Logger.getLogger(GroceryStoresDirectory.class.getName()).log(Level.SEVERE, null, ex);
            
            return isExist;
        }
            
    }
    
    public void deleteStore(String store_name){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("""
                                                                            DELETE FROM storedirectory
                                                                            WHERE name = ? """);
        
            st.setString(1, store_name);
            ResultSet res = st.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroceryStoresDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateStore(String name, String contact, String email, String password){
        try {
            Connection dbconn = DBconnection.connectDB();
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("""
                                                                            UPDATE storedirectory
                                                                            SET name = ?,
                                                                            contact = ?,
                                                                            email = ?
                                                                            WHERE name = ?""");
            st.setString(1, name);
            st.setString(2, contact);
            st.setString(3, email);
            
            PreparedStatement st1 = (PreparedStatement)dbconn.prepareStatement("""
                                                                            UPDATE users
                                                                            SET email = ?,
                                                                            password = ?,
                                                                            usertype = ?
                                                                            WHERE name = ?""");
            st1.setString(1, email);
            st1.setString(2, password);
            st1.setString(3, "Grocery Store Manager");
            st1.setString(4, name);
        } catch (SQLException ex) {
            Logger.getLogger(GroceryStoresDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getStoreData(String search_name){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st;
            
            st = (PreparedStatement)dbconn.prepareStatement("""
                                                                    SELECT name, contact, email, created_at
                                                                    FROM storedirectory
                                                                    WHERE name like ? """);
            
            st.setString(1, '%'+search_name+'%');
            ResultSet res = st.executeQuery();
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(GroceryStoresDirectory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
