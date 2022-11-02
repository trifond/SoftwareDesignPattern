package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 15:13
 * @ Description:
 */

import com.trifond.receiver.Stereo;

public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

}
