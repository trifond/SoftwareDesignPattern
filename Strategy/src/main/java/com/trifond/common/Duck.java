package com.trifond.common;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 12:32
 * @ Description:
 */

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
