package com.trifond.animal;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:25
 * @ Description:
 */

import com.trifond.behavior.FlyWithWings;
import com.trifond.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
