/*
 * @ Author: Felix
 * @ Date: 2022/11/2 11:59
 * @ Description:
 */


import com.trifond.command.*;
import com.trifond.invoker.RemoteControl;
import com.trifond.receiver.CeilingFan;
import com.trifond.receiver.Light;
import org.junit.jupiter.api.Test;

public class UndoCommandTest {

    @Test
    void undoCommandTestWithLight() {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println(remoteControl);

        remoteControl.pressedOnButton(0);
        remoteControl.pressedOffButton(0);

        remoteControl.pressedUndoButton();

        remoteControl.pressedOffButton(0);
        remoteControl.pressedOnButton(0);

        remoteControl.pressedUndoButton();

    }

    @Test
    void undoCommandTestWithCeilingFan() {

        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.pressedOnButton(0);
        remoteControl.pressedOffButton(0);

        remoteControl.pressedUndoButton();

        remoteControl.pressedOnButton(1);
        remoteControl.pressedUndoButton();

    }


}
