/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HospitalDir;

import java.util.Date;

/**
 *
 * @author anuja
 */
public class Hospital {
    
    private int Id;
    private String name;
    private long phNumber;
    private String address;
    private String email;

   
    
    public Hospital(int Id, String name, long phNumber, String email, String address ){
        
        this.Id  = Id;
        this.name = name;
        this.phNumber = phNumber;
        this.address = address;
        this.email = email;
       
    }     


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    

}
