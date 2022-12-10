/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HospitalDir;

import Model.Database.DBconnection;
import Model.People.Dietitian;
import Model.People.PersonDirectory;
import Model.Utilities.UtilityFunctions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
//import model.Hospital;

/**
 *
 * @author anuja
 */
public class HospitalDirectory {
    
      public static ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
    
    public static ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
   public Hospital addNewHospital(int Id, String name, long phNumber, String address, String email){
        
        Hospital newHospital = new Hospital(Id, name, phNumber, address, email);
        
       // hospitalList.add(newHospital);
        
        //Add user details to DB
        addNewHospitalToDB( Id, name, phNumber,  address, email);
        return newHospital;
    }
    
   
    
   public void deleteHospital(Hospital p){
      hospitalList.remove(p);
  // 
   }
    
    public void addNewHospitalToDB(int Id, String name, long phNumber, String address,String email){
    
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
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("INSERT INTO Hospital(Id,HospitalName,PhoneNo,Email, address) VALUES(?,?,?,?,?)");
            st.setInt(1,Id);
            st.setString(2, name);
            st.setLong(3,phNumber);
            st.setString(4,email);
              st.setString(5, address);
            
           // st.setString(9, qualification);
                       
            
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteHospitalFromDB(int id){
        
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("DELETE * FROM hospital WHERE ID = ?");
            st.setString(1, String.valueOf(id));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HospitalDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
