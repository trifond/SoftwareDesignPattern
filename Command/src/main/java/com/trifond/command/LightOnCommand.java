package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 18:02
 * @ Description:
 */

import com.trifond.receiver.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
