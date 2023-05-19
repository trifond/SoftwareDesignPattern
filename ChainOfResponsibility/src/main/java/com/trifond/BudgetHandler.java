package com.trifond;

/*
 * @ Author: Ethan
 * @ Date: 2023/5/19 11:08
 * @ Description:
 */

public interface BudgetHandler {

    void setSuccessor(BudgetHandler successor);

    boolean handle(int amount);

}
