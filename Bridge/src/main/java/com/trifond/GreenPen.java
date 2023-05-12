package com.trifond;

public class GreenPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Draw something with green pen with radius: " + radius + ", x: " + x + ", y: " + y);
    }
}
