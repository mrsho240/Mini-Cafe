/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mini.cafe;

/**
 *
 * @author User
 */
public class frame_selection extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frame_selection.class.getName());
    private frame_Table tablePage = null; /** collect table page */
    private frame_Menu menuPage = null; /** collect menu page */

    public frame_selection() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddM = new com.mycompany.UI.CustomCardButton();
        btnMenu = new com.mycompany.UI.CustomCardButton();
        btnTable = new com.mycompany.UI.CustomCardButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel_Header = new com.mycompany.UI.CustomHeaderPanel();
        jLabel2 = new javax.swing.JLabel();
        lable_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(216, 181, 151));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add_round_fill.png.png"))); // NOI18N
        btnAddM.setText("Add Member");
        btnAddM.setToolTipText("");
        jPanel1.add(btnAddM, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 140, 130));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alt_list.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.setToolTipText("");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 130));

        btnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tableicon.png"))); // NOI18N
        btnTable.setText("Table");
        btnTable.setToolTipText("");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });
        jPanel1.add(btnTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-image1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 950, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 500));

        jPanel2.setBackground(new java.awt.Color(246, 235, 218));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Welome Back");

        lable_status.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lable_status.setText("Custom");

        javax.swing.GroupLayout panel_HeaderLayout = new javax.swing.GroupLayout(panel_Header);
        panel_Header.setLayout(panel_HeaderLayout);
        panel_HeaderLayout.setHorizontalGroup(
            panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HeaderLayout.createSequentialGroup()
                .addGroup(panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_HeaderLayout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(lable_status))
                    .addGroup(panel_HeaderLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel2)))
                .addContainerGap(402, Short.MAX_VALUE))
        );
        panel_HeaderLayout.setVerticalGroup(
            panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lable_status)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(panel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
        if(tablePage == null){
            tablePage = new frame_Table(this); 
        }
        this.setVisible(false);
        tablePage.setVisible(true);
    }//GEN-LAST:event_btnTableActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        if(menuPage == null){
            menuPage = new frame_Menu(this); 
        }
        this.setVisible(false);
        menuPage.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frame_selection().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.UI.CustomCardButton btnAddM;
    private com.mycompany.UI.CustomCardButton btnMenu;
    private com.mycompany.UI.CustomCardButton btnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lable_status;
    private com.mycompany.UI.CustomHeaderPanel panel_Header;
    // End of variables declaration//GEN-END:variables
}
