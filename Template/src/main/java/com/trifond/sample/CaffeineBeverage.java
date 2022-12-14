package com.trifond.sample;

/*
 * @ Author: Felix
 * @ Date: 2022/12/18 17:45
 * @ Description:
 */

public abstract class CaffeineBeverage {

    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
