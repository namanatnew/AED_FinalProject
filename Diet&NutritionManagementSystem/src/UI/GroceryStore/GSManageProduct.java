/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.GroceryStore;

import Model.Organization.ProductDirectory;
import UI.Authenticate.LoginFrame;
import UI.GroceryStore.GSHomePage;
import UI.Main.MainFrame;
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
public class GSManageProduct extends javax.swing.JFrame {
    DefaultTableModel model;
    public String name;
    /**
     * Creates new form NewJFrame
     * @param name
     */

    public GSManageProduct(String name) {
        initComponents();
        this.name = name;
        populateTable("");
    }
    
    public GSManageProduct() {
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
        panelProduct = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        panelNutrition = new javax.swing.JPanel();
        lblFat = new javax.swing.JLabel();
        txtProtein = new javax.swing.JTextField();
        lblRefQty = new javax.swing.JLabel();
        lblCalorie = new javax.swing.JLabel();
        lblChol = new javax.swing.JLabel();
        lblSodium = new javax.swing.JLabel();
        lblCarbs = new javax.swing.JLabel();
        lblProtein = new javax.swing.JLabel();
        txtRefQty = new javax.swing.JTextField();
        txtCalorie = new javax.swing.JTextField();
        txtFat = new javax.swing.JTextField();
        txtChol = new javax.swing.JTextField();
        txtSodium = new javax.swing.JTextField();
        txtCarbs = new javax.swing.JTextField();
        panelAddress2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct1 = new javax.swing.JTable();
        txtSearch1 = new javax.swing.JTextField();
        btnView1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnSend1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 179, 172));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("MANAGE PRODUCT & NUTRITION");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 6, 75, -1));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 75, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        tabbedPane.setBackground(new java.awt.Color(255, 204, 204));
        tabbedPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabbedPane.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        panelRegistration.setBackground(new java.awt.Color(51, 51, 51));

        panelProduct.setBackground(new java.awt.Color(255, 255, 255, 150));
        panelProduct.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Product Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        panelProduct.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, -1));

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Type:");
        panelProduct.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, -1));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Product Name:");
        panelProduct.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));

        txtType.setEditable(false);
        txtType.setText("Grocery Store Product");
        txtType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTypeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTypeKeyTyped(evt);
            }
        });
        panelProduct.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 210, -1));

        panelNutrition.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Nutrition Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 3, 10))); // NOI18N
        panelNutrition.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFat.setText("Total Fat:");
        panelNutrition.add(lblFat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));
        panelNutrition.add(txtProtein, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 210, -1));

        lblRefQty.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRefQty.setText("Refrence Quantity:");
        panelNutrition.add(lblRefQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        lblCalorie.setText("Calorie:");
        panelNutrition.add(lblCalorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblChol.setText("Cholesterol:");
        panelNutrition.add(lblChol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        lblSodium.setText("Sodium:");
        panelNutrition.add(lblSodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        lblCarbs.setText("Carbohydrates:");
        panelNutrition.add(lblCarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        lblProtein.setText("Protein:");
        panelNutrition.add(lblProtein, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));
        panelNutrition.add(txtRefQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, -1));
        panelNutrition.add(txtCalorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 210, -1));
        panelNutrition.add(txtFat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, -1));
        panelNutrition.add(txtChol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 210, -1));
        panelNutrition.add(txtSodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 210, -1));
        panelNutrition.add(txtCarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, -1));

        panelAddress2.setBackground(new java.awt.Color(255, 255, 255, 150));
        panelAddress2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N

        tblProduct1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProduct1);

        txtSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch1KeyReleased(evt);
            }
        });

        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnSend1.setText("Request to add product");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });

        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddress2Layout = new javax.swing.GroupLayout(panelAddress2);
        panelAddress2.setLayout(panelAddress2Layout);
        panelAddress2Layout.setHorizontalGroup(
            panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddress2Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAddress2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddress2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnView1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(56, 56, 56))
                    .addGroup(panelAddress2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        panelAddress2Layout.setVerticalGroup(
            panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddress2Layout.createSequentialGroup()
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddress2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAddress2Layout.createSequentialGroup()
                        .addComponent(btnSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView1)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRegistrationLayout = new javax.swing.GroupLayout(panelRegistration);
        panelRegistration.setLayout(panelRegistrationLayout);
        panelRegistrationLayout.setHorizontalGroup(
            panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrationLayout.createSequentialGroup()
                        .addComponent(panelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNutrition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelAddress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRegistrationLayout.setVerticalGroup(
            panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNutrition, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        btnRegister.setBackground(new java.awt.Color(255, 51, 51));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Add Product");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, -1, -1));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 75, -1));

        setSize(new java.awt.Dimension(1039, 706));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    public void resetForm(){
    
        txtName.setText(null);
//        txtType.setText(null);
        txtRefQty.setText(null);
        txtCalorie.setText(null);
        txtFat.setText(null);
        txtChol.setText(null);
        txtSodium.setText(null);
        txtCarbs.setText(null);
        txtProtein.setText(null);
             
         
    }
    
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        GSHomePage frame = new GSHomePage();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void dateDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateDOBKeyTyped

    }//GEN-LAST:event_dateDOBKeyTyped

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProduct1.getSelectedRow();
        model = (DefaultTableModel) tblProduct1.getModel();

        if(tblProduct1.getSelectedRowCount()==1){
            String name = txtName.getText();
            String type = txtType.getText();
            float refqty = Float.parseFloat(txtRefQty.getText());
            float calorie = Float.parseFloat(txtCalorie.getText());
            float fat = Float.parseFloat(txtFat.getText());
            float chol = Float.parseFloat(txtChol.getText());
            float sodium = Float.parseFloat(txtSodium.getText());
            float carbs = Float.parseFloat(txtCarbs.getText());
            float protein = Float.parseFloat(txtProtein.getText());

            ProductDirectory product = new ProductDirectory();
            product.updateProduct(type,refqty,calorie,fat,chol,sodium,carbs,protein,name);
            resetForm();
            populateTable("");
            JOptionPane.showMessageDialog(this, "Product is updated in the catalog!",
                "Product updated",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProduct1.getSelectedRow();
        model = (DefaultTableModel) tblProduct1.getModel();

        String product_name = model.getValueAt(selectedRow,0).toString();

        ProductDirectory product = new ProductDirectory();

        product.sendProduct(product_name);

        JOptionPane.showMessageDialog(this, "Product is requested for approval!",
            "Product deleted",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSend1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProduct1.getSelectedRow();
        model = (DefaultTableModel) tblProduct1.getModel();

        String product_name = model.getValueAt(selectedRow,0).toString();

        ProductDirectory product = new ProductDirectory();

        product.deleteProduct(product_name);
        populateTable("");
        JOptionPane.showMessageDialog(this, "Product is deleted from the catalog!",
            "Product deleted",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProduct1.getSelectedRow();
        model = (DefaultTableModel) tblProduct1.getModel();

        String product_name = model.getValueAt(selectedRow,0).toString();
        ProductDirectory product = new ProductDirectory();

        ResultSet res = product.exactProductLookup(product_name);
        try {
            while(res.next()){
            txtName.setText(res.getString(1));
            txtType.setText(res.getString(2));
            txtRefQty.setText(res.getString(3));
            txtCalorie.setText(res.getString(4));
            txtFat.setText(res.getString(5));
            txtChol.setText(res.getString(6));
            txtSodium.setText(res.getString(7));
            txtCarbs.setText(res.getString(8));
            txtProtein.setText(res.getString(9));
        }}
            catch (SQLException ex) {
            Logger.getLogger(GSManageProduct.class.getName()).log(Level.SEVERE, null, ex);
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
        GSManageProduct frame = new GSManageProduct();
        frame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String pname = txtName.getText();
        String type = txtType.getText();
        float ref_qty = Float.parseFloat(txtRefQty.getText());
        float calorie = Float.parseFloat(txtCalorie.getText());
        float fat = Float.parseFloat(txtFat.getText());
        float chol = Float.parseFloat(txtChol.getText());
        float sodium = Float.parseFloat(txtSodium.getText());
        float carbs = Float.parseFloat(txtCarbs.getText());
        float protein = Float.parseFloat(txtProtein.getText());

        ProductDirectory product = new ProductDirectory();

        if(product.alreadyExist(pname)){
            JOptionPane.showMessageDialog(this,"The given product already exists in thr product catalog",
                "Product already exists",JOptionPane.WARNING_MESSAGE);
        }
        else{
            product.addProduct(pname, type, ref_qty, calorie, fat, chol, sodium,
                carbs, protein,this.name);
            JOptionPane.showMessageDialog(this, "Product is added to the catalog",
                "Product added",JOptionPane.INFORMATION_MESSAGE);
            resetForm();
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

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

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased

    }//GEN-LAST:event_txtNameKeyReleased

    private void txtTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeKeyReleased

    private void txtTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeKeyTyped
           
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GSManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSend1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCalorie;
    private javax.swing.JLabel lblCarbs;
    private javax.swing.JLabel lblChol;
    private javax.swing.JLabel lblFat;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProtein;
    private javax.swing.JLabel lblRefQty;
    private javax.swing.JLabel lblSodium;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAddress2;
    private javax.swing.JPanel panelNutrition;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JPanel panelRegistration;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tblProduct1;
    private javax.swing.JTextField txtCalorie;
    private javax.swing.JTextField txtCarbs;
    private javax.swing.JTextField txtChol;
    private javax.swing.JTextField txtFat;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProtein;
    private javax.swing.JTextField txtRefQty;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txtSodium;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

    private void populateTable(String search) {
        ProductDirectory product = new ProductDirectory();
        ResultSet res = product.getProductData(search);
        tblProduct1.setModel(DbUtils.resultSetToTableModel(res));
    }
}
