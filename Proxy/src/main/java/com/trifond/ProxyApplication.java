package com.trifond;

public class ProxyApplication {

    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeNoodle();
        foodService.makeChicken();
    }
    
}
