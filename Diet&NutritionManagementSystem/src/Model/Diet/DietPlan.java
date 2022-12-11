/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Diet;

import Model.Database.DBconnection;
import UI.User.UserHomePage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vipul
 */
public class DietPlan {
    
    
    
    
    public ResultSet selectRecordsByName(String name){
    
        Connection dbconn = DBconnection.connectDB();
        
        
        PreparedStatement st;
        
        try{
            st = (PreparedStatement)dbconn.prepareStatement("SELECT * from dietplans WHERE username=?");
            st.setString(1, name);
            ResultSet res = st.executeQuery();
            
            return res;
        }
        catch(SQLException ex){
            Logger.getLogger(DietPlan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    
}
