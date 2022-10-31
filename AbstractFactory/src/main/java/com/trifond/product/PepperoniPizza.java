package com.trifond.product;

/*
 * @ Author: Felix
 * @ Date: 2022/10/31 10:58
 * @ Description:
 */

import com.trifond.factory.IngredientFactory;

public class PepperoniPizza extends Pizza {

    IngredientFactory ingredientFactory;

    public PepperoniPizza(IngredientFactory factory) {
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
