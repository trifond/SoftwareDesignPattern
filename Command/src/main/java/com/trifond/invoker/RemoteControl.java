package com.trifond.invoker;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 18:14
 * @ Description:
 */

import com.trifond.command.Command;
import com.trifond.command.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for( int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressedOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressedOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressedUndoButton() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot ")
                    .append(i).append("]")
                    .append(onCommands[i].getClass().getName())
                    .append("   ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return buffer.toString();
    }

}
