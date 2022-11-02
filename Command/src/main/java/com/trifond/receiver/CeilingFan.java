package com.trifond.receiver;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 17:48
 * @ Description:
 */

public class CeilingFan {

    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling fan is running at high level");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling fan is running at medium level");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling fan is running at low level");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }

}
