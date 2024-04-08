package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/8 8:45
 * @注释 被投币状态
 */
public class Has1_5State implements State {
    NewVendingMachines newVendingMachines;

    public Has1_5State(NewVendingMachines newVendingMachines) {
        this.newVendingMachines = newVendingMachines;
    }

    @Override
    public void insertMoney() {
        System.out.println("you have insert money, no more money need insert");
    }

    @Override
    public void returnMoney() {
        System.out.println("money returned");
        newVendingMachines.setState(newVendingMachines.getNo1_5State());
    }

    @Override
    public void passButton() {
        System.out.println("you passed the button...");

        int winner = (int)(Math.random()*10);
        if ((winner == 0) && (newVendingMachines.getCount() > 1)) {
            newVendingMachines.setState(newVendingMachines.getWinnerState());
        } else {
            newVendingMachines.setState(newVendingMachines.getSoldState());
        }
    }

    @Override
    public void distribute() {
        System.out.println("no water distributed");
    }
}
