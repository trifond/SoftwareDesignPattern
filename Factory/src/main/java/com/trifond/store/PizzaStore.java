package com.trifond.store;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:07
 * @ Description:
 */

import com.trifond.factory.PizzaFactory;
import com.trifond.product.Pizza;

public class PizzaStore {

    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
