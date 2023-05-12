package com.trifond;

public class RedPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Draw something with red pen with radius: " + radius + ", x: " + x + ", y: " + y);
    }
}
