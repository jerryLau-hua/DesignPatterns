package com.jerry.statepattern.outdated;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/7 16:09
 * @注释  VendingMachines 测试
 */
public class VendingMachinesTestMain {

    public static void main(String[] args) {
        VendingMachines gumballMachine = new VendingMachines(5);

        System.out.println(gumballMachine);

        gumballMachine.insertMoney();
        gumballMachine.passButton();
        System.out.println(gumballMachine);

        gumballMachine.insertMoney();
        gumballMachine.ReturnMoney();
        gumballMachine.passButton();
        System.out.println(gumballMachine);
//
//
        gumballMachine.insertMoney();
        gumballMachine.passButton();
        gumballMachine.insertMoney();
        gumballMachine.passButton();
        gumballMachine.ReturnMoney();
        System.out.println(gumballMachine);
//
        gumballMachine.insertMoney();
        gumballMachine.insertMoney();
        gumballMachine.passButton();
        gumballMachine.insertMoney();
        gumballMachine.passButton();
        gumballMachine.insertMoney();
        gumballMachine.passButton();
        System.out.println(gumballMachine);

    }
}
