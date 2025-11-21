/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini.cafe;

import java.util.*;

/**
 *
 * @author User
 */
public class Table {

    private boolean state;
    private int tableNo;
    private List<Food> foods;

    public Table() {
        this.foods = new ArrayList<>();
    }

    public void clearFoods() {
        foods.clear();
    }

    public String getState() {
        if (state) {
            return "Full";
        }
        return "Empty";
    }

    public List<Food> getFoods() {
        return foods;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * @return the tableNo
     */
    public int getTableNo() {
        return tableNo;
    }

    /**
     * @param tableNo the tableNo to set
     */
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public void addFood(Food f) {
        this.foods.add(f);
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public int getTotalPrice() {
        int total = 0;
        for (Food f : foods) {
            total += f.getPrice() * f.getQuantity();
        }
        return total;
    }
}
