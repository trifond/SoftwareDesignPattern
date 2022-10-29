package com.trifond.component;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 14:39
 * @ Description:
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
