package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:19
 * @ Description:
 */

import com.trifond.animal.Duck;
import com.trifond.behavior.FlyNoWay;
import com.trifond.behavior.Squeak;
import com.trifond.animal.MallardDuck;
import com.trifond.animal.ModelDuck;
import com.trifond.animal.RubberDuck;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyApplication {

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

        log.debug("Strategy module application running");

    }

}
