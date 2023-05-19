package com.trifond;

public class FoodServiceImpl implements FoodService{
    @Override
    public Food makeChicken() {
        return new Food();
    }

    @Override
    public Food makeNoodle() {
        return new Food();
    }
}
