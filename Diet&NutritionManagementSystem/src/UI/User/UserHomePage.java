/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.User;

import Model.Database.DBconnection;
import UI.SystemAdmin.*;
import UI.Authenticate.LoginFrame;
import UI.Dietitian.ManageDietitiansSA;
import UI.User.UserRegistration;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author vipul
 */
public class UserHomePage extends javax.swing.JFrame {

    /**
     * Creates new form SAHomePage
     */
    public String email_id;
    public String userName;
    public UserHomePage(String email_id) {
        this.email_id = email_id;
        initComponents();
        this.userName = getUserNameFromEmail(email_id);
        System.out.println(userName);
        lblWelcome.setText("Welcome, " + this.userName);
        
        showDietInfo(this.userName);
        showIntakeInfo(this.userName);
    }
    
    //comment after testing
    public UserHomePage(String name, int i) {
        initComponents();
        this.userName = name;
        showDietInfo(this.userName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblHomePage = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAppointment = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelMedical1 = new javax.swing.JPanel();
        lblSodium = new javax.swing.JLabel();
        lblCalories = new javax.swing.JLabel();
        lblProtein = new javax.swing.JLabel();
        lblCarbs = new javax.swing.JLabel();
        lblFats = new javax.swing.JLabel();
        lblCholesterol = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        panelMedical2 = new javax.swing.JPanel();
        lblSodium1 = new javax.swing.JLabel();
        lblCalories1 = new javax.swing.JLabel();
        lblProtein1 = new javax.swing.JLabel();
        lblCarbs1 = new javax.swing.JLabel();
        lblFats1 = new javax.swing.JLabel();
        lblCholesterol1 = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lblClose.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Diet Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblClose)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(121, 237, 39));
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
        jPanel7.add(lblHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/users_sadmin_29px.png"))); // NOI18N
        jLabel12.setText("   Today's Intake");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, -1));

        lblAppointment.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        lblAppointment.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/Icon-Small.png"))); // NOI18N
        lblAppointment.setText(" Consult a Dietitian");
        lblAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAppointmentMouseClicked(evt);
            }
        });
        jPanel3.add(lblAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        lblAccount.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        lblAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/Icon-Small_1.png"))); // NOI18N
        lblAccount.setText("         Account");
        lblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccountMouseClicked(evt);
            }
        });
        jPanel3.add(lblAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel7.setText("  Home Page");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 580));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMedical1.setBackground(new java.awt.Color(255, 255, 255, 180));
        panelMedical1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelMedical1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSodium.setBackground(new java.awt.Color(255, 255, 255));
        lblSodium.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblSodium.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sodium", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblSodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 120, 70));

        lblCalories.setBackground(new java.awt.Color(255, 255, 255));
        lblCalories.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblCalories.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblCalories, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 70));

        lblProtein.setBackground(new java.awt.Color(255, 255, 255));
        lblProtein.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblProtein.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Protein", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblProtein, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 70));

        lblCarbs.setBackground(new java.awt.Color(255, 255, 255));
        lblCarbs.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblCarbs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carbs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblCarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 70));

        lblFats.setBackground(new java.awt.Color(255, 255, 255));
        lblFats.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblFats.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblFats, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, 70));

        lblCholesterol.setBackground(new java.awt.Color(255, 255, 255));
        lblCholesterol.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblCholesterol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cholesterol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblCholesterol, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 120, 70));

        jPanel4.add(panelMedical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 770, 120));

        lblTitle.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        lblTitle.setText("Your Consumption (Today)");
        jPanel4.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        panelMedical2.setBackground(new java.awt.Color(255, 255, 255, 180));
        panelMedical2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelMedical2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSodium1.setBackground(new java.awt.Color(255, 255, 255));
        lblSodium1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblSodium1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sodium", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblSodium1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 120, 70));

        lblCalories1.setBackground(new java.awt.Color(255, 255, 255));
        lblCalories1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblCalories1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblCalories1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 70));

        lblProtein1.setBackground(new java.awt.Color(255, 255, 255));
        lblProtein1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblProtein1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Protein", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblProtein1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 70));

        lblCarbs1.setBackground(new java.awt.Color(255, 255, 255));
        lblCarbs1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblCarbs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carbs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblCarbs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 70));

        lblFats1.setBackground(new java.awt.Color(255, 255, 255));
        lblFats1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblFats1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblFats1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, 70));

        lblCholesterol1.setBackground(new java.awt.Color(255, 255, 255));
        lblCholesterol1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblCholesterol1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cholesterol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblCholesterol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 120, 70));

        jPanel4.add(panelMedical2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 770, 120));

        lblTitle1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        lblTitle1.setText("Your Diet Plan (Daily Requirement)");
        jPanel4.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 830, 580));

        setSize(new java.awt.Dimension(1019, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        UserDailyIntake frame = new UserDailyIntake(this.userName);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        // TODO add your handling code here:
        lblClose.setForeground(Color.red);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAppointmentMouseClicked
        // TODO add your handling code here:
        UserAppointmentBooking frame = new UserAppointmentBooking(this.userName);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAppointmentMouseClicked

    private void lblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseClicked
        // TODO add your handling code here:
        UserUpdateInfo frame = new UserUpdateInfo(this.userName);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAccountMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel2MouseClicked
    
    public void showIntakeInfo(String name){
        
        Connection dbconn = DBconnection.connectDB();
        
        
        PreparedStatement st;
        
        try{
            st = (PreparedStatement)dbconn.prepareStatement("SELECT * from dailyintake WHERE username=?");
            st.setString(1, name);
            ResultSet res = st.executeQuery();
            
            while(res.next()){
                lblCalories.setText(res.getString("calories"));
                lblProtein.setText(res.getString("protein"));
                lblCarbs.setText(res.getString("carbs"));
                lblFats.setText(res.getString("fats"));
                lblSodium.setText(res.getString("sodium"));
                lblCholesterol.setText(res.getString("cholesterol"));
                
            }
            System.out.println(this.userName);
            
        }
        catch(SQLException ex){
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void showDietInfo(String name){
        
        Connection dbconn = DBconnection.connectDB();
        
        
        PreparedStatement st;
        
        try{
            st = (PreparedStatement)dbconn.prepareStatement("SELECT * from dietplans WHERE username=?");
            st.setString(1, name);
            ResultSet res = st.executeQuery();
            
            while(res.next()){
                lblCalories.setText(res.getString("calories"));
                lblProtein.setText(res.getString("protein"));
                lblCarbs.setText(res.getString("carbs"));
                lblFats.setText(res.getString("fats"));
                lblSodium.setText(res.getString("sodium"));
                lblCholesterol.setText(res.getString("cholesterol"));
                
            }
            System.out.println(this.userName);
            
        }
        catch(SQLException ex){
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public String getUserNameFromEmail(String email_id){
        
        Connection dbconn = DBconnection.connectDB();
        PreparedStatement st;
        
        try{
            st = (PreparedStatement)dbconn.prepareStatement("SELECT Name from end_users WHERE Email=?");
            st.setString(1, email_id);
            ResultSet res = st.executeQuery();
            
            while(res.next()){
                this.userName = res.getString("Name");
            }
            System.out.println(this.userName);     
        }
        catch(SQLException ex){
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.userName;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UserHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserHomePage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAppointment;
    private javax.swing.JLabel lblCalories;
    private javax.swing.JLabel lblCalories1;
    private javax.swing.JLabel lblCarbs;
    private javax.swing.JLabel lblCarbs1;
    private javax.swing.JLabel lblCholesterol;
    private javax.swing.JLabel lblCholesterol1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFats;
    private javax.swing.JLabel lblFats1;
    private javax.swing.JLabel lblHomePage;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblProtein;
    private javax.swing.JLabel lblProtein1;
    private javax.swing.JLabel lblSodium;
    private javax.swing.JLabel lblSodium1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panelMedical1;
    private javax.swing.JPanel panelMedical2;
    // End of variables declaration//GEN-END:variables
}
