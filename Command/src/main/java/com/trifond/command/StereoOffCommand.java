package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 18:06
 * @ Description:
 */

import com.trifond.receiver.Stereo;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }

}
