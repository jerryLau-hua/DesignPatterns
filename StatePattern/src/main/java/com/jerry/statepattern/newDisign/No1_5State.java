package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 8:45
 * @注释 没有被投币的状态
 */
public class No1_5State implements  State{
    NewVendingMachines newVendingMachines;

    public No1_5State(NewVendingMachines newVendingMachines) {
        this.newVendingMachines = newVendingMachines;
    }

    @Override
    public void insertMoney() {
        System.out.println("you insert money");
        newVendingMachines.setState(newVendingMachines.getHas1_5State());
    }

    @Override
    public void returnMoney() {
        System.out.println("you aren't insert money");
    }

    @Override
    public void passButton() {
        System.out.println("you passed Button,but no water gives to you cause you aren't insert money");
    }

    @Override
    public void distribute() {
        System.out.println("you need to pay first");
    }
}
