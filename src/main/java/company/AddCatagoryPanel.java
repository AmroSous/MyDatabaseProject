/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class AddCatagoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form addCatagoryPanel
     */
    public AddCatagoryPanel() {
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

        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();

        setMinimumSize(new java.awt.Dimension(935, 448));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 51, 255));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(900, 410));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setText("Catagories");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name :");
        jLabel6.setMaximumSize(new java.awt.Dimension(48, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(48, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(48, 20));

        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        kButton3.setText("CLEAR");
        kButton3.setBorderPainted(false);
        kButton3.setFocusPainted(false);
        kButton3.setFont(new java.awt.Font("Microsoft Tai Le", 3, 14)); // NOI18N
        kButton3.setkBorderRadius(40);
        kButton3.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton3.setkForeGround(new java.awt.Color(255, 0, 0));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton3.setkPressedColor(new java.awt.Color(255, 51, 51));
        kButton3.setkStartColor(new java.awt.Color(0, 102, 153));
        kButton3.setMaximumSize(new java.awt.Dimension(111, 35));
        kButton3.setMinimumSize(new java.awt.Dimension(111, 35));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton5.setText("ADD");
        kButton5.setBorderPainted(false);
        kButton5.setFocusPainted(false);
        kButton5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        kButton5.setkBorderRadius(40);
        kButton5.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton5.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton5.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton5.setkPressedColor(new java.awt.Color(255, 51, 51));
        kButton5.setkStartColor(new java.awt.Color(0, 102, 153));
        kButton5.setMaximumSize(new java.awt.Dimension(97, 47));
        kButton5.setMinimumSize(new java.awt.Dimension(97, 47));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        kButton6.setText("BACK");
        kButton6.setBorderPainted(false);
        kButton6.setFocusPainted(false);
        kButton6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        kButton6.setkBorderRadius(40);
        kButton6.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton6.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton6.setkPressedColor(new java.awt.Color(255, 51, 51));
        kButton6.setkStartColor(new java.awt.Color(0, 102, 153));
        kButton6.setMaximumSize(new java.awt.Dimension(97, 47));
        kButton6.setMinimumSize(new java.awt.Dimension(97, 47));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 362, Short.MAX_VALUE)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed

        nameField.setText("");
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        String name = nameField.getText().trim();
        PreparedStatement stmt = null;
        Connection con = null;
        ResultSet rs = null;
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection(Main.URL);
            stmt = con.prepareStatement("select name from catagories where lower(name) = ?");
            stmt.setString(1, name.toLowerCase());
            rs = stmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "There is a catagory with this name in the database .", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            } 
            stmt = con.prepareStatement("insert into catagories values (catagory_counter.nextval, ?)");
            stmt.setString(1, name);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(this, "The catagory added successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Fainled in connection to the database", "Oops!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        nameField.setText("");
    }//GEN-LAST:event_formComponentShown

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        this.setVisible(false);
        Home.catagoriesPanel.setVisible(true);
        Home.panelVisible = Home.catagoriesPanel;
    }//GEN-LAST:event_kButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
