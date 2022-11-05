package com.trifond.animal;

/*
 * @ Author: Felix
 * @ Date: 2022/11/5 11:15
 * @ Description:
 */

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}
