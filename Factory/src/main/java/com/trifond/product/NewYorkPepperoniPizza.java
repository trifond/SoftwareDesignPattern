package com.trifond.product;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:03
 * @ Description:
 */

public class NewYorkPepperoniPizza extends Pizza {

    public NewYorkPepperoniPizza() {
        name = "NewYork style pepperoni pizza";
    }

    @Override
    public void bake() {
        System.out.println("Bake for 37 minutes at 550");
    }

}
