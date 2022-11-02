package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:57
 * @ Description:
 */

import com.trifond.command.*;
import com.trifond.invoker.RemoteControl;
import com.trifond.receiver.CeilingFan;
import com.trifond.receiver.GarageDoor;
import com.trifond.receiver.Light;
import com.trifond.receiver.Stereo;

public class CommandApplication {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.pressedOnButton(0);
        remoteControl.pressedOffButton(0);

        remoteControl.pressedOnButton(1);
        remoteControl.pressedOffButton(1);

        remoteControl.pressedOnButton(2);
        remoteControl.pressedOffButton(2);

        remoteControl.pressedOnButton(3);
        remoteControl.pressedOffButton(3);

    }


}
