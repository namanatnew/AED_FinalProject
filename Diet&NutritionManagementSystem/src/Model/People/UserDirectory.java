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
public class UserDirectory {
    
    public static ArrayList<User> userList = new ArrayList<User>();
    
    public static ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
   
    public void deleteUser(User p){
        userList.remove(p);
    }
    
    //name, dob, age, gender, contact, address, height, weight, diabetic, allergies, puposeList, preference, workoutFrequency, favorites,  email
    public void addNewUserToDB(String name, Date dob, int age, String gender, long phNumber, String address, float height, float weight, boolean diabetic, String allergies, String purposeOfDiet, String foodPreference, String workoutFrequency, List<String> favorites, String email){
    
        Connection dbconn = DBconnection.connectDB();
        try {
            /*
            Refer column names
            CREATE TABLE `end_users` (
                `UserID` int NOT NULL AUTO_INCREMENT,
                `Name` varchar(255) DEFAULT NULL,
                `DOB` date DEFAULT NULL,
                `Gender` varchar(10) DEFAULT NULL,
                `Contact` mediumtext,
                `Address` varchar(255) DEFAULT NULL,
                `Height` float DEFAULT NULL,
                `Weight` float DEFAULT NULL,
                `BloodGroup` varchar(10) DEFAULT NULL,
                `Purpose` varchar(50) DEFAULT NULL,
                `Diabetic` tinyint(1) DEFAULT NULL,
                `Allergies` varchar(100) DEFAULT NULL,
                `Food_Preference` varchar(100) NOT NULL,
                `Workout_Frequency` varchar(10) DEFAULT NULL,
                `Favorites` varchar(300) DEFAULT NULL,
                `Age` int NOT NULL,
                PRIMARY KEY (`UserID`)
            ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
            */
            
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("INSERT INTO end_users(`Name`, `DOB`, `Age`, `Gender`, `Contact`, `Address`,`Height`, `Weight`, `Diabetic`, `Allergies`, `Purpose`, `Food_Preference`, `Workout_Frequency`, `Favorites`, `Email`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setDate(2, new UtilityFunctions().convertFromJAVADateToSQLDate(dob));
            st.setInt(3, age);
            st.setString(4,gender);
            st.setLong(5, phNumber);
            st.setString(6, address);
            st.setFloat(7, height);
            st.setFloat(8, weight);
            
            
            st.setBoolean(9, diabetic);
            st.setString(10, allergies);
            st.setString(11, purposeOfDiet);
            st.setString(12, foodPreference);
            st.setString(13, workoutFrequency);
            st.setString(14, new UtilityFunctions().commaSeparate(favorites));
            st.setString(15, email);
            
            int res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteUserFromDB(User p){
        
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("DELETE * FROM end_users WHERE `Name` = ? AND `Address` = ?");
            st.setString(1, p.getName());
            st.setString(2, p.getAddress());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public boolean checkPID(int pID){
//        int flag = 0;
//        for(User p: getPatientList()){
//            if(p.getpID() == pID)
//                flag = 1;
//            else
//                flag = 0;
//        }
//        if(flag>0)
//            return true;
//        else
//            return false;
//    }
  
    
}
