package com.trifond.store;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 19:40
 * @ Description:
 */

import com.trifond.factory.IngredientFactory;
import com.trifond.factory.NewYorkIngredientFactory;
import com.trifond.product.*;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory factory = new NewYorkIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("NewYork style cheese pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("NewYork style pepperoni pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("NewYork style clam pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(factory);
            pizza.setName("NewYork style veggie pizza");
        }
        return pizza;
    }

}
