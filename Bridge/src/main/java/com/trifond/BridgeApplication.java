package com.trifond;

public class BridgeApplication {

    public static void main(String[] args) {
        Shape circle = new Circle(10, new BluePen());
        circle.draw();

        Shape rectangle = new Rectangle(10, 20, new RedPen());
        rectangle.draw();
    }
}
