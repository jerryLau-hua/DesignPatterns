package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 9:37
 * @注释
 */
public class TestMainDriver {
    public static void main(String[] args) {
        NewVendingMachines gumballMachine = new NewVendingMachines(5);
        System.out.println(gumballMachine);
        gumballMachine.insertMoney();
        gumballMachine.passButton();
        System.out.println(gumballMachine);
//
//        gumballMachine.insertMoney();
//        gumballMachine.passButton();
//        gumballMachine.insertMoney();
//        gumballMachine.passButton();
//        System.out.println(gumballMachine);

    }
}
