package com.trifond.pattern;

/*
 * @ Author: Felix
 * @ Date: 2022/10/27 22:41
 * @ Description:
 */

public class Singleton {

    private Singleton() {}

    private static volatile Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
