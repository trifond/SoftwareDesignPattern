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

    //CeilingFan ceilingFan;
    //int prevSpeed;

    //public CeilingFanLowCommand(CeilingFan ceilingFan) {
    //    this.ceilingFan = ceilingFan;
    //}

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    //@Override
    //public void undo() {
    //    if (prevSpeed == CeilingFan.HIGH) {
    //        ceilingFan.high();
    //    } else if (prevSpeed == CeilingFan.MEDIUM) {
    //        ceilingFan.medium();
    //    } else if (prevSpeed == CeilingFan.LOW) {
    //        ceilingFan.low();
    //    } else if (prevSpeed == CeilingFan.OFF) {
    //        ceilingFan.off();
    //    }
    //}

}
