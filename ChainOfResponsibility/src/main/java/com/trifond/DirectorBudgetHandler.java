package com.trifond;

/*
 * @ Author: Ethan
 * @ Date: 2023/5/19 11:25
 * @ Description:
 */

import java.util.Objects;

public class DirectorBudgetHandler implements BudgetHandler {

    private BudgetHandler successor;

    @Override
    public void setSuccessor(BudgetHandler successor) {
        this.successor = successor;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(successor);

        if (amount <= 5000) {
            System.out.println("Director can decide this, approved!");
            return true;
        }

        System.out.println(String.format("The amount %d is director's authority and needs to be approved by the superior.", amount));

        return successor.handle(amount);
    }

}
