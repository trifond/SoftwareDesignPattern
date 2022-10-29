package com.trifond.decorator;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 16:32
 * @ Description:
 */

import com.trifond.component.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
