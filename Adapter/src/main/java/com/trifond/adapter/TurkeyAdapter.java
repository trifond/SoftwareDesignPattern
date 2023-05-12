package com.trifond.adapter;

/*
 * @ Author: Felix
 * @ Date: 2022/11/5 11:16
 * @ Description:
 */

import com.trifond.animal.Duck;
import com.trifond.animal.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++ ) {
            turkey.fly();
        }
    }

}
