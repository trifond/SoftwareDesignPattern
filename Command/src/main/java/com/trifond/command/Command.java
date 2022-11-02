package com.trifond.command;

/*
 * @ Author: Felix
 * @ Date: 2022/11/1 17:30
 * @ Description:
 */

public interface Command {

    void execute();
    void undo();

}
