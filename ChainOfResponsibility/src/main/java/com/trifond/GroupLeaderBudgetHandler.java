package com.trifond;

/*
 * @ Author: Ethan
 * @ Date: 2023/5/19 11:09
 * @ Description:
 */

import java.util.Objects;

public class GroupLeaderBudgetHandler implements BudgetHandler {
    private BudgetHandler successor;

    @Override
    public void setSuccessor(BudgetHandler successor) {
        this.successor = successor;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(successor);

        if (amount <= 1000) {
            System.out.println("Group leader can decide this, approved!");
            return true;
        }

        System.out.println(String.format("The amount %d is beyond group leader's authority and needs to be approved by the superior.", amount));

        return successor.handle(amount);
    }
}
