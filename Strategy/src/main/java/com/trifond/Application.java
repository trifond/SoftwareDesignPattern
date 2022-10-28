package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/28 13:19
 * @ Description:
 */

import com.trifond.common.Duck;
import com.trifond.entity.ModelDuck;

public class Application {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();

    }

}
