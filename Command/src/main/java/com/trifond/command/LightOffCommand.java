package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 18:04
 * @ Description:
 */

import com.trifond.receiver.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
