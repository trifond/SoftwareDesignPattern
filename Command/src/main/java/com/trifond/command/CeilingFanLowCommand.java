package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:50
 * @ Description:
 */

import com.trifond.receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

}
