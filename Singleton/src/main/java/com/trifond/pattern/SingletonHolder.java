package com.trifond.pattern;

public class SingletonHolder {

    private SingletonHolder(){}

    private static class Holder {
        private static final SingletonHolder instance = new SingletonHolder();
    }

    public SingletonHolder getInstance() {
        return Holder.instance;
    }

}
