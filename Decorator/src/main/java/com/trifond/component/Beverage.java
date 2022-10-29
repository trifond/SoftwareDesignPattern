package com.trifond.component;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 14:30
 * @ Description:
 */

public abstract class Beverage {

    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
