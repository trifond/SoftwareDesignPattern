package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:31
 * @ Description:
 */

import com.trifond.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

}
