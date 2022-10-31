package com.trifond.factory;

/*
 * @ Author: Felix
 * @ Date: 2022/10/30 21:35
 * @ Description:
 */

import com.trifond.ingredient.*;

public class ChicagoIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

}
