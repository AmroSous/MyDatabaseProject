/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import static company.LoginFrame.addPlaceHolderStyle;
import static company.LoginFrame.removePlaceHolderStyle;
import static company.ProductsPanel.brands_ids;
import static company.ProductsPanel.catagories_ids;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2021
 */
public class CustomersPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomersInPanel
     */
    public CustomersPanel() {
        initComponents();
        LoginFrame.addPlaceHolderStyle(searchField);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InnerPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();

        setMinimumSize(new java.awt.Dimension(935, 448));
        setPreferredSize(new java.awt.Dimension(935, 448));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setText("Customers");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        kButton3.setText("FIND ALL");
        kButton3.setBorderPainted(false);
        kButton3.setFocusPainted(false);
        kButton3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        kButton3.setkBorderRadius(42);
        kButton3.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton3.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton3.setkPressedColor(new java.awt.Color(255, 51, 51));
        kButton3.setkStartColor(new java.awt.Color(0, 102, 153));
        kButton3.setMaximumSize(new java.awt.Dimension(97, 47));
        kButton3.setMinimumSize(new java.awt.Dimension(97, 47));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(204, 204, 255));
        searchField.setText("Search");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Address", "Phone" }));
        jComboBox1.setFocusable(false);
        jComboBox1.setMinimumSize(new java.awt.Dimension(71, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(71, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jLabel3.setText("Search by :");
        jLabel3.setMaximumSize(new java.awt.Dimension(71, 18));
        jLabel3.setMinimumSize(new java.awt.Dimension(71, 18));
        jLabel3.setPreferredSize(new java.awt.Dimension(71, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Select From Table ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("ID :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("First Name :");

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(204, 204, 204));
        idField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        fNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("Last Name :");

        addressField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("Phone :");

        lNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 0));
        jLabel9.setText("Address :");

        phoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 402));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "ID", "First Name", "Last Name", "Address", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        kButton2.setText("CLEAR");
        kButton2.setBorderPainted(false);
        kButton2.setFocusPainted(false);
        kButton2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton2.setkForeGround(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton2.setkPressedColor(new java.awt.Color(255, 51, 51));
        kButton2.setkStartColor(new java.awt.Color(0, 102, 153));
        kButton2.setMaximumSize(new java.awt.Dimension(111, 35));
        kButton2.setMinimumSize(new java.awt.Dimension(111, 35));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton1.setForeground(new java.awt.Color(0, 0, 0));
        kButton1.setText("UPDATE");
        kButton1.setBorderPainted(false);
        kButton1.setFocusPainted(false);
        kButton1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        kButton1.setkBorderRadius(42);
        kButton1.setkEndColor(new java.awt.Color(153, 153, 153));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton1.setkPressedColor(new java.awt.Color(255, 51, 51));
        kButton1.setkStartColor(new java.awt.Color(0, 102, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton6.setText("ORDERS");
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

        javax.swing.GroupLayout InnerPanelLayout = new javax.swing.GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(InnerPanelLayout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel4))
                                .addGroup(InnerPanelLayout.createSequentialGroup()
                                    .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(InnerPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InnerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InnerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if (searchField.getText().equals("Search")) {
            searchField.setText(null);
            searchField.requestFocus();
            removePlaceHolderStyle(searchField);
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if (searchField.getText().length() == 0) {
            addPlaceHolderStyle(searchField);
            searchField.setText("Search");
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        idField.setText("");
        fNameField.setText("");
        lNameField.setText("");
        addressField.setText("");
        phoneField.setText("");
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) this.jTable1.getModel();
        int row = this.jTable1.getSelectedRow();
        this.idField.setText((dtm.getValueAt(row, 1)).toString());
        this.fNameField.setText((dtm.getValueAt(row, 2)).toString());
        this.lNameField.setText((dtm.getValueAt(row, 3)).toString());
        this.addressField.setText((dtm.getValueAt(row, 4)) == null ? "" : (dtm.getValueAt(row, 4)).toString());
        this.phoneField.setText((dtm.getValueAt(row, 5)) == null ? "" : (dtm.getValueAt(row, 5)).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String item = ((String) jComboBox1.getSelectedItem()).toLowerCase();
        String searchText = searchField.getText().trim().toLowerCase();
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        Connection con = null;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection(Main.URL);
            switch (item) {
                case "id":
                    pstmt = con.prepareStatement("select id, fName, lName, address, phone from customers where id = ?");
                    pstmt.setLong(1, Long.parseLong(searchText));
                    rs = pstmt.executeQuery();
                    break;
                case "name":
                    pstmt = con.prepareStatement("select id, fName, lName, address, phone from customers "
                            + "where lower(fName || ' ' || lName) like ? or lower(fName || lName) like ?");
                    pstmt.setString(1, "%" + searchText + "%");
                    pstmt.setString(2, "%" + searchText + "%");
                    rs = pstmt.executeQuery();
                    break;
                case "address":
                    pstmt = con.prepareStatement("select id, fName, lName, address, phone from customers where lower(address) like ?");
                    pstmt.setString(1, "%" + searchText + "%");
                    rs = pstmt.executeQuery();
                    break;
                case "phone":
                    pstmt = con.prepareStatement("select id, fName, lName, address, phone from customers where phone = ?");
                    pstmt.setString(1, searchText);
                    rs = pstmt.executeQuery();
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "failed in connection to the database .", "error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException was caught .");
        }
        try {
            Main.buildTableModel(rs, jTable1);
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "nothing found");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        try {
            findAllCustomers();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "failed in connection to the database .", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        searchField.setText("Search");
        LoginFrame.addPlaceHolderStyle(searchField);
        idField.setText("");
        fNameField.setText("");
        lNameField.setText("");
        addressField.setText("");
        phoneField.setText(""); 
        try {
            findAllCustomers();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "failed in connection to the database .", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formComponentShown

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        if (idField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Choose a product from table", "Hint", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Long id = Long.parseLong(idField.getText().trim());
        String fName = fNameField.getText();
        if (fName.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid name .", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String lName = lNameField.getText();
        if (lName.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid name .", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String address = addressField.getText();
        String phone = phoneField.getText();

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection(Main.URL);
            stmt = con.prepareStatement("update customers set Fname = ?, lName = ?, address = ?, phone = ? where id = ?");
            stmt.setString(1, fName);
            stmt.setString(2, lName);
            stmt.setString(3, address);
            stmt.setString(4, phone);
            stmt.setLong(5, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer's information updated successfully .", "Done", JOptionPane.PLAIN_MESSAGE);
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed in connection to the database.", "Oops!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        DefaultTableModel dtm1 = (DefaultTableModel) this.jTable1.getModel();
        int row = this.jTable1.getSelectedRow();
        if (row == -1) {
            return;
        }
        BigDecimal id = (BigDecimal) dtm1.getValueAt(row, 1);
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(Main.URL);
            PreparedStatement stmt = con.prepareStatement("select orders.id, orders.order_date, "
                    + "sum(orderitems.quantity * products.price) as total "
                    + "from orders inner join orderitems on "
                    + "orders.id = orderitems.order_id inner join products on orderitems.product_id = products.id "
                    + "where orders.customer_id = ? "
                    + "group by orders.id, orders.order_date");
            stmt.setBigDecimal(1, id);
            ResultSet rs = stmt.executeQuery();
            CustomerOrdersPanel orders = new CustomerOrdersPanel();
            Main.buildTableModel(rs, orders.table);
            float total = 0;
            dtm1 = (DefaultTableModel)orders.table.getModel();
            for(int i = 0; i < dtm1.getRowCount(); i++){
                total += Float.parseFloat(dtm1.getValueAt(i, 3).toString());
            }
            orders.label.setText(total + "");
            Home.glassPane.add(orders);
            Home.glassPane.setVisible(true);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "failed in connection to the database .", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kButton6ActionPerformed

    private void findAllCustomers() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(Main.URL);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select id, fName, lName, address, phone from customers");
        Main.buildTableModel(rs, jTable1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel InnerPanel;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField fNameField;
    private javax.swing.JTextField idField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton6;
    private javax.swing.JTextField lNameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
