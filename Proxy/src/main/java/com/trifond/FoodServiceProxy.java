package com.trifond;

public class FoodServiceProxy implements FoodService{

    private final FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        return foodService.makeChicken();
    }

    @Override
    public Food makeNoodle() {
        return foodService.makeNoodle();
    }
}
