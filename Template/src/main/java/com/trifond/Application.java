package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/12/18 18:02
 * @ Description:
 */

import com.trifond.sample.Coffee;
import com.trifond.sample.Tea;

public class Application {

    public static void main(String[] args) {

        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }


}
