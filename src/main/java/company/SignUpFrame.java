/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package company;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author lenovo
 */
public class SignUpFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpFrame
     */
    public SignUpFrame() {
        initComponents();
        
        LoginFrame.addPlaceHolderStyle(usernameField);
        LoginFrame.addPlaceHolderStyle(passwordField);
        LoginFrame.addPlaceHolderStyle(retypePassField);
        LoginFrame.addPlaceHolderStyle(gmailField);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gmailField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        retypePassField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setMinimumSize(new java.awt.Dimension(718, 431));
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bubbles-icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 240, 260, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_sign_up.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 90, 120, 130);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("SIGN UP");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 20, 170, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("gmail :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 260, 60, 25);

        gmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gmailField.setText("xxxxxxx@gmail.com");
        gmailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        gmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gmailFieldFocusLost(evt);
            }
        });
        gmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(gmailField);
        gmailField.setBounds(420, 260, 270, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setText("username :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 110, 100, 25);

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameField.setText("Username");
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(420, 110, 270, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setText("password :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 160, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel8.setText("retype pass :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 210, 100, 25);

        retypePassField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        retypePassField.setText("Password");
        retypePassField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        retypePassField.setEchoChar('\u0000');
        retypePassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                retypePassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                retypePassFieldFocusLost(evt);
            }
        });
        retypePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypePassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(retypePassField);
        retypePassField.setBounds(420, 210, 270, 30);

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setText("Password");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        passwordField.setEchoChar('\u0000');
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        getContentPane().add(passwordField);
        passwordField.setBounds(420, 160, 270, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 370, 90, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(690, 0, 20, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(650, 0, 30, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button-Previous-icon.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 20, 40, 40);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        messageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(messageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 9, 290, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 310, 350, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign_up_wallpaper.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gmailFieldActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        if(usernameField.getText().equals("Username")){
            usernameField.setText(null);
            usernameField.requestFocus();
            LoginFrame.removePlaceHolderStyle(usernameField);
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        if(passwordField.getText().equals("Password")){
            passwordField.setText(null);
            passwordField.requestFocus();
            passwordField.setEchoChar('*');
            LoginFrame.removePlaceHolderStyle(passwordField);
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void retypePassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_retypePassFieldFocusGained
        if(retypePassField.getText().equals("Password")){
            retypePassField.setText(null);
            retypePassField.requestFocus();
            retypePassField.setEchoChar('*');
            LoginFrame.removePlaceHolderStyle(retypePassField);
        }
    }//GEN-LAST:event_retypePassFieldFocusGained

    private void gmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gmailFieldFocusGained
        if(gmailField.getText().equals("xxxxxxx@gmail.com")){
            gmailField.setText(null);
            gmailField.requestFocus();
            LoginFrame.removePlaceHolderStyle(gmailField);
        }
    }//GEN-LAST:event_gmailFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if(usernameField.getText().trim().length()==0){
            LoginFrame.addPlaceHolderStyle(usernameField);
            usernameField.setText("Username");
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void gmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gmailFieldFocusLost
        if(gmailField.getText().trim().length()==0){
            LoginFrame.addPlaceHolderStyle(gmailField);
            gmailField.setText("xxxxxxx@gmail.com");
        }
    }//GEN-LAST:event_gmailFieldFocusLost

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        if(passwordField.getText().trim().length()==0){
            LoginFrame.addPlaceHolderStyle(passwordField);
            passwordField.setEchoChar('\u0000');
            passwordField.setText("Password");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void retypePassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_retypePassFieldFocusLost
        if(retypePassField.getText().trim().length()==0){
            LoginFrame.addPlaceHolderStyle(retypePassField);
            retypePassField.setEchoChar('\u0000');
            retypePassField.setText("Password");
        }
    }//GEN-LAST:event_retypePassFieldFocusLost

    private void retypePassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypePassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retypePassFieldActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setBordersDefault();
        boolean flag = true;
        if(usernameField.getText().trim().equals("Username")){flag = false; usernameField.setBorder(new LineBorder(Color.red, 1));}
        if(String.valueOf(passwordField.getPassword()).trim().equals("Password")){flag = false; passwordField.setBorder(new LineBorder(Color.red, 1));}
        if(String.valueOf(retypePassField.getPassword()).trim().equals("Password")){flag = false; retypePassField.setBorder(new LineBorder(Color.red, 1));}
        if(gmailField.getText().trim().equals("xxxxxxx@gmail.com")){flag = false; gmailField.setBorder(new LineBorder(Color.red, 1));}
        String username = usernameField.getText().trim();
        String password = String.valueOf(passwordField.getPassword()).trim();
        String gmail = gmailField.getText().trim();
        
        if(!password.equals(String.valueOf(retypePassField.getPassword()).trim())){
            messageLabel.setText("please .. retype password correctly .");
            retypePassField.setBorder(new LineBorder(Color.red, 1));
            return;
        }
        if(!gmail.endsWith("@gmail.com")){
            messageLabel.setText("please .. enter correct gmail");
            gmailField.setBorder(new LineBorder(Color.red, 1));
            return;
        }
        if(flag == false){return;}
        
        PreparedStatement stmt = null;
        Connection con = null;
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:c##company/123@localhost:1521/XE");
            stmt = con.prepareStatement("insert into users (id, username, password, email) values (user_counter.nextval, ?, ?, ?)");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, gmail);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            messageLabel.setText("this username is used, change it");
            usernameField.setBorder(new LineBorder(Color.red, 1));
            return;
        }
        
        messageLabel.setForeground(Color.green);
        messageLabel.setText("signed up successfully .");
        setDefaultDesign();
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gmailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField retypePassField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void setDefaultDesign() {
        LoginFrame.addPlaceHolderStyle(usernameField);
        LoginFrame.addPlaceHolderStyle(passwordField);
        LoginFrame.addPlaceHolderStyle(retypePassField);
        LoginFrame.addPlaceHolderStyle(gmailField);
        this.usernameField.setText("Username");
        passwordField.setEchoChar('\u0000');
        this.passwordField.setText("Password");
        retypePassField.setEchoChar('\u0000');
        this.retypePassField.setText("Password");
        this.gmailField.setText("xxxxxxx@gmail.com");
    }
    
    private void setBordersDefault(){
        messageLabel.setForeground(Color.red);
        messageLabel.setText("");
        usernameField.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
        passwordField.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
        retypePassField.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
        gmailField.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
    }
}
