package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 18:09
 * @ Description:
 */


import com.trifond.product.Pizza;
import com.trifond.store.ChicagoPizzaStore;
import com.trifond.store.NewYorkPizzaStore;
import com.trifond.store.PizzaStore;

public class AbstractFactoryApplication {

    public static void main(String[] args) {

        System.out.println("\nThis is an example for Abstract Factory Pattern\n");

        PizzaStore nStore = new NewYorkPizzaStore();
        PizzaStore cStore = new ChicagoPizzaStore();

        Pizza pizza = nStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = cStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName());

    }

}
