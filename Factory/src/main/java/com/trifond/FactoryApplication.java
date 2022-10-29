package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:09
 * @ Description:
 */

import com.trifond.factory.PizzaFactory;
import com.trifond.product.Pizza;
import com.trifond.store.PizzaStore;

public class FactoryApplication {

    public static void main(String[] args) {

        PizzaStore store = new PizzaStore(new PizzaFactory());

        Pizza pizza = store.orderPizza("pepperoni");

    }

}
