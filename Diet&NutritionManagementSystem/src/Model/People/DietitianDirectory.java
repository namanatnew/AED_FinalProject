/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.People;

import Model.Database.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Utilities.UtilityFunctions;
/**
 *
 * @author Vipul
 */
public class DietitianDirectory {
    
    public static ArrayList<Dietitian> dietitianList = new ArrayList<Dietitian>();
    
    public static ArrayList<Dietitian> getDietitianList() {
        return dietitianList;
    }

    public void setDietitianList(ArrayList<Dietitian> dietitianList) {
        this.dietitianList = dietitianList;
    }
    
    public Dietitian addNewDietitian(String name, Date dob, int age, String gender, long phNumber, String address, Date doj, int experience, String qualification, String specialization, int slotsAvailable, String associatedHospital, String type){
        
        Dietitian newDietitian = new Dietitian(  name,  dob,  age,  gender,  phNumber,  address,  doj,  experience, qualification,  specialization,  slotsAvailable,  associatedHospital,  type);
        
        dietitianList.add(newDietitian);
        
        //Add user details to DB
        addNewDietitianToDB( name,  dob,  age,  gender,  phNumber,  address,  doj, experience, qualification,  specialization,  slotsAvailable,  associatedHospital,  type);
        return newDietitian;
    }
    
   
    
    public void deletePatient(Dietitian p){
        dietitianList.remove(p);
    }
    
    public void addNewDietitianToDB(String name, Date dob, int age, String gender, long phNumber, String address, Date doj, int experience, String qualification, String specialization, int slotsAvailable, String associatedHospital, String type){
    
        Connection dbconn = DBconnection.connectDB();
        try {
            
            
            /*
           
            CREATE TABLE `dietitians` (
                `ID` int NOT NULL AUTO_INCREMENT,
                `Name` varchar(255) DEFAULT NULL,
                `DOB` date DEFAULT NULL,
                `Gender` varchar(10) DEFAULT NULL,
                `Contact` long DEFAULT NULL,
                `Address` varchar(255) DEFAULT NULL,
                `DOJ` date DEFAULT NULL,
                `Experience` int ,
                `Qualification` varchar(100) NOT NULL,
                `Specialization` varchar(10) DEFAULT NULL,
                `Hospital` varchar(10) DEFAULT NULL,
                `Type` varchar(50) DEFAULT NULL
                `Slots` int ,
                `Age` int NOT NULL,
                PRIMARY KEY (`ID`)
            )
            
            */
           
//            PreparedStatement query = (PreparedStatement)dbconn.prepareStatement("")
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("INSERT INTO dietitians(`Name`, `DOB`, `Age`, `Gender`, `Contact`, `Address`, `DOJ`,`Experience`, `Qualification`, `Specialization`, `Hospital`, `Type`, `Slots`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setDate(2, new UtilityFunctions().convertFromJAVADateToSQLDate(dob));
            st.setInt(3, age);
            st.setString(4,gender);
            st.setLong(5, phNumber);
            st.setString(6, address);
            st.setDate(7, new UtilityFunctions().convertFromJAVADateToSQLDate(doj));
            st.setInt(8, experience);
            st.setString(9, qualification);
            st.setString(10, specialization);
            st.setString(11, associatedHospital);
            st.setString(12, type);
            st.setInt(13, slotsAvailable);
            
            
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletePatientFromDB(User p){
        
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("DELETE * FROM end_users WHERE `Name` = ? AND `Address` = ?");
            st.setString(1, p.getName());
            st.setString(2, p.getAddress());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
