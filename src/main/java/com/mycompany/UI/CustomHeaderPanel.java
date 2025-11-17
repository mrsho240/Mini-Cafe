package com.mycompany.UI;
import java.awt.*;
import javax.swing.*;

public class CustomHeaderPanel extends javax.swing.JPanel {

    public CustomHeaderPanel() {
        initComponents();
        setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int arc = 40;
        int shadowSize = 12;   // shadow size
        Color shadowColor = new Color(0, 0, 0, 50);  // Translucent shadow

        int width = getWidth();
        int height = getHeight();

        // --- Draw bottom shadow ---
        g2.setColor(shadowColor);
        g2.fillRoundRect(
                shadowSize / 2,        // Translucent shadow
                shadowSize / 2,
                width - shadowSize,
                height - shadowSize / 2,
                arc, arc
        );

        // --- draw panel main color ---
        g2.setColor(new Color(255, 224, 178)); // F6EBDA
        g2.fillRoundRect(0, 0, width - shadowSize, height - shadowSize, arc, arc);

        g2.dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
