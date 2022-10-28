package com.trifond.common;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 12:58
 * @ Description:
 */

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
