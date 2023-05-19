package com.trifond;

/*
 * @ Author: Ethan
 * @ Date: 2023/5/19 11:23
 * @ Description:
 */

import java.util.Objects;

public class ManagerBudgetHandler implements BudgetHandler {

    private BudgetHandler successor;

    @Override
    public void setSuccessor(BudgetHandler successor) {
        this.successor = successor;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(successor);

        if (amount <= 3000) {
            System.out.println("Manager can decide this, approved!");
            return true;
        }

        System.out.println(String.format("The amount %d is beyond manager's authority and needs to be approved by the superior.", amount));

        return successor.handle(amount);
    }

}
