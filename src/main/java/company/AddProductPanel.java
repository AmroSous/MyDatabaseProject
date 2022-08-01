package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AddProductPanel extends javax.swing.JPanel {

   
    
    public AddProductPanel() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton10 = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        catagoryCombo = new javax.swing.JComboBox<>();
        brandCombo = new javax.swing.JComboBox<>();
        colorField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();

        setMinimumSize(new java.awt.Dimension(935, 448));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kPanel.setkEndColor(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setText("Products");

        kButton10.setForeground(new java.awt.Color(255, 51, 51));
        kButton10.setText("Clear");
        kButton10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        kButton10.setkEndColor(new java.awt.Color(255, 0, 51));
        kButton10.setkForeGround(new java.awt.Color(255, 0, 0));
        kButton10.setkHoverEndColor(new java.awt.Color(51, 51, 0));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton10.setkHoverStartColor(new java.awt.Color(102, 255, 204));
        kButton10.setkSelectedColor(new java.awt.Color(51, 204, 255));
        kButton10.setkStartColor(new java.awt.Color(255, 204, 51));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Name :");

        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setText("Catagory :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Brand :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setText("Color :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setText("Price :");

        colorField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        priceField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorField)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(catagoryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brandCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priceField))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catagoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(26, 26, 26))
        );

        kButton6.setForeground(new java.awt.Color(255, 51, 51));
        kButton6.setText("BACK");
        kButton6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        kButton6.setkEndColor(new java.awt.Color(255, 0, 51));
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverEndColor(new java.awt.Color(51, 51, 0));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton6.setkHoverStartColor(new java.awt.Color(102, 255, 204));
        kButton6.setkSelectedColor(new java.awt.Color(51, 204, 255));
        kButton6.setkStartColor(new java.awt.Color(255, 204, 51));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        kButton7.setForeground(new java.awt.Color(255, 51, 51));
        kButton7.setText("ADD");
        kButton7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        kButton7.setkEndColor(new java.awt.Color(255, 0, 51));
        kButton7.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverEndColor(new java.awt.Color(51, 51, 0));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton7.setkHoverStartColor(new java.awt.Color(102, 255, 204));
        kButton7.setkSelectedColor(new java.awt.Color(51, 204, 255));
        kButton7.setkStartColor(new java.awt.Color(255, 204, 51));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kPanelLayout = new javax.swing.GroupLayout(kPanel);
        kPanel.setLayout(kPanelLayout);
        kPanelLayout.setHorizontalGroup(
            kPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        kPanelLayout.setVerticalGroup(
            kPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(kPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(kPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed

        nameField.setText("");
        catagoryCombo.setSelectedItem("");
        brandCombo.setSelectedItem("");
        priceField.setText("");
        colorField.setText("");
    }//GEN-LAST:event_kButton10ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        if(nameField.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Product name is required .", "Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(catagoryCombo.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Catagory is required .", "Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(brandCombo.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Brand is required .", "Invalid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String name = nameField.getText().trim();
        int catagory = ProductsPanel.catagories_ids.get(catagoryCombo.getSelectedIndex());
        int brand = ProductsPanel.brands_ids.get(brandCombo.getSelectedIndex());
        String color = colorField.getText().trim();
        
        try{
            Float price = Float.parseFloat(priceField.getText().trim());
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(Main.URL);
            PreparedStatement stmt = con.prepareStatement("insert into products (id, name, catagory_id, brand_id, color, price) "
                    + "values(product_counter.nextval, ?, ?, ?, ?, ?)");
            stmt.setString(1, name);
            stmt.setInt(2, catagory);
            stmt.setInt(3, brand);
            stmt.setString(4, color);
            stmt.setFloat(5, price);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "The product was inserted successfully .", "Done", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid price .", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Failed in connection to the database.", "Oops !", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        this.setVisible(false);
        Home.productsPanel.setVisible(true);
        Home.panelVisible = Home.productsPanel;
    }//GEN-LAST:event_kButton6ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        nameField.setText("");
        colorField.setText("");
        priceField.setText("");
        
        int size = ProductsPanel.brands_names.size();
        for(int i = 0; i < size; i++)
            brandCombo.addItem(ProductsPanel.brands_names.get(i));
        size = ProductsPanel.catagories_names.size();
        for(int i = 0; i < size; i++)
            catagoryCombo.addItem(ProductsPanel.catagories_names.get(i));
        
        catagoryCombo.setSelectedIndex(0);
        brandCombo.setSelectedIndex(0);
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brandCombo;
    private javax.swing.JComboBox<String> catagoryCombo;
    private javax.swing.JTextField colorField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KGradientPanel kPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}
