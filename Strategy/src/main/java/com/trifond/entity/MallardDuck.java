package com.trifond.entity;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:25
 * @ Description:
 */

import com.trifond.common.Duck;
import com.trifond.common.FlyWithWings;
import com.trifond.common.Quack;

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
