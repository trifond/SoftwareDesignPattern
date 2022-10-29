package com.trifond.animal;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:17
 * @ Description:
 */

import com.trifond.behavior.FlyNoWay;
import com.trifond.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }


}
