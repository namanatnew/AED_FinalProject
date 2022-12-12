/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.SystemAdmin;

import Model.Account.AccountDirectory;
import Model.Enterprise.MealService.MealServiceDirectory;
import UI.Authenticate.LoginFrame;
import UI.GroceryStore.GSHomePage;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author naman
 */
public class ManageMealServiceSA extends javax.swing.JFrame {
    DefaultTableModel model;
    
    /**
     * Creates new form NewJFrame
     */

    public ManageMealServiceSA() {
        initComponents();
        populateTable("");
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
        lblTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelRegistration = new javax.swing.JPanel();
        panelStore = new javax.swing.JPanel();
        txtContact = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panelAddress2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblService = new javax.swing.JTable();
        txtSearch1 = new javax.swing.JTextField();
        btnUpdate1 = new javax.swing.JButton();
        btnView1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 179, 172));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(100, 129, 152));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("MANAGE MEAL SERVICES");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnLogout.setBackground(new java.awt.Color(192, 202, 97));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 6, 75, -1));

        btnHome.setBackground(new java.awt.Color(192, 202, 97));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 75, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        tabbedPane.setBackground(new java.awt.Color(255, 204, 204));
        tabbedPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabbedPane.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        panelRegistration.setBackground(new java.awt.Color(51, 51, 51));

        panelStore.setBackground(new java.awt.Color(255, 255, 255, 150));
        panelStore.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Meal Service Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelStore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });
        panelStore.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, -1));

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password:");
        panelStore.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, -1));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Store Name:");
        panelStore.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        panelStore.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        panelStore.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, -1));

        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContact.setText("Contact:");
        panelStore.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmail.setText("Email:");
        panelStore.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        panelStore.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 210, -1));

        btnRegister.setBackground(new java.awt.Color(255, 51, 51));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Add Meal Service");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        panelAddress2.setBackground(new java.awt.Color(255, 255, 255, 150));
        panelAddress2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View & Modify Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N

        tblService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Service Name", "Contact", "Email ID", "Created At"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblService);

        txtSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch1ActionPerformed(evt);
            }
        });
        txtSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelAddress2Layout = new javax.swing.GroupLayout(panelAddress2);
        panelAddress2.setLayout(panelAddress2Layout);
        panelAddress2Layout.setHorizontalGroup(
            panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddress2Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddress2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelAddress2Layout.setVerticalGroup(
            panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddress2Layout.createSequentialGroup()
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnUpdate1.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnView1.setBackground(new java.awt.Color(255, 51, 51));
        btnView1.setForeground(new java.awt.Color(255, 255, 255));
        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrationLayout = new javax.swing.GroupLayout(panelRegistration);
        panelRegistration.setLayout(panelRegistrationLayout);
        panelRegistrationLayout.setHorizontalGroup(
            panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrationLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAddress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRegistrationLayout.setVerticalGroup(
            panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStore, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClear)
                    .addComponent(btnUpdate1)
                    .addComponent(btnView1)
                    .addComponent(btnDelete1))
                .addGap(18, 18, 18)
                .addComponent(panelAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Registration", panelRegistration);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, -1, -1));

        setSize(new java.awt.Dimension(1039, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    public void resetForm(){
        
        txtName.setText(null);
        txtContact.setText(null);
        txtEmail.setText(null);
        txtPassword.setText(null);    
    }
    
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        SAHomePage frame = new SAHomePage();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void dateDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateDOBKeyTyped

    }//GEN-LAST:event_dateDOBKeyTyped

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblService.getSelectedRow();
        model = (DefaultTableModel) tblService.getModel();

        if(tblService.getSelectedRowCount()==1){
            String name = txtName.getText();
            String contact = txtContact.getText();
            String email = txtEmail.getText();        
            String password = txtPassword.getText();

            MealServiceDirectory store = new MealServiceDirectory();
            store.updateService(name, contact, email, password);
            resetForm();
            populateTable("");
            JOptionPane.showMessageDialog(this, "Meal Service is updated in the directory!",
                "Meal Service updated",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblService.getSelectedRow();
        model = (DefaultTableModel) tblService.getModel();

        String store_name = model.getValueAt(selectedRow,0).toString();

        MealServiceDirectory store = new MealServiceDirectory();
        store.deleteService(store_name);
        populateTable("");
        JOptionPane.showMessageDialog(this, "Meal Service is deleted from the directory!",
            "Meal Service deleted",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRow = tblService.getSelectedRow();
            model = (DefaultTableModel) tblService.getModel();
            
            String store_name = model.getValueAt(selectedRow,0).toString();
            MealServiceDirectory store = new MealServiceDirectory();

            ResultSet res = store.exactServiceLookup(store_name);
            while(res.next()){
            txtName.setText(res.getString(1));
            txtContact.setText(res.getString(2));
            txtEmail.setText(res.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageMealServiceSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnView1ActionPerformed

    private void txtSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch1KeyReleased
        // TODO add your handling code here:
        String search = txtSearch1.getText();
        populateTable(search);
    }//GEN-LAST:event_txtSearch1KeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        resetForm();
        ManageMealServiceSA frame = new ManageMealServiceSA();
        frame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String contact = txtContact.getText();
        String email = txtEmail.getText();        
        String password = txtPassword.getText();

        MealServiceDirectory store = new MealServiceDirectory();
        AccountDirectory ac = new AccountDirectory();
        if(store.alreadyExist(name)){
            JOptionPane.showMessageDialog(this,"The given Meal Service already exists in the directory",
                "Meal Service already exists",JOptionPane.WARNING_MESSAGE);
        }
        else{
            store.addMealService(name, contact, email);
            ac.addUserCredential(email, password, "Meal Service");
            JOptionPane.showMessageDialog(this, "Meal Service is added to the directory",
                "Meal Service added",JOptionPane.INFORMATION_MESSAGE);
            resetForm();
            populateTable("");
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased

    }//GEN-LAST:event_txtContactKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMealServiceSA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAddress2;
    private javax.swing.JPanel panelRegistration;
    private javax.swing.JPanel panelStore;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tblService;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch1;
    // End of variables declaration//GEN-END:variables

    private void populateTable(String search) {
        MealServiceDirectory store = new MealServiceDirectory();
        ResultSet res = store.getServiceData(search);
        tblService.setModel(DbUtils.resultSetToTableModel(res));
    }
}
