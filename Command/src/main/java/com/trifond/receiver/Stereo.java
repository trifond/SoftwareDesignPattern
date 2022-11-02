package com.trifond.receiver;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 17:52
 * @ Description:
 */

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo set CD");
    }

    public void setDVD() {
        System.out.println("Stereo set DVD");
    }

    public void setRadio() {
        System.out.println("Stereo set radio");
    }

    public void setVolume(int level) {
        System.out.println("Stereo set volume to " + level);
    }

}
