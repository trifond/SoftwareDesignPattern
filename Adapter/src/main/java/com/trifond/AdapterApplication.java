package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/11/5 11:19
 * @ Description:
 */

import com.trifond.adapter.TurkeyAdapter;
import com.trifond.animal.Duck;
import com.trifond.animal.MallardDuck;
import com.trifond.animal.WildTurkey;

public class AdapterApplication {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says ...");
        testDuck(duck);

        System.out.println("The turkey adapter says ...");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
