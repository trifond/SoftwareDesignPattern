package com.trifond.animal;

/*
 * @ Author: Felix
 * @ Date: 2022/11/5 11:14
 * @ Description:
 */

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

}
