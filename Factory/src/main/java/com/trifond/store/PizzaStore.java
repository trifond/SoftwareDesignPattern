package com.trifond.store;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:19
 * @ Description:
 */

import com.trifond.product.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}
