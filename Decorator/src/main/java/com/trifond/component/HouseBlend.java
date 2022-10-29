package com.trifond.component;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 16:27
 * @ Description:
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
