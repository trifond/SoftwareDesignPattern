package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 12:06
 * @ Description:
 */

import com.trifond.receiver.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

}
