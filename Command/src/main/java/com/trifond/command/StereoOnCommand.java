package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 15:12
 * @ Description:
 */

import com.trifond.receiver.Stereo;

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
