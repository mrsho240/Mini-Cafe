package com.mycompany.mini.cafe;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class frame_AddMenuToTable extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frame_AddMenuToTable.class.getName());
    private frame_Table tablepage;
    private Table table;

    public frame_AddMenuToTable() {
        initComponents();
        loadTable();
    }

    public frame_AddMenuToTable(frame_Table tablepage, Table table) {
        initComponents();
        this.tablepage = tablepage;
        this.table = table;
        loadTable();
    }

    private void loadTable() {
        try {
            // connect database
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT id, name, price, quantity FROM product";
            // query product table
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            // create new table model
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Price");
            model.addColumn("Quantity");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity"),});
            }
            jTable1.setModel(model);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_Header = new com.mycompany.UI.CustomHeaderPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReset = new com.mycompany.UI.RoundButton();
        btnAdd = new com.mycompany.UI.RoundButton();
        btnBack = new com.mycompany.UI.RoundButton();
        jLabel3 = new javax.swing.JLabel();
        labPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 235, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Add Menu To Table");

        javax.swing.GroupLayout panel_HeaderLayout = new javax.swing.GroupLayout(panel_Header);
        panel_Header.setLayout(panel_HeaderLayout);
        panel_HeaderLayout.setHorizontalGroup(
            panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_HeaderLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(217, 217, 217))
        );
        panel_HeaderLayout.setVerticalGroup(
            panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(panel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 540, 380));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 90, 40));

        btnAdd.setText("Add to Table");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, 40));

        btnBack.setText("Back to Table");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Price :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        labPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labPrice.setText("0");
        jPanel1.add(labPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-Table.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            // Restore stock back to database
            Connection conn = DBConnection.getConnection();

            for (Food f : table.getFoods()) {
                String updateSql = "UPDATE product SET quantity = quantity + ? WHERE name = ?";
                PreparedStatement pst = conn.prepareStatement(updateSql);
                pst.setInt(1, f.getQuantity());
                pst.setString(2, f.getName());
                pst.executeUpdate();
                pst.close();
            }

            // Clear the cart
            table.clearFoods();

            // Reload table UI
            loadTable();
            labPrice.setText("0");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        table.setState(true);

        try {
            int selectedRow = jTable1.getSelectedRow();

            if (selectedRow == -1) {
                // "Please select a product from the table."
                JOptionPane.showMessageDialog(this, "Please select a product from the table.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            /**
             * Retrieve values directly from JTable
             */
            int Id = (int) jTable1.getValueAt(selectedRow, 0);
            String Name = (String) jTable1.getValueAt(selectedRow, 1);

            // Table usually stores price as Double
            Object priceObj = jTable1.getValueAt(selectedRow, 2);
            int Price = (priceObj instanceof Double) ? ((Double) priceObj).intValue() : (int) priceObj;

            int QStock = (int) jTable1.getValueAt(selectedRow, 3);

            /**
             * Check stock
             */
            if (QStock <= 0) {
                // Note: "Out of sale" implies the item is discontinued. "Out of Stock" is usually better for empty inventory.
                JOptionPane.showMessageDialog(this, Name + " Sold Out", "Out of Stock", JOptionPane.WARNING_MESSAGE);
                return;
            }

            /**
             * Add to cart
             */
            Food f = new Food();
            f.setName(Name);
            f.setPrice(Price);
            f.setQuantity(1);
            table.addFood(f);

            /**
             * Update stock in Database
             */
            Connection conn = DBConnection.getConnection();
            String updateSql = "UPDATE product SET quantity = quantity - 1 WHERE id = ?";
            PreparedStatement updatePst = conn.prepareStatement(updateSql);
            updatePst.setInt(1, Id);
            updatePst.executeUpdate();

            updatePst.close();
            conn.close();

            /**
             * Refresh UI
             */
            loadTable();
            labPrice.setText(String.valueOf(table.getTotalPrice()));

        } catch (Exception e) {
            e.printStackTrace();
            // "An error occurred."
            JOptionPane.showMessageDialog(this, "An error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        tablepage.UpdateUI();
        this.setVisible(false);
        tablepage.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new frame_AddMenuToTable().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.UI.RoundButton btnAdd;
    private com.mycompany.UI.RoundButton btnBack;
    private com.mycompany.UI.RoundButton btnReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labPrice;
    private com.mycompany.UI.CustomHeaderPanel panel_Header;
    // End of variables declaration//GEN-END:variables

    void setTable(Table TableNo) {
        this.table = TableNo;
    }

    void UpdateUI(Table TableNo) {
        labPrice.setText(String.valueOf(TableNo.getTotalPrice()));
    }
}
