package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 8:46
 * @注释 产生赢家状态
 */
public class WinnerState implements State {
    NewVendingMachines newVendingMachines;

    public WinnerState(NewVendingMachines newVendingMachines) {
        this.newVendingMachines = newVendingMachines;
    }

    @Override
    public void insertMoney() {
        System.out.println("no need to insert money");
    }

    @Override
    public void returnMoney() {
        System.out.println("no money return");
    }

    @Override
    public void passButton() {
        System.out.println("you passed money but no water gives to you ");
    }

    @Override
    public void distribute() {
        System.out.println("YOU'RE a WINNER! You get another water ");
        newVendingMachines.flushWater();
        if (newVendingMachines.getCount() == 0) {
            newVendingMachines.setState(newVendingMachines.getSoldOutState());
        } else {
            newVendingMachines.flushWater();
            if (newVendingMachines.getCount() > 0) {
                newVendingMachines.setState(newVendingMachines.getNo1_5State());
            } else {
                System.out.println("Oops,out of water!");
                newVendingMachines.setState(newVendingMachines.getSoldOutState());
            }
        }
    }
}
