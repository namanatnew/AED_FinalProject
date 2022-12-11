/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Dietitian;

import UI.User.*;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Database.DBconnection;
import Model.People.DietitianDirectory;
import Model.People.User;
import Model.People.UserDirectory;
import Model.Utilities.UtilityFunctions;
import UI.Authenticate.LoginFrame;
import UI.Main.MainFrame;
import UI.SystemAdmin.SAHomePage;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author vipul
 */
public class DietitianUpdateInfo extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String userName;
    
    private TableRowSorter sorter;
    public DietitianUpdateInfo(String userName) {
        initComponents();
        this.userName = userName;
        //this.records = records;
        lblWelcome.setText("Welcome, " + this.userName);
        viewDetails(this.userName);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupDiabetes = new javax.swing.ButtonGroup();
        pnlTitleBar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        pnlWorkArea = new javax.swing.JPanel();
        pnlRegistration = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelDiet1 = new javax.swing.JPanel();
        lblPurpose2 = new javax.swing.JLabel();
        comboType1 = new javax.swing.JComboBox<>();
        comboHospital1 = new javax.swing.JComboBox<>();
        lblWorkoutFrequency6 = new javax.swing.JLabel();
        txtQualification1 = new javax.swing.JTextField();
        lblWorkoutFrequency7 = new javax.swing.JLabel();
        txtSlots1 = new javax.swing.JTextField();
        lblWorkoutFrequency8 = new javax.swing.JLabel();
        dateDOJ1 = new com.toedter.calendar.JDateChooser();
        lblWorkoutFrequency9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblHomePage = new javax.swing.JLabel();
        lblAppointments = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 179, 172));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitleBar.setBackground(new java.awt.Color(102, 102, 255));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Diet Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N

        javax.swing.GroupLayout pnlTitleBarLayout = new javax.swing.GroupLayout(pnlTitleBar);
        pnlTitleBar.setLayout(pnlTitleBarLayout);
        pnlTitleBarLayout.setHorizontalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );
        pnlTitleBarLayout.setVerticalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBarLayout.createSequentialGroup()
                .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTitleBarLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTitleBarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        pnlWorkArea.setBackground(new java.awt.Color(255, 255, 255));
        pnlWorkArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistration.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlRegistration.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 537, 95, 35));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlRegistration.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 537, 90, 35));

        panelDiet1.setBackground(new java.awt.Color(255, 255, 255, 180));
        panelDiet1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diet Related", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelDiet1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPurpose2.setText("Hospital");
        panelDiet1.add(lblPurpose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        comboType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultant", "Clinical", "Pediatric", "Sports", "Research" }));
        comboType1.setSelectedIndex(-1);
        comboType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboType1ActionPerformed(evt);
            }
        });
        panelDiet1.add(comboType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 30));

        comboHospital1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Independent", "Boston General", "Noble Care" }));
        comboHospital1.setSelectedIndex(-1);
        panelDiet1.add(comboHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 30));

        lblWorkoutFrequency6.setText("Type");
        panelDiet1.add(lblWorkoutFrequency6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtQualification1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQualification1KeyTyped(evt);
            }
        });
        panelDiet1.add(txtQualification1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, 30));

        lblWorkoutFrequency7.setText("Qualification");
        panelDiet1.add(lblWorkoutFrequency7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtSlots1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSlots1KeyTyped(evt);
            }
        });
        panelDiet1.add(txtSlots1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 200, 30));

        lblWorkoutFrequency8.setText("Date of Joining");
        panelDiet1.add(lblWorkoutFrequency8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));
        panelDiet1.add(dateDOJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 200, 30));

        lblWorkoutFrequency9.setText("Appointment Slots");
        panelDiet1.add(lblWorkoutFrequency9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        pnlRegistration.add(panelDiet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 770, 150));

        pnlWorkArea.add(pnlRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 610));

        getContentPane().add(pnlWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 63, 830, 610));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(121, 237, 39));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogout.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        lblLogout.setText("   Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel6.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 190, 45));

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomePage.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lblHomePage.setForeground(new java.awt.Color(255, 255, 255));
        lblHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        lblHomePage.setText("  Home Page");
        lblHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomePageMouseClicked(evt);
            }
        });
        jPanel7.add(lblHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        lblAppointments.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        lblAppointments.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/users_sadmin_29px.png"))); // NOI18N
        lblAppointments.setText("   Appointments");
        lblAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAppointmentsMouseClicked(evt);
            }
        });
        jPanel3.add(lblAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, -1));

        lblAccount.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        lblAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/Icon-Small_1.png"))); // NOI18N
        lblAccount.setText("         Account");
        lblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccountMouseClicked(evt);
            }
        });
        jPanel3.add(lblAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, -1));

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel7.setText("  Home Page");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 610));

        setSize(new java.awt.Dimension(1014, 673));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    public void viewDetails(String name){
        
        DietitianDirectory dd = new DietitianDirectory();
        ResultSet res = dd.selectRecordsByName(name);
        
        try{
            while(res.next()){
                comboHospital1.setSelectedItem(res.getString("Hospital"));
                txtQualification1.setText(res.getString("Qualification"));
                dateDOJ1.setDate(res.getDate("DOJ"));
                comboType1.setSelectedItem(res.getString("Type"));
                txtSlots1.setText(String.valueOf(res.getInt("Slots")));
            }
            System.out.println(res);
            
//            tableView.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch(SQLException ex){
            Logger.getLogger(DietitianUpdateInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void resetForm(){
        
//        txtName.setText(null);
//        dateDOB.setDate(null);
//        txtAge.setText(null);
//        txtContact.setText(null);
//        comboGender.setSelectedIndex(-1);
//        txtAddress.setText(null);
        
//        combo
         
    }
    
    
    
    
    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        if(true){
            
        Connection dbconn = DBconnection.connectDB();
        PreparedStatement st;
        
        try{
             
            String query = "UPDATE dietitians SET  DOJ = ?, Experience = ?, Qualification = ?, Hospital = ? , Type = ?, Slots = ? WHERE Name = ?";
            st = (PreparedStatement)dbconn.prepareStatement(query);
            
            st.setDate(1, new UtilityFunctions().convertFromJAVADateToSQLDate(dateDOJ1.getDate()));
            
            LocalDate today = LocalDate.now();
            int exp = Period.between(convertToLocalDateViaInstant(dateDOJ1.getDate()), today).getYears();
            st.setInt(2, exp); 
            st.setString(3, txtQualification1.getText());
            st.setString(4, comboHospital1.getSelectedItem().toString());
            st.setString(5, comboType1.getSelectedItem().toString());
            st.setInt(6, Integer.parseInt(txtSlots1.getText()));
            
            //age
            st.setString(7, this.userName);
            
            
            st.executeUpdate();
            
//            System.out.println(res);
            
//            tableView.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch(SQLException ex){
            Logger.getLogger(ManageDietitiansSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        resetForm();
        UserRegistration frame = new UserRegistration();
        frame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void comboType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboType1ActionPerformed

    private void txtQualification1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQualification1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualification1KeyTyped

    private void txtSlots1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSlots1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlots1KeyTyped

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAppointmentsMouseClicked
        // TODO add your handling code here:
        DietitianAppointments frame = new DietitianAppointments(this.userName, 0);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAppointmentsMouseClicked

    private void lblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseClicked
        // TODO add your handling code here:
        UserUpdateInfo frame = new UserUpdateInfo(this.userName);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAccountMouseClicked

    private void lblHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomePageMouseClicked
        // TODO add your handling code here:
        System.out.println("+++++++++" + this.userName);
        DietitianHomePage frame = new DietitianHomePage(this.userName, 0);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblHomePageMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        LoginFrame fr = new LoginFrame();
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked
    
    boolean isDataValid(){
//        String id, name, emailId, gender, community, city, state, username ;
//        String houseNumber, zipCode, age, bloodGroup, height, weight;
//        String contactDetails;
////        Date dob;
//        //String patternEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
//        String patternEmail = "^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$";
//        String bmi = "[(0-9\\.)]{2,}$";
//               
//        id = txtDoctorID.getText();
//        name = txtName.getText();
//        emailId = txtEmail.getText();
//        contactDetails = txtContact.getText();
//        age = txtAge.getText();
////        dob = DOBtxt.getDate();
//        if(comboPurpose.getSelectedItem() == null){
//            houseNumber = "";
//        }
//        else{
//            houseNumber = comboPurpose.getSelectedItem().toString();
//        }
//        
//        
//        if(comboCommunity.getSelectedItem() == null){
//            community = "";
//        }
//        else{
//            community = comboCommunity.getSelectedItem().toString();
//        }
//        
//        
//        if(comboCity.getSelectedItem() == null){
//            city = "";
//        }
//        else{
//            city = comboCity.getSelectedItem().toString();
//        }
//        state = txtState.getText();
//        zipCode = txtZipCode.getText();
//        //bloodGroup = (String) patientBloodGroupTxt.getSelectedItem();
//        String qualification = txtQualification.getText();
//        String specialization = txtSpecialization.getText();
//        String slots = txtHeight.getText();
//        String password = new String(txtPassword.getText());
//        String rePassword = new String(txtPassword2.getPassword());
//        
//        
//       
//        if(comboGender.getSelectedItem() == null){
//            gender = "";
//        }
//        else{
//            gender = comboGender.getSelectedItem().toString(); 
//        }
//        
//        String hospital;
//        if(comboBloodGroup.getSelectedItem() == null){
//            hospital = "";
//        }
//        else{
//            hospital = comboBloodGroup.getSelectedItem().toString(); 
//        }
//        
//        
//        if (id.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter Patient ID");
//            return false;
//        }
//       
//        if (name.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter name");
//            return false;
//        }
//        
//        if (gender.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please select gender");
//            return false;
//        }
//        
//        if (hospital.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please select hospital");
//            return false;
//        }
//        
//        if (contactDetails.equals("") || !(txtContact.getText().length()==10))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter valid contact Number");
//            txtContact.setText("");
//           
//            return false;
//        }
//        //emailIDTxt.getText().isBlank() &&
//        if( !txtEmail.getText().matches(patternEmail)){
//                JOptionPane.showMessageDialog(this, "Please enter a valid Email.");
//                txtEmail.setText("");
//                return false;
//            }
//       
//        if (age.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter age");
//            return false;
//        }
//       
//        if (slots.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter number of slots available");
//            return false;
//        }
//        
//        if (qualification.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter qualification");
//            return false;
//        }
//        if (specialization.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter specialization");
//            return false;
//        }
       
       
//        if (zipCode.equals("") || !(txtZipCode.getText().length()==5))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter zipCode");
//            txtZipCode.setText("");
//            return false;
//        }
//       
//   
//       
//        if (password.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter password");
//            return false;
//        }
//       
//        if (rePassword.equals(""))
//        {
//            JOptionPane.showMessageDialog(this, "Please enter rePassword");
//            return false;
//        }
//       
//        if (!(password).equals(rePassword)){
//            JOptionPane.showMessageDialog(this, "Password doesn't match");
//            return false;
//        }
       
        return true;
       
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserUpdateInfo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup btnGroupDiabetes;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboHospital1;
    private javax.swing.JComboBox<String> comboType1;
    private com.toedter.calendar.JDateChooser dateDOJ1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAppointments;
    private javax.swing.JLabel lblHomePage;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblPurpose2;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWorkoutFrequency6;
    private javax.swing.JLabel lblWorkoutFrequency7;
    private javax.swing.JLabel lblWorkoutFrequency8;
    private javax.swing.JLabel lblWorkoutFrequency9;
    private javax.swing.JPanel panelDiet1;
    private javax.swing.JPanel pnlRegistration;
    private javax.swing.JPanel pnlTitleBar;
    private javax.swing.JPanel pnlWorkArea;
    private javax.swing.JTextField txtQualification1;
    private javax.swing.JTextField txtSlots1;
    // End of variables declaration//GEN-END:variables
}
