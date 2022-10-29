package com.trifond.decorator;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 16:34
 * @ Description:
 */

import com.trifond.component.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }

}
