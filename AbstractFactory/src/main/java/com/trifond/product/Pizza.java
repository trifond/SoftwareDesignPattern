package com.trifond.product;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:15
 * @ Description:
 */

import com.trifond.ingredient.Cheese;
import com.trifond.ingredient.Clams;
import com.trifond.ingredient.Dough;
import com.trifond.ingredient.Sauce;


public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Clams clams;
    Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
