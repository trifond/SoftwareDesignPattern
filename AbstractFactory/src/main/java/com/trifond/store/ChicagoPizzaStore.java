package com.trifond.store;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 19:43
 * @ Description:
 */

import com.trifond.factory.ChicagoIngredientFactory;
import com.trifond.factory.IngredientFactory;
import com.trifond.product.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory factory = new ChicagoIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago style cheese pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("Chicago style pepperoni pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago style clam pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(factory);
            pizza.setName("Chicago style veggie pizza");
        }
        return pizza;
    }

}
