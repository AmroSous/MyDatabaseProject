package company;


import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static oracle.sql.NUMBER.e;


public class Home extends javax.swing.JFrame  {
int xx,xy;
public static JPanel panelVisible;
public static JPanel addProductsPanel;
public static JPanel productsPanel;
public static JPanel addCatagoryPanel;
public static JPanel catagoriesPanel;
public static JPanel addBrandPanel;
public static JPanel brandsPanel;
public static JPanel warehousesPanel;
public static JPanel addWarehousePanel;
public static JPanel ordersPanel;
public static JPanel addOrderPanel;
public static Container glassPane;
public static JPanel addOrderSecondPanel;
public static JPanel accountPanel;
public static String userName;

    public Home(String userName) {
        this.userName = userName;
        this.setGlassPane(new JComponent(){
            @Override
            protected void paintComponent(Graphics g){
                g.setColor(new Color(0, 0, 0, 150));
                g.fillRect(jPanel2.getX(), jPanel2.getY(), jPanel2.getWidth(), jPanel2.getHeight());
            }
        });
        glassPane = (Container)this.getGlassPane();
        glassPane.setLayout(new GridBagLayout());
        glassPane.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                glassPane.removeAll();
                glassPane.setVisible(false);
            }
        });
        ////////////////////////////////////
         initComponents();
        usernameLabel.setText(userName);
        ///////////////////////////////////////////
        homePanel1.setVisible(true);
        brandsPanel1.setVisible(false);
        addBrandPanel1.setVisible(false);
        catagoriesPanel1.setVisible(false);
        addCatagoryPanel1.setVisible(false);
        warehousesPanel1.setVisible(false);
        addWarehousePanel1.setVisible(false);
        customersPanel1.setVisible(false);
        productsPanel1.setVisible(false);
        addProductPanel1.setVisible(false);
        ordersPanel1.setVisible(false);
        addOrderPanel1.setVisible(false);
        addOrderSecondPanel1.setVisible(false);
        accountPanel1.setVisible(false);
        ////////////////////////////////////////////////
        panelVisible = homePanel1;
        catagoriesPanel = this.catagoriesPanel1;
        addCatagoryPanel = addCatagoryPanel1;
        brandsPanel = this.brandsPanel1;
        addBrandPanel = this.addBrandPanel1;
        productsPanel = this.productsPanel1;
        addProductsPanel = this.addProductPanel1;
        warehousesPanel = this.warehousesPanel1;
        addWarehousePanel = this.addWarehousePanel1;
        ordersPanel = this.ordersPanel1;
        addOrderPanel = this.addOrderPanel1;
        addOrderSecondPanel = this.addOrderSecondPanel1;
        accountPanel = this.accountPanel1;
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        brandsLabel = new javax.swing.JLabel();
        customersLabel = new javax.swing.JLabel();
        catagoriesLabel = new javax.swing.JLabel();
        ordersLabel = new javax.swing.JLabel();
        reportsLabel = new javax.swing.JLabel();
        warehousesLabel = new javax.swing.JLabel();
        productsLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addOrderPanel1 = new company.AddOrderPanel();
        homePanel1 = new company.HomePanel();
        productsPanel1 = new company.ProductsPanel();
        ordersPanel1 = new company.OrdersPanel();
        addProductPanel1 = new company.AddProductPanel();
        catagoriesPanel1 = new company.CatagoriesPanel();
        addCatagoryPanel1 = new company.AddCatagoryPanel();
        addBrandPanel1 = new company.AddBrandPanel();
        brandsPanel1 = new company.BrandsPanel();
        warehousesPanel1 = new company.WarehousesPanel();
        customersPanel1 = new company.CustomersPanel();
        addWarehousePanel1 = new company.AddWarehousePanel();
        addOrderSecondPanel1 = new company.AddOrderSecondPanel();
        accountPanel1 = new company.AccountPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1235, 621));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        bg.setBackground(new java.awt.Color(0, 51, 51));

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 204));
        jLabel8.setText("Order Manger");

        homeLabel.setBackground(new java.awt.Color(153, 255, 204));
        homeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(204, 204, 204));
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h.png"))); // NOI18N
        homeLabel.setText("    Home");
        homeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });

        brandsLabel.setBackground(new java.awt.Color(153, 255, 204));
        brandsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandsLabel.setForeground(new java.awt.Color(204, 204, 204));
        brandsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bra.png"))); // NOI18N
        brandsLabel.setText("    Brands");
        brandsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        brandsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brandsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                brandsLabelMouseExited(evt);
            }
        });

        customersLabel.setBackground(new java.awt.Color(153, 255, 204));
        customersLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customersLabel.setForeground(new java.awt.Color(204, 204, 204));
        customersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer_32px.png"))); // NOI18N
        customersLabel.setText("    Customers");
        customersLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        customersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customersLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customersLabelMouseExited(evt);
            }
        });

        catagoriesLabel.setBackground(new java.awt.Color(153, 255, 204));
        catagoriesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catagoriesLabel.setForeground(new java.awt.Color(204, 204, 204));
        catagoriesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png"))); // NOI18N
        catagoriesLabel.setText("    Catagories");
        catagoriesLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        catagoriesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catagoriesLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                catagoriesLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                catagoriesLabelMouseExited(evt);
            }
        });

        ordersLabel.setBackground(new java.awt.Color(153, 255, 204));
        ordersLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ordersLabel.setForeground(new java.awt.Color(204, 204, 204));
        ordersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order.png"))); // NOI18N
        ordersLabel.setText("    Orders");
        ordersLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        ordersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ordersLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordersLabelMouseExited(evt);
            }
        });

        reportsLabel.setBackground(new java.awt.Color(153, 255, 204));
        reportsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportsLabel.setForeground(new java.awt.Color(204, 204, 204));
        reportsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h.png"))); // NOI18N
        reportsLabel.setText("    User account");
        reportsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        reportsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsLabelMouseExited(evt);
            }
        });

        warehousesLabel.setBackground(new java.awt.Color(153, 255, 204));
        warehousesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        warehousesLabel.setForeground(new java.awt.Color(204, 204, 204));
        warehousesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w.png"))); // NOI18N
        warehousesLabel.setText("    Warehouses");
        warehousesLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        warehousesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                warehousesLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                warehousesLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                warehousesLabelMouseExited(evt);
            }
        });

        productsLabel.setBackground(new java.awt.Color(153, 255, 204));
        productsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productsLabel.setForeground(new java.awt.Color(204, 204, 204));
        productsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h.png"))); // NOI18N
        productsLabel.setText("    Products");
        productsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 0, 0));
        productsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(brandsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(catagoriesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ordersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(warehousesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(customersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(productsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catagoriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brandsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warehousesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(110, 89, 222));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jTextField8.setText("Under Supervision Of Dr.Syfean Smara");
        jTextField8.setBorder(null);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(110, 89, 222));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jTextField9.setText("Data Base Project");
        jTextField9.setBorder(null);

        usernameLabel.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 255, 51));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit_32px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(935, 448));
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));
        jPanel2.add(addOrderPanel1);
        jPanel2.add(homePanel1);
        jPanel2.add(productsPanel1);
        jPanel2.add(ordersPanel1);
        jPanel2.add(addProductPanel1);
        jPanel2.add(catagoriesPanel1);
        jPanel2.add(addCatagoryPanel1);
        jPanel2.add(addBrandPanel1);
        jPanel2.add(brandsPanel1);
        jPanel2.add(warehousesPanel1);
        jPanel2.add(customersPanel1);
        jPanel2.add(addWarehousePanel1);
        jPanel2.add(addOrderSecondPanel1);
        jPanel2.add(accountPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
     System.exit(0);
    }//GEN-LAST:event_jLabel9MousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); 
    }//GEN-LAST:event_formMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        panelVisible.setVisible(false);
        homePanel1.setVisible(true);
        panelVisible = homePanel1;
    }//GEN-LAST:event_homeLabelMouseClicked

    private void catagoriesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catagoriesLabelMouseClicked
        panelVisible.setVisible(false);
        catagoriesPanel1.setVisible(true);
        panelVisible = catagoriesPanel1;
    }//GEN-LAST:event_catagoriesLabelMouseClicked

    private void brandsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandsLabelMouseClicked
        panelVisible.setVisible(false);
        brandsPanel1.setVisible(true);
        panelVisible = brandsPanel1;
    }//GEN-LAST:event_brandsLabelMouseClicked

    private void warehousesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousesLabelMouseClicked
        panelVisible.setVisible(false);
        warehousesPanel1.setVisible(true);
        panelVisible = warehousesPanel1;
    }//GEN-LAST:event_warehousesLabelMouseClicked

    private void customersLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersLabelMouseClicked
        panelVisible.setVisible(false);
        customersPanel1.setVisible(true);
        panelVisible = customersPanel1;
    }//GEN-LAST:event_customersLabelMouseClicked

    private void ordersLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseClicked
        panelVisible.setVisible(false);
        ordersPanel1.setVisible(true);
        panelVisible = ordersPanel1;
    }//GEN-LAST:event_ordersLabelMouseClicked

    private void reportsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLabelMouseClicked
        panelVisible.setVisible(false);
        accountPanel1.setVisible(true);
        panelVisible = accountPanel1;
    }//GEN-LAST:event_reportsLabelMouseClicked

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homeLabel.setOpaque(true);
        homeLabel.setForeground(Color.black);
    }//GEN-LAST:event_homeLabelMouseEntered

    private void catagoriesLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catagoriesLabelMouseEntered
        catagoriesLabel.setOpaque(true);
        catagoriesLabel.setForeground(Color.black);
    }//GEN-LAST:event_catagoriesLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeLabel.setOpaque(false);
        homeLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_homeLabelMouseExited

    private void brandsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandsLabelMouseEntered
        brandsLabel.setOpaque(true);
        brandsLabel.setForeground(Color.black);
    }//GEN-LAST:event_brandsLabelMouseEntered

    private void warehousesLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousesLabelMouseEntered
        warehousesLabel.setOpaque(true);
        warehousesLabel.setForeground(Color.black);
    }//GEN-LAST:event_warehousesLabelMouseEntered

    private void customersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersLabelMouseEntered
        customersLabel.setOpaque(true);
        customersLabel.setForeground(Color.black);
    }//GEN-LAST:event_customersLabelMouseEntered

    private void ordersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseEntered
        ordersLabel.setOpaque(true);
        ordersLabel.setForeground(Color.black);
    }//GEN-LAST:event_ordersLabelMouseEntered

    private void reportsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLabelMouseEntered
        reportsLabel.setOpaque(true);
        reportsLabel.setForeground(Color.black);
    }//GEN-LAST:event_reportsLabelMouseEntered

    private void catagoriesLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catagoriesLabelMouseExited
        catagoriesLabel.setOpaque(false);
        catagoriesLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_catagoriesLabelMouseExited

    private void brandsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandsLabelMouseExited
        brandsLabel.setOpaque(false);
        brandsLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_brandsLabelMouseExited

    private void warehousesLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousesLabelMouseExited
        warehousesLabel.setOpaque(false);
        warehousesLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_warehousesLabelMouseExited

    private void customersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersLabelMouseExited
        customersLabel.setOpaque(false);
        customersLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_customersLabelMouseExited

    private void ordersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseExited
        ordersLabel.setOpaque(false);
        ordersLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_ordersLabelMouseExited

    private void reportsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLabelMouseExited
        reportsLabel.setOpaque(false);
        reportsLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_reportsLabelMouseExited

    private void productsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabelMouseClicked
        Home.panelVisible.setVisible(false);
        Home.productsPanel.setVisible(true);
        Home.panelVisible = Home.productsPanel;
    }//GEN-LAST:event_productsLabelMouseClicked

    private void productsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabelMouseEntered
        productsLabel.setOpaque(true);
        productsLabel.setForeground(Color.black);
    }//GEN-LAST:event_productsLabelMouseEntered

    private void productsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLabelMouseExited
        productsLabel.setOpaque(false);
        productsLabel.setForeground(Color.lightGray);
    }//GEN-LAST:event_productsLabelMouseExited

    
   private void setColor(JPanel pane,JLabel l,JTextField t)
    {
                pane.setBackground(new Color(85,65,118)); l.setBackground(new Color(85,65,118));t.setBackground(new Color(85,65,118)); 
    }
    
    private void resetColor(JPanel [] pane, JLabel [] l,JTextField []t)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(54,33,89));
           
        } for(int i=0;i<l.length;i++){
           l[i].setBackground(new Color(54,33,89));
        }for(int i=0;i<t.length;i++){
           t[i].setBackground(new Color(54,33,89));  
        }
      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private company.AccountPanel accountPanel1;
    private company.AddBrandPanel addBrandPanel1;
    private company.AddCatagoryPanel addCatagoryPanel1;
    private company.AddOrderPanel addOrderPanel1;
    private company.AddOrderSecondPanel addOrderSecondPanel1;
    private company.AddProductPanel addProductPanel1;
    private company.AddWarehousePanel addWarehousePanel1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel brandsLabel;
    private company.BrandsPanel brandsPanel1;
    private javax.swing.JLabel catagoriesLabel;
    private company.CatagoriesPanel catagoriesPanel1;
    private javax.swing.JLabel customersLabel;
    private company.CustomersPanel customersPanel1;
    private javax.swing.JLabel homeLabel;
    private company.HomePanel homePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel ordersLabel;
    private company.OrdersPanel ordersPanel1;
    private javax.swing.JLabel productsLabel;
    private company.ProductsPanel productsPanel1;
    private javax.swing.JLabel reportsLabel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel warehousesLabel;
    private company.WarehousesPanel warehousesPanel1;
    // End of variables declaration//GEN-END:variables
}
