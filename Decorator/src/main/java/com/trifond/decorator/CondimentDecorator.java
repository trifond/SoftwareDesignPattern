package com.trifond.decorator;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 14:37
 * @ Description:
 */

import com.trifond.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
