package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/2 13:45
 * @ Description:
 */

public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }

}
