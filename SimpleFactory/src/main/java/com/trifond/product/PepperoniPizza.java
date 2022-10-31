package com.trifond.product;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:03
 * @ Description:
 */

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "Pepperoni pizza";
    }

    @Override
    public void bake() {
        System.out.println("Bake for 37 minutes at 550");
    }

}
