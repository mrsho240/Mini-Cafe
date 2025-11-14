/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UI; // <-- ตรวจสอบว่า package ถูกต้อง

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;

public class RoundButton extends JButton {
    private int radius = 30;

    // --- Constructor ที่เพิ่มเข้ามา ---
    // NetBeans GUI Builder ต้องใช้ตัวนี้ในการแสดงปุ่มใน Palette
    public RoundButton() {
        super(); // สร้างปุ่มเปล่าๆ
        setFocusPainted(false);
        setContentAreaFilled(false);
    }
    // ---------------------------------

    // นี่คือ Constructor เดิมของคุณ
    public RoundButton(String text) {
        super(text);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (getModel().isArmed()) {
            g2.setColor(getBackground().darker());
        } else {
            g2.setColor(getBackground());
        }

        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLACK); // คุณสามารถเปลี่ยนสีขอบได้ที่นี่
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
    }
}

