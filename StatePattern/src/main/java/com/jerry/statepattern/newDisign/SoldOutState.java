package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 8:45
 * @注释 售罄状态
 */
public class SoldOutState implements State {
    NewVendingMachines newVendingMachines;

    public SoldOutState(NewVendingMachines newVendingMachines) {
        this.newVendingMachines = newVendingMachines;
    }

    @Override
    public void insertMoney() {
        System.out.println("You can't insert a quarter,the machine is sold out");
    }

    @Override
    public void returnMoney() {
        System.out.println("You can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void passButton() {
        System.out.println("You turned,but there are no water");
    }

    @Override
    public void distribute() {
        System.out.println("no water distributed");
    }
}
