package com.trifond;

/*
 * @ Author: Ethan
 * @ Date: 2023/5/19 11:27
 * @ Description:
 */

import java.util.Objects;

public class GeneralManagerBudgetHandler implements BudgetHandler {

    private BudgetHandler successor;

    @Override
    public void setSuccessor(BudgetHandler successor) {
        this.successor = successor;
    }

    @Override
    public boolean handle(int amount) {

        if (amount <= 10000) {
            System.out.println("General manager can decide this, approved!");
            return true;
        }

        System.out.println(String.format("The amount %d is too large to approve!", amount));

        return false;
    }

}
