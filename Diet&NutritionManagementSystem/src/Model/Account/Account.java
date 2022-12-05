/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Account;

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
public class Account {
    
    public ResultSet checkCredential (String username, String password){
        try {
            Connection dbconn = DBconnection.connectDB();
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement(
                    "SELECT usertype FROM users WHERE username = ? AND password = ?");
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void addUserCredential(String username, String password){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement(
                    "INSERT INTO users (username,password,usertype) VALUES(?,?,?)");
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3,"User");
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
}
