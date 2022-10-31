package com.trifond.product;

/*
 * @ Author: Felix
 * @ Date: 2022/10/31 10:39
 * @ Description:
 */

import com.trifond.factory.IngredientFactory;

public class CheesePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory factory) {
        ingredientFactory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
