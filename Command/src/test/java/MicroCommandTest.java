/*
 * @ Author: Felix
 * @ Date: 2022/11/2 13:49
 * @ Description:
 */

import com.trifond.command.*;
import com.trifond.invoker.RemoteControl;
import com.trifond.receiver.CeilingFan;
import com.trifond.receiver.Light;
import com.trifond.receiver.Stereo;
import org.junit.jupiter.api.Test;

public class MicroCommandTest {

    @Test
    void microCommandTest() {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);


        Command[] partyOn = { lightOnCommand, ceilingFanLowCommand, stereoOnWithCDCommand };
        Command[] partyOff = { lightOffCommand, ceilingFanOffCommand, stereoOffWithCDCommand };

        MacroCommand partyOnMacroCommand = new MacroCommand(partyOn);
        MacroCommand partyOffMacroCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacroCommand, partyOffMacroCommand);

        System.out.println(remoteControl);

        remoteControl.pressedOnButton(0);
        System.out.println("------------");
        remoteControl.pressedOffButton(0);
        System.out.println("------------");
        remoteControl.pressedUndoButton();

    }


}
