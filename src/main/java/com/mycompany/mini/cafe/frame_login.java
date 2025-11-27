/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mini.cafe;

import javax.swing.Icon;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.InputStream;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class frame_login extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frame_login.class.getName());
    private frame_selection fs;

    public frame_login() {
        // Initialize initComponents 
        initComponents();
        setTitle("Mini-Cafe");

    }
    public frame_login(frame_selection fs) {
        // Initialize initComponents 
        initComponents();
        setTitle("Mini-Cafe");
        this.fs = fs;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        r_lgnBG = new javax.swing.JLabel();
        LgnIMG = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(216, 181, 151));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(216, 181, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 235, 218));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));
        jPanel2.add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 280, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        jPanel2.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 280, 30));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 110, 50));

        r_lgnBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-image.jpg"))); // NOI18N
        jPanel2.add(r_lgnBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 774));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 450, 760));

        LgnIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginIMG.jpg"))); // NOI18N
        jPanel1.add(LgnIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = username_field.getText();
        String password = new String(password_field.getPassword());
        String role = AuthService.login(username, password);
        if (role == null) {
            JOptionPane.showMessageDialog(this,
                    "Invalid username or password",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE);
            username_field.requestFocusInWindow();
            username_field.setText("");
            password_field.setText("");

            return;
        }
        JOptionPane.showMessageDialog(this, "Login successful! " + role);
        if(fs == null){
            fs = new frame_selection(role);
        }else{
            fs.UpdateRole(role);
        }
        fs.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnLoginActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new frame_login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LgnIMG;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel r_lgnBG;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
