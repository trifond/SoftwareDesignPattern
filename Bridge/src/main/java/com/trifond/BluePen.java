package com.trifond;

public class BluePen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Draw something with blue pen with radius: " + radius + ", x: " + x + ", y: " + y);
    }
}
