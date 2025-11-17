package com.mycompany.UI;

import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.CENTER;

public class CustomCardButton extends JButton {

    private boolean hover = false;

    public CustomCardButton() {
       setupUI();
    }

    public CustomCardButton(String text, Icon icon) {
        super(text, icon);
        setupUI();
    }
        private void setupUI() {
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setHorizontalTextPosition(CENTER);
        setVerticalTextPosition(BOTTOM);

        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false);

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                hover = true;
                repaint();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                hover = false;
                repaint();
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        int arc = 22;

        // Shadow
        g2.setColor(new Color(0, 0, 0, hover ? 70 : 45));
        g2.fillRoundRect(6, 8, w - 12, h - 10, arc, arc);

        // Background
        g2.setColor(hover ? new Color(240, 240, 240) : Color.WHITE);
        g2.fillRoundRect(0, 0, w - 8, h - 10, arc, arc);

        // Border
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawRoundRect(0, 0, w - 8, h - 10, arc, arc);

        // ---------- Draw Icon and Text ----------
        Icon icon = getIcon();
        String text = getText();

        int y = 20;
        if (icon != null) {
            int x = (w - icon.getIconWidth()) / 2;
            icon.paintIcon(this, g2, x, y);
            y += icon.getIconHeight() + 10;
        }

        if (text != null) {
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("SansSerif", Font.BOLD, 14));
            FontMetrics fm = g2.getFontMetrics();
            int sw = fm.stringWidth(text);

            g2.drawString(text, (w - sw) / 2, y + fm.getAscent());
        }

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
