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
    
    public ResultSet checkCredential (String email, String password){
        try {
            Connection dbconn = DBconnection.connectDB();
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement(
                    "SELECT usertype FROM users WHERE email = ? AND password = ?");
            st.setString(1, email);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void addUserCredential(String email, String password){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement(
                    "INSERT INTO users (email,password,usertype) VALUES(?,?,?)");
            st.setString(1, email);
            st.setString(2, password);
            st.setString(3,"User");
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addPerson(String email, String name,String gender,String dob,
            String address,String mobile){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement(
                    "INSERT INTO users (email,name,gender,dob,address,mobile) VALUES(?,?,?,?,?,?)");
            st.setString(1, email);
            st.setString(2, name);
            st.setString(3,gender);
            st.setString(4,dob);
            st.setString(5,address);
            st.setString(6,mobile);
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
}
