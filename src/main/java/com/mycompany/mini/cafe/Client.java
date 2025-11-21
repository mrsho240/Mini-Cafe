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
public class Client {

    private List<Food> foods = new ArrayList<>();

    /**
     * @return the foods
     */
    public List<Food> getFoods() {
        return foods;
    }

    public void clearFoods() {
        this.foods.clear();
    }

    /**
     * @param foods the foods to set
     */
    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    /**
     * Check food in food list if new food == food in food list add Quantity++
     * if not add new food in food list
     */
    public void addFood(Food newFood) {
        boolean found = false;
        for (Food existingFood : foods) {
            if (existingFood.getName().equals(newFood.getName())) {
                existingFood.setQuantity(existingFood.getQuantity() + newFood.getQuantity());
                found = true;
                break;
            }
        }
        if (!found) {
            this.foods.add(newFood);
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (Food f : getFoods()) {
            total += f.getPrice() * f.getQuantity();
        }
        return total;
    }
}
