package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/27 22:41
 * @ Description:
 */

import com.trifond.pattern.Singleton;

public class SingletonApplication {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);

    }


}
