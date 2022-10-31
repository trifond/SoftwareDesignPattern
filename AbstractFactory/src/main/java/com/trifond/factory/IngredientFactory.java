package com.trifond.factory;

import com.trifond.ingredient.Cheese;
import com.trifond.ingredient.Clams;
import com.trifond.ingredient.Dough;
import com.trifond.ingredient.Sauce;

public interface IngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();

}
