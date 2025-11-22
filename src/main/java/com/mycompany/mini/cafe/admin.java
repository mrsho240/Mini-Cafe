/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini.cafe;

/**
 *
 * @author User
 */
public class admin {
    private int price = 0;
    
    public int getTotalPrice() {
        return this.price;
    }
    public void setTotalPrice(int price) {
        this.price += price;
    }
}
