package com.trifond.product;

/*
 * @ Author: Felix
 * @ Date: 2022/10/31 10:45
 * @ Description:
 */

import com.trifond.factory.IngredientFactory;

public class ClamPizza extends Pizza {
    IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory factory) {
        ingredientFactory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }

}
