package com.trifond.factory;

/*
 * @ Author: Felix
 * @ Date: 2022/10/30 21:37
 * @ Description:
 */

import com.trifond.ingredient.*;

public class NewYorkIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
