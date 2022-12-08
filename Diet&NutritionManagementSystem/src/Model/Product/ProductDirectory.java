/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Product;

import Model.Database.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author naman
 */
public class ProductDirectory {
    
    
    public void addProduct(String product_name, String product_type, float reference_qty, float calorie, 
            float fat, float cholesterol, float sodium, float carbohydrates, float protein, 
            String addedBy){
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn
                    .prepareStatement("""
                                    INSERT INTO productcatalog (product_name, product_type, reference_qty, 
                                    calorie, fat, cholesterol, sodium, carbohydrates, protein, 
                                    status, added_by) VALUES(?,?,?,?,?,?,?,?,?,?,?)""");
            st.setString(1,product_name);
            st.setString(2,product_type);
            st.setFloat(3,reference_qty);
            st.setFloat(4,calorie);
            st.setFloat(5,fat);
            st.setFloat(6,cholesterol);
            st.setFloat(7,sodium);
            st.setFloat(8,carbohydrates);
            st.setFloat(9,protein);
            st.setString(10,"Pending");
            st.setString(11,addedBy);
            
            int res = st.executeUpdate();
            System.out.println("product added"); //need exception here for what if sql query fails
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void approveProduct(String product_name){
       Connection dbconn = DBconnection.connectDB();
       
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("""
                                                                                UPDATE TABLE productcatalog
                                                                                SET status = "Approved"
                                                                                WHERE product_name = ?""");
            st.setString(1, product_name);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet exactProductLookup(String product_name){
         
            Connection dbconn = DBconnection.connectDB();
            
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("""
                                                                        SELECT product_name, product_type
                                                                        ,reference_qty, calorie
                                                                        ,fat, cholesterol,sodium
                                                                        ,carbohydrates, protein
                                                                        FROM productcatalog
                                                                        WHERE product_name = ? """);
        
            st.setString(1, product_name);
            ResultSet res = st.executeQuery();
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
    }
    
    public void deleteProduct(String product_name){
        try {
            Connection dbconn = DBconnection.connectDB();
            
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("""
                                                                            DELETE FROM productcatalog
                                                                            WHERE product_name = ? """);
        
            st.setString(1, product_name);
            ResultSet res = st.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateProduct(String type,float refqty,float calorie,float fat,
            float chol,float sodium,float carbs,float protein,String name){
        try {
            Connection dbconn = DBconnection.connectDB();
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("""
                                                                            UPDATE TABLE productcatalog
                                                                            SET type = ?,
                                                                                reference_qty = ?,
                                                                                calorie = ?,
                                                                                fat = ?,
                                                                                cholestrol = ?,
                                                                                sodium = ?,
                                                                                carbohydrates = ?,
                                                                                protein = ?,
                                                                            WHERE product_name = ?""");
            st.setString(1, type);
            st.setFloat(2, refqty);
            st.setFloat(3, calorie);
            st.setFloat(4, fat);
            st.setFloat(5, chol);
            st.setFloat(6, sodium);
            st.setFloat(7, carbs);
            st.setFloat(8, protein);
            st.setString(9, name);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean alreadyExist(String product_name){
        Connection dbconn = DBconnection.connectDB();
        
            PreparedStatement st;
            boolean isExist = false;
        try {
            st = (PreparedStatement)dbconn.prepareStatement("SELECT * FROM productcatalog WHERE product_name = ?");
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
