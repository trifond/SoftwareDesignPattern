package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 14:42
 * @ Description:
 */

import com.trifond.component.Beverage;
import com.trifond.component.Espresso;
import com.trifond.component.HouseBlend;
import com.trifond.decorator.Mocha;
import com.trifond.decorator.Soy;
import com.trifond.decorator.Whip;

public class DecoratorApplication {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();

        System.out.println(espresso.getDescription() + " $" + espresso.cost());


        Beverage houseBlend = new HouseBlend();

        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());


        Beverage coffee = new Espresso();

        coffee = new Soy(coffee);
        coffee = new Mocha(coffee);
        coffee = new Whip(coffee);

        System.out.println(coffee.getDescription() + " $" + coffee.cost());

    }

}
