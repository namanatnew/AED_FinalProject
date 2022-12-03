package UI;

import Model.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author naman
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    DBconnection conn;
    public LoginFrame() {
        initComponents();
        conn = new DBconnection();
        if(conn==null){
            JOptionPane.showMessageDialog(this, "DB Connection not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        mainPanel = new javax.swing.JPanel();
        lPanel = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        rPanel = new javax.swing.JPanel();
        txtUname = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblInvalid = new javax.swing.JLabel();
        txtPswrd = new javax.swing.JPasswordField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lPanel.setBackground(new java.awt.Color(121, 237, 39));
        lPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/balanced-diet_256x256.png"))); // NOI18N
        lPanel.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 270));

        mainPanel.add(lPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        rPanel.setBackground(new java.awt.Color(255, 255, 255));
        rPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rPanelFocusGained(evt);
            }
        });
        rPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUname.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtUname.setText("Enter Username");
        txtUname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtUname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnameFocusLost(evt);
            }
        });
        rPanel.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, 30));

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(121, 237, 39));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("My HEALTH Buddy");
        lblTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblTitleFocusGained(evt);
            }
        });
        rPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 100));

        lblInvalid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblInvalid.setForeground(new java.awt.Color(255, 51, 51));
        lblInvalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rPanel.add(lblInvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 380, -1));

        txtPswrd.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPswrd.setText("Enter Password");
        txtPswrd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPswrd.setEchoChar('\u0000');
        txtPswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPswrdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPswrdFocusLost(evt);
            }
        });
        rPanel.add(txtPswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 30));

        mainPanel.add(rPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, 500));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        dispose();
        SignupFrame sf = new SignupFrame();
        sf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUname.getText();
        String password = txtPswrd.getText();
        if (username.equals("Enter username") || password.equals("Enter password")){
//            JOptionPane.showMessageDialog(this,"Username or Password is empty","Error",JOptionPane.ERROR_MESSAGE);
            lblInvalid.setText("Username or Password is empty!");
        }
        else{
            userLogin(username,password);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPswrdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdFocusGained
        // TODO add your handling code here:
        if ("Enter Password".equals(txtPswrd.getText())){ 
            txtPswrd.setText(null);
            txtPswrd.requestFocus();
            txtPswrd.setEchoChar('*');
        }
    }//GEN-LAST:event_txtPswrdFocusGained

    private void txtPswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdFocusLost
        // TODO add your handling code here:
        if(txtPswrd.getText().length()==0){
            txtPswrd.setText("Enter Password");
            txtPswrd.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPswrdFocusLost

    private void rPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rPanelFocusGained
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_rPanelFocusGained

    private void lblTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblTitleFocusGained
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_lblTitleFocusGained

    private void txtUnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnameFocusGained
        // TODO add your handling code here:
        if ("Enter Username".equals(txtUname.getText())){ 
            txtUname.setText(null);
            txtUname.requestFocus();
        }
    }//GEN-LAST:event_txtUnameFocusGained

    private void txtUnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnameFocusLost
        // TODO add your handling code here:
        if(txtUname.getText().length()==0){
            txtUname.setText("Enter Username");
        }
    }//GEN-LAST:event_txtUnameFocusLost

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPanel lPanel;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblInvalid;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rPanel;
    private javax.swing.JPasswordField txtPswrd;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String username,String password){
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if(res.next()){
                dispose();
                MainFrame mf = new MainFrame();
                mf.setVisible(true);
                this.setVisible(false);
            }
            else{
                lblInvalid.setText("Please use valid credentials!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
