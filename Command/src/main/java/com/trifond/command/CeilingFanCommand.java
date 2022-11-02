package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:53
 * @ Description:
 */

import com.trifond.receiver.CeilingFan;

public class CeilingFanCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {}

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }

}
