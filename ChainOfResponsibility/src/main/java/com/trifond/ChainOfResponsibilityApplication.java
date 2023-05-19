package com.trifond;

/*
 * @ Author: Ethan
 * @ Date: 2023/5/19 11:31
 * @ Description:
 */

public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {

        BudgetHandler groupLeader = new GroupLeaderBudgetHandler();
        BudgetHandler manager = new ManagerBudgetHandler();
        BudgetHandler director = new DirectorBudgetHandler();
        BudgetHandler generalManager = new GeneralManagerBudgetHandler();

        groupLeader.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(generalManager);

        int amount = 10001;

        System.out.println(String.format("I need a Mac computer worth %d, please approve it", amount));
        groupLeader.handle(amount);

    }


}
