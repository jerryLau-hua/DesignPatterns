package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 8:44
 * @注释 售出状态
 */
public class SoldState implements State {
    NewVendingMachines newVendingMachines;

    public SoldState(NewVendingMachines newVendingMachines) {
        this.newVendingMachines = newVendingMachines;
    }

    @Override
    public void insertMoney() {
        System.out.println("please wait a moment ,we will give you a bottom of water");
    }

    @Override
    public void returnMoney() {
        System.out.println("no money returned cause you have passed the button");
    }

    @Override
    public void passButton() {
        System.out.println("passed the button twice doesn't give another water ");
    }

    @Override
    public void distribute() {
        newVendingMachines.flushWater();
        if (newVendingMachines.getCount() > 0) {
            newVendingMachines.setState(newVendingMachines.getNo1_5State());
        } else {
            newVendingMachines.setState(newVendingMachines.getSoldOutState());
        }
    }
}
