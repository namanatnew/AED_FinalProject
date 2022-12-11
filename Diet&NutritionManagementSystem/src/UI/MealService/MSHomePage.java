/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.MealService;

import Model.Organization.ProductDirectory;
import UI.Authenticate.LoginFrame;
import UI.GroceryStore.GSManageProduct;
import UI.User.UserRegistration;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author naman
 */
public class MSHomePage extends javax.swing.JFrame {

    /**
     * Creates new form SAHomePage
     */
    public MSHomePage() {
        initComponents();
        show_stats();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTop = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        panellGreen = new javax.swing.JPanel();
        panelLogout = new javax.swing.JLabel();
        panelRed = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelProducts = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        lblPending = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblApproved = new javax.swing.JLabel();
        lblPendingval = new javax.swing.JLabel();
        lblApprovedval = new javax.swing.JLabel();
        lblTotalval = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTop.setBackground(new java.awt.Color(121, 237, 39));

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

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel4.setText("Welcome, Grocery Store");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Diet Management System");

        lblClose.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 575, Short.MAX_VALUE)
                .addComponent(lblClose)
                .addGap(18, 18, 18))
            .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLayout.createSequentialGroup()
                    .addContainerGap(734, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(59, 59, 59)))
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTopLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTopLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClose)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap()))
        );

        getContentPane().add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        panelControl.setBackground(new java.awt.Color(51, 51, 51));
        panelControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panellGreen.setBackground(new java.awt.Color(121, 237, 39));
        panellGreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogout.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        panelLogout.setForeground(new java.awt.Color(255, 255, 255));
        panelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        panelLogout.setText("   Logout");
        panelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLogoutMouseClicked(evt);
            }
        });
        panellGreen.add(panelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        panelControl.add(panellGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 190, 45));

        panelRed.setBackground(new java.awt.Color(255, 51, 51));
        panelRed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel6.setText("  Home Page");
        panelRed.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        panelControl.add(panelRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        panelProducts.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        panelProducts.setForeground(new java.awt.Color(255, 255, 255));
        panelProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/product_sadmin_29px.png"))); // NOI18N
        panelProducts.setText(" Manage Products");
        panelProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelProductsMouseClicked(evt);
            }
        });
        panelProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelProductsKeyPressed(evt);
            }
        });
        panelControl.add(panelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, -1));

        getContentPane().add(panelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 580));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        panelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 770, 240));

        lblPending.setText("Total Pending Products");
        panelMain.add(lblPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblTotal.setText("Total Products in Store");
        panelMain.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblApproved.setText("Total Approved Products");
        panelMain.add(lblApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblPendingval.setText("jLabel9");
        panelMain.add(lblPendingval, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        lblApprovedval.setText("jLabel9");
        panelMain.add(lblApprovedval, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 40, -1));

        lblTotalval.setText("jLabel9");
        panelMain.add(lblTotalval, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        getContentPane().add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 830, 580));

        setSize(new java.awt.Dimension(1019, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void panelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelLogoutMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        UserRegistration frame = new UserRegistration();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void panelProductsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelProductsKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_panelProductsKeyPressed

    private void panelProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProductsMouseClicked
        // TODO add your handling code here:
        System.out.print("open register");
        MSManageProduct addprd = new MSManageProduct();
        addprd.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelProductsMouseClicked

    
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
            java.util.logging.Logger.getLogger(MSHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MSHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MSHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MSHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MSHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApproved;
    private javax.swing.JLabel lblApprovedval;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblPendingval;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalval;
    private javax.swing.JPanel panelControl;
    private javax.swing.JLabel panelLogout;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel panelProducts;
    private javax.swing.JPanel panelRed;
    private javax.swing.JPanel panelTop;
    private javax.swing.JPanel panellGreen;
    private javax.swing.JTable tblProducts;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        ProductDirectory product = new ProductDirectory();
        ResultSet res = product.getPendingProductData();
        tblProducts.setModel(DbUtils.resultSetToTableModel(res));
    }
    
    private void show_stats(){
            ProductDirectory product = new ProductDirectory();

            String res1 = product.getTotalProducts("Grocery Store Product");

            String res2 = product.getApprovedProducts();
            String res3 = product.getPendingProducts();
//            lblTotalval.setText(res1);
            lblApprovedval.setText(res2);
            lblPendingval.setText(res3);
        
    }
}
