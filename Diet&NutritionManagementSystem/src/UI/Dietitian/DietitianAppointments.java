/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Dietitian;

import UI.Dietitian.*;
import UI.User.*;
import Model.Database.DBconnection;
import Model.Diet.DietIntake;
import Model.Diet.DietPlan;
import Model.People.DietitianDirectory;
import Model.WorkRequest.DietitianAppointmentRequest;
import UI.SystemAdmin.*;
import UI.Authenticate.LoginFrame;
import UI.Dietitian.ManageDietitiansSA;
import UI.User.UserRegistration;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author vipul
 */
public class DietitianAppointments extends javax.swing.JFrame {

    /**
     * Creates new form SAHomePage
     */
    public String email_id;
    public String userName;
    public DietitianAppointments(String email_id) {
        this.email_id = email_id;
        initComponents();
        this.userName = getUserNameFromEmail(email_id);
        System.out.println(userName);
        lblWelcome.setText("Welcome, " + this.userName);
        
        populateTableData();
    }
    
    //comment after testing
    public DietitianAppointments(String name, int i) {
        initComponents();
        this.userName = name;
        lblWelcome.setText("Welcome, " + this.userName);
        populateTableData();
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
        lblApppointments = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        panelMedical1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lblHeight2 = new javax.swing.JLabel();
        txtPreference = new javax.swing.JTextField();
        lblHeight3 = new javax.swing.JLabel();
        txtWorkout = new javax.swing.JTextField();
        lblHeight4 = new javax.swing.JLabel();
        txtCholesterol = new javax.swing.JTextField();
        lblCarbs = new javax.swing.JLabel();
        txtCalories = new javax.swing.JTextField();
        txtProtein = new javax.swing.JTextField();
        txtCarbs = new javax.swing.JTextField();
        txtFats = new javax.swing.JTextField();
        txtSodium = new javax.swing.JTextField();
        lblHeight5 = new javax.swing.JLabel();
        lblHeight6 = new javax.swing.JLabel();
        lblHeight7 = new javax.swing.JLabel();
        lblHeight8 = new javax.swing.JLabel();
        lblHeight9 = new javax.swing.JLabel();
        lblHeight10 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHeight11 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblHeight12 = new javax.swing.JLabel();
        txtPurpose = new javax.swing.JTextField();
        lblHeight13 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();

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
        lblHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomePageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomePageMouseEntered(evt);
            }
        });
        jPanel7.add(lblHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        lblApppointments.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        lblApppointments.setForeground(new java.awt.Color(255, 255, 255));
        lblApppointments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/users_sadmin_29px.png"))); // NOI18N
        lblApppointments.setText("   Appointments");
        lblApppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblApppointmentsMouseClicked(evt);
            }
        });
        jPanel3.add(lblApppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, -1));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 580));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Time", "User Name", "Gender", "Age", "Contact", "Purpose", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableView);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 770, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 16)); // NOI18N
        jLabel1.setText("Your Scheduled Appointments:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnAccept.setBackground(new java.awt.Color(255, 51, 51));
        btnAccept.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        jPanel4.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 102, 35));

        btnReject.setBackground(new java.awt.Color(255, 51, 51));
        btnReject.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        jPanel4.add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 102, 35));

        panelMedical1.setBackground(new java.awt.Color(255, 255, 255, 180));
        panelMedical1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelMedical1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        panelMedical1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 200, 30));

        lblHeight2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight2.setText("Calories");
        panelMedical1.add(lblHeight2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 130, -1));

        txtPreference.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreferenceKeyTyped(evt);
            }
        });
        panelMedical1.add(txtPreference, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 30));

        lblHeight3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight3.setText("  Food Preference");
        panelMedical1.add(lblHeight3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        txtWorkout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorkoutKeyTyped(evt);
            }
        });
        panelMedical1.add(txtWorkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, 30));

        lblHeight4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight4.setText(" Workout Frequency");
        panelMedical1.add(lblHeight4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, -1));

        txtCholesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCholesterolActionPerformed(evt);
            }
        });
        panelMedical1.add(txtCholesterol, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 210, 30));

        lblCarbs.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        lblCarbs.setText("How much should be the daily nutritional intake?");
        panelMedical1.add(lblCarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));
        panelMedical1.add(txtCalories, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 210, 30));
        panelMedical1.add(txtProtein, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 210, 30));
        panelMedical1.add(txtCarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 210, 30));
        panelMedical1.add(txtFats, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 210, 30));
        panelMedical1.add(txtSodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, 30));

        lblHeight5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight5.setText("  User Name");
        panelMedical1.add(lblHeight5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));

        lblHeight6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight6.setText("Cholesterol");
        panelMedical1.add(lblHeight6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 130, -1));

        lblHeight7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight7.setText("Sodium");
        panelMedical1.add(lblHeight7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 130, -1));

        lblHeight8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight8.setText("Fats");
        panelMedical1.add(lblHeight8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 130, -1));

        lblHeight9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight9.setText("Carbohydrates");
        panelMedical1.add(lblHeight9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, -1));

        lblHeight10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight10.setText("Protein");
        panelMedical1.add(lblHeight10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 130, -1));

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        panelMedical1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, 30));

        lblHeight11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight11.setText("  Age");
        panelMedical1.add(lblHeight11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGenderKeyTyped(evt);
            }
        });
        panelMedical1.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, 30));

        lblHeight12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight12.setText("  Gender");
        panelMedical1.add(lblHeight12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, -1));

        txtPurpose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurposeKeyTyped(evt);
            }
        });
        panelMedical1.add(txtPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, 30));

        lblHeight13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/userIcons/height_29px.png"))); // NOI18N
        lblHeight13.setText("  Purpose");
        panelMedical1.add(lblHeight13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

        jPanel4.add(panelMedical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 770, 280));

        btnBook.setBackground(new java.awt.Color(255, 51, 51));
        btnBook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Prescribe Diet Plan");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel4.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 180, 40));

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

    private void lblApppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApppointmentsMouseClicked
        // TODO add your handling code here:
        UserRegistration frame = new UserRegistration();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblApppointmentsMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        // TODO add your handling code here:
        lblClose.setForeground(Color.red);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseClicked
        // TODO add your handling code here:
        DietitianUpdateInfo frame = new DietitianUpdateInfo(this.userName);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAccountMouseClicked

    private void lblHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomePageMouseClicked
        // TODO add your handling code here:
        DietitianHomePage fr = new DietitianHomePage(this.userName, 0);
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblHomePageMouseClicked

    private void tableViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewMouseClicked
        // TODO add your handling code here:
        int rowIndex = tableView.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableView.getModel();

        String status = String.valueOf(model.getValueAt(rowIndex,8));
        System.out.println(status);
        if(status.equals("Confirmed")){
            btnAccept.setEnabled(false);
            btnReject.setEnabled(false);
            
            viewUpdatePlan(rowIndex);
        }
        else{
            btnAccept.setEnabled(true);
            btnReject.setEnabled(true);
        }
        

    }//GEN-LAST:event_tableViewMouseClicked
    
    
    public void viewUpdatePlan(int index){
        
        DefaultTableModel model = (DefaultTableModel) tableView.getModel();

        String name = String.valueOf(model.getValueAt(index,3));
        
        DietitianAppointmentRequest dq = new DietitianAppointmentRequest();
        ResultSet res = dq.selectOwnConfirmedAppointmentDetails(this.userName);
        
        
        try{
            
            
            while(res.next()){
                
                txtName.setText(res.getString("Name"));
                txtGender.setText(res.getString("Gender"));
                txtAge.setText(String.valueOf( res.getInt("Age")));
                txtPurpose.setText(res.getString("Purpose"));
                txtPreference.setText(res.getString("Food_Preference"));
                txtWorkout.setText(res.getString("Workout_Frequency"));
                
                
                txtName.setEditable(false);
                txtGender.setEditable(false);
                txtAge.setEditable(false);
                txtPurpose.setEditable(false);
                txtPreference.setEditable(false);
                txtWorkout.setEditable(false);
                
            }
            
        }
        catch(SQLException ex){
            Logger.getLogger(DietitianAppointments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int rowIndex = tableView.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableView.getModel();
        //        User selectedUser =(User)model.getValueAt(rowIndex,1);

        int id = Integer.parseInt(model.getValueAt(rowIndex,0).toString());
        
        DietitianAppointmentRequest dreq = new DietitianAppointmentRequest();
        dreq.acceptRequestByID(id);
        
        populateTableData();
        

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int rowIndex = tableView.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableView.getModel();
        //        User selectedUser =(User)model.getValueAt(rowIndex,1);

        int id = Integer.parseInt(model.getValueAt(rowIndex,0).toString());

        DietitianAppointmentRequest dreq = new DietitianAppointmentRequest();
        dreq.rejectRequestByID(id);
        
        populateTableData();

    }//GEN-LAST:event_btnRejectActionPerformed

    private void lblHomePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomePageMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomePageMouseEntered

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        char typedName = evt.getKeyChar();
        if(!Character.isAlphabetic(typedName) && !Character.isWhitespace(typedName)){
            evt.consume();
        }
        //Restrict the length to 256
        if(txtName.getText().length() > 255){
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPreferenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreferenceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreferenceKeyTyped

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:

        if(true){

            String username = txtName.getText();
            float calories = Float.parseFloat(txtCalories.getText());
            float protein = Float.parseFloat(txtProtein.getText());
            float carbs = Float.parseFloat(txtCarbs.getText());
            float fats = Float.parseFloat(txtFats.getText());
            float sodium = Float.parseFloat(txtSodium.getText());
            float cholesterol = Float.parseFloat(txtCholesterol.getText());
            
            DietPlan dp = new DietPlan();
            dp.insertRecords(username, calories, protein, carbs, fats, sodium, cholesterol);
            
            
            
            new DietIntake().createDailyIntakeDefaultRecord(username);
            resetForm();
        }
    }//GEN-LAST:event_btnBookActionPerformed

    
    
    public void resetForm(){
    
        txtName.setText(null);
        txtAge.setText(null);
        txtGender.setText(null);
        txtPurpose.setText(null);
        txtPreference.setText(null);
        txtWorkout.setText(null);
        txtCalories.setText(null);
        txtProtein.setText(null);
        txtCarbs.setText(null);
        txtFats.setText(null);
        txtSodium.setText(null);
        txtCholesterol.setText(null);
    }
    
    
    private void txtWorkoutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkoutKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkoutKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyTyped

    private void txtPurposeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurposeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurposeKeyTyped

    private void txtCholesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCholesterolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCholesterolActionPerformed
    
    public String getUserNameFromEmail(String email_id){
        
        DietitianDirectory dd = new DietitianDirectory();
        ResultSet res = dd.getDietitianNameByEmail(email_id);
        
        try{
            
            while(res.next()){
                this.userName = res.getString("Name");
            }
        }
        catch(SQLException ex){
            Logger.getLogger(DietitianAppointments.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.userName;
    }
    
    public void populateTableData(){
    
        
        DefaultTableModel model = (DefaultTableModel) tableView.getModel();
        
        //Clear the table 
        model.setRowCount(0);
        
        DietitianAppointmentRequest dreq = new DietitianAppointmentRequest();
        ResultSet res = dreq.selectOwnAllAppointmentDetails(this.userName);
        
        try{
            
            while(res.next()){
                Object[] row = new Object[9];
                row[0] = res.getInt("appointmentID");
                row[1] = res.getDate("date");
                row[2] = res.getTime("time");
                row[3] = res.getString("Name");
                row[4] = res.getString("Gender");
                row[5] = res.getInt("Age");
                row[6] = res.getLong("Contact");
                row[7] = res.getString("Purpose");
                row[8] = res.getString("Status");
                
                model.addRow(row);
            }
            
        }
        catch(SQLException ex){
            Logger.getLogger(DietitianAppointments.class.getName()).log(Level.SEVERE, null, ex);
        }
    
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
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblApppointments;
    private javax.swing.JLabel lblCarbs;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHeight10;
    private javax.swing.JLabel lblHeight11;
    private javax.swing.JLabel lblHeight12;
    private javax.swing.JLabel lblHeight13;
    private javax.swing.JLabel lblHeight2;
    private javax.swing.JLabel lblHeight3;
    private javax.swing.JLabel lblHeight4;
    private javax.swing.JLabel lblHeight5;
    private javax.swing.JLabel lblHeight6;
    private javax.swing.JLabel lblHeight7;
    private javax.swing.JLabel lblHeight8;
    private javax.swing.JLabel lblHeight9;
    private javax.swing.JLabel lblHomePage;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panelMedical1;
    private javax.swing.JTable tableView;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCalories;
    private javax.swing.JTextField txtCarbs;
    private javax.swing.JTextField txtCholesterol;
    private javax.swing.JTextField txtFats;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPreference;
    private javax.swing.JTextField txtProtein;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtSodium;
    private javax.swing.JTextField txtWorkout;
    // End of variables declaration//GEN-END:variables
}
