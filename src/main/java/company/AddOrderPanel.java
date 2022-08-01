/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package company;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class AddOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form addOrderPanel
     */
    private final String registeredMessage = "The customer is already registered .";
    private final String notFoundMessage = "Please enter customer information here .";
    private boolean isFound = false;
    public static String id = "";
    public static String fName = "";
    public static String lName = "";
    public static String address = "";
    public static String phone = "";

    public AddOrderPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        enterField = new javax.swing.JTextField();
        allPanel = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(935, 448));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setText("** NEW ORDER **");

        jButton1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter customer ID :");

        enterField.setBackground(new java.awt.Color(204, 204, 204));
        enterField.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        enterField.setForeground(new java.awt.Color(255, 0, 0));
        enterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        allPanel.setEnabled(false);
        allPanel.setOpaque(false);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Customer ID :");

        jLabel15.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 255, 255));
        jLabel15.setText("Customer First Name :");

        jLabel16.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 255, 255));
        jLabel16.setText("Customer Last Name :");

        jLabel17.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 255, 255));
        jLabel17.setText("Address :");

        jLabel18.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 255, 255));
        jLabel18.setText("Phone :");

        idField.setBackground(new java.awt.Color(204, 204, 204));
        idField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(51, 0, 204));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        fNameField.setBackground(new java.awt.Color(204, 204, 204));
        fNameField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fNameField.setForeground(new java.awt.Color(51, 0, 204));
        fNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameFieldActionPerformed(evt);
            }
        });

        lNameField.setBackground(new java.awt.Color(204, 204, 204));
        lNameField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lNameField.setForeground(new java.awt.Color(51, 0, 204));
        lNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameFieldActionPerformed(evt);
            }
        });

        addressField.setBackground(new java.awt.Color(204, 204, 204));
        addressField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressField.setForeground(new java.awt.Color(51, 0, 204));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        phoneField.setBackground(new java.awt.Color(204, 204, 204));
        phoneField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneField.setForeground(new java.awt.Color(51, 0, 204));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(fNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        messageLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(102, 255, 102));

        updateButton.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton4.setText("NEXT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout allPanelLayout = new javax.swing.GroupLayout(allPanel);
        allPanel.setLayout(allPanelLayout);
        allPanelLayout.setHorizontalGroup(
            allPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(allPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(allPanelLayout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addGap(30, 30, 30)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        allPanelLayout.setVerticalGroup(
            allPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(allPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(allPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(allPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(allPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameFieldActionPerformed

    private void lNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        messageLabel.setText("");
        String idString = enterField.getText().trim();
        if (idString.equals("")) {
            messageLabel.setText("Invalid id.. id must contains 9 digits .");
            setPanelEnabled(allPanel, false);
            messageLabel.setEnabled(true);
            return;
        }
        if(idString.length() != 9){
            messageLabel.setText("Invalid id.. id must contains 9 digits .");
            setPanelEnabled(allPanel, false);
            messageLabel.setEnabled(true);
            return;
        }
        long id = 0;
        try {
            id = Long.parseLong(idString);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(Main.URL);
            PreparedStatement stmt = con.prepareStatement("select * from customers where id = ?");
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                messageLabel.setText(notFoundMessage);
                isFound = false;
                setPanelEnabled(allPanel, true);
                idField.setEditable(false);
                updateButton.setEnabled(false);
                idField.setText(idString);
                fNameField.setText("");
                lNameField.setText("");
                addressField.setText("");
                phoneField.setText("");
            } else {
                isFound = true;
                idField.setEditable(false);
                messageLabel.setText(registeredMessage);
                AddOrderPanel.id = idString;
                AddOrderPanel.fName = rs.getString("fName");
                AddOrderPanel.lName = rs.getString("lName");
                AddOrderPanel.address = rs.getString("address");
                AddOrderPanel.phone = rs.getString("phone");
                idField.setText(AddOrderPanel.id);
                fNameField.setText(AddOrderPanel.fName);
                lNameField.setText(AddOrderPanel.lName);
                addressField.setText(AddOrderPanel.address);
                phoneField.setText(AddOrderPanel.phone);
                setPanelEnabled(allPanel, true);
                updateButton.setEnabled(true);
            }
        } catch (NumberFormatException e) {
            messageLabel.setText("Invalid id.. id must contains 9 digits .");
            setPanelEnabled(allPanel, false);
            messageLabel.setEnabled(true);
            return;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed in connection to the database", "error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        messageLabel.setText("");
        long idLong = 0;
        if (fNameField.getText().equals("")) {
            messageLabel.setText("invalid First Name .");
            return;
        }
        if (lNameField.getText().equals("")) {
            messageLabel.setText("invalid Last Name .");
            return;
        }

        AddOrderPanel.id = idField.getText().trim();
        AddOrderPanel.fName = fNameField.getText().trim();
        AddOrderPanel.lName = lNameField.getText().trim();
        AddOrderPanel.address = addressField.getText().trim();
        AddOrderPanel.phone = phoneField.getText().trim();
        try {
            idLong = Long.parseLong(id);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(Main.URL);
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("update customers set fName = ?, lName = ?, address = ?, phone = ? where id = ?");
            stmt.setString(1, fName);
            stmt.setString(2, lName);
            stmt.setString(3, address);
            stmt.setString(4, phone);
            stmt.setLong(5, idLong);
            stmt.executeUpdate();

            messageLabel.setText("information updated successfully .");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed in connection to the database", "error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!isFound) {
            long idLong = 0;
            try {
                if (idField.getText().trim().length() != 9) {
                    messageLabel.setText("Invalid id.. id must contains 9 digits .");
                    return;
                }
                idLong = Long.parseLong(idField.getText().trim());
            } catch (NumberFormatException e) {
                messageLabel.setText("Invalid id .");
                return;
            }
            if (fNameField.getText().equals("")) {
                messageLabel.setText("invalid First Name .");
                return;
            }
            if (lNameField.getText().equals("")) {
                messageLabel.setText("invalid Last Name .");
                return;
            }
            AddOrderPanel.id = idField.getText().trim();
            AddOrderPanel.fName = fNameField.getText().trim();
            AddOrderPanel.lName = lNameField.getText().trim();
            AddOrderPanel.address = addressField.getText().trim();
            AddOrderPanel.phone = phoneField.getText().trim();

            try {

                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                Connection con = DriverManager.getConnection(Main.URL);
                PreparedStatement stmt = null;

                stmt = con.prepareStatement("insert into customers (id, fName, lName, address, phone) values(?, ?, ?, ?, ?)");
                stmt.setLong(1, idLong);
                stmt.setString(2, fName);
                stmt.setString(3, lName);
                stmt.setString(4, address);
                stmt.setString(5, phone);
                stmt.executeUpdate();

                stmt.close();
                con.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Failed in connection to the database", "error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        }
        
        this.setVisible(false);
        Home.addOrderSecondPanel.setVisible(true);
        Home.panelVisible = Home.addOrderSecondPanel;


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        idField.setText("");
        fNameField.setText("");
        lNameField.setText("");
        addressField.setText("");
        phoneField.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setPanelEnabled(allPanel, false);
        messageLabel.setEnabled(true);
        enterField.setText("");
        messageLabel.setText("");
        updateButton.setEnabled(false);
        idField.setText("");
        fNameField.setText("");
        lNameField.setText("");
        addressField.setText("");
        phoneField.setText("");
        AddOrderPanel.id = "";
        AddOrderPanel.fName = "";
        AddOrderPanel.lName = "";
        AddOrderPanel.address = "";
        AddOrderPanel.phone = "";
    }//GEN-LAST:event_formComponentShown

    static void setPanelEnabled(JPanel panel, Boolean isEnabled) {
    panel.setEnabled(isEnabled);

    Component[] components = panel.getComponents();

    for (Component component : components) {
        if (component instanceof JPanel) {
            setPanelEnabled((JPanel) component, isEnabled);
        }
        component.setEnabled(isEnabled);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JPanel allPanel;
    private javax.swing.JTextField enterField;
    private javax.swing.JTextField fNameField;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField lNameField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
