package com.trifond.common;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:06
 * @ Description:
 */

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
