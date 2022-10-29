package com.trifond.behavior;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:06
 * @ Description:
 */

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
