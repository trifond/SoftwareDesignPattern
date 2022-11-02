package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 18:08
 * @ Description:
 */

import com.trifond.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
