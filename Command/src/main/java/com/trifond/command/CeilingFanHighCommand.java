package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:32
 * @ Description:
 */

import com.trifond.receiver.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

}
