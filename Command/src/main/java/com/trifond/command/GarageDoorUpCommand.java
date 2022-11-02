package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:29
 * @ Description:
 */

import com.trifond.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

}
