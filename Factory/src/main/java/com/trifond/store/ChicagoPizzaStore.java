package com.trifond.store;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 19:43
 * @ Description:
 */

import com.trifond.product.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }

}
