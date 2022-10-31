package com.trifond.store;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 19:40
 * @ Description:
 */

import com.trifond.product.*;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NewYorkCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NewYorkPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NewYorkClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NewYorkVeggiePizza();
        }
        return pizza;
    }

}
