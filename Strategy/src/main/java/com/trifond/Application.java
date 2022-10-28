package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:19
 * @ Description:
 */

import com.trifond.common.Duck;
import com.trifond.common.FlyNoWay;
import com.trifond.common.Squeak;
import com.trifond.entity.MallardDuck;
import com.trifond.entity.ModelDuck;
import com.trifond.entity.RubberDuck;

public class Application {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.setFlyBehavior(new FlyNoWay());
        rubber.performFly();
        rubber.setQuackBehavior(new Squeak());
        rubber.performQuack();

    }

}
