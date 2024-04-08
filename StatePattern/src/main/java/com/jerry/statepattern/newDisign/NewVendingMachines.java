package com.jerry.statepattern.newDisign;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/7 16:08
 * @注释 自动售卖机
 */
public class NewVendingMachines {
    State soldState;
    State soldOutState;
    State has1_5State;
    State no1_5State;

    State winnerState;

    State state = soldOutState;
    int count = 0;

    public NewVendingMachines(int count) {

        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        has1_5State = new Has1_5State(this);
        no1_5State = new No1_5State(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = no1_5State;
        }
    }

    public void insertMoney() {
        state.insertMoney();
    }

    /***
     * 退币
     */
    public void returnMoney() {
        state.returnMoney();
    }


    /***
     * 按钮按下
     */
    public void passButton() {
        state.passButton();
        state.distribute();
    }

    public void setState(State state) {
        this.state = state;
    }


    public void flushWater() {
        System.out.println("A bottom of water comes rolling out the slot");
        if (count != 0) {
            count = count-1;
        }
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHas1_5State() {
        return has1_5State;
    }

    public State getNo1_5State() {
        return no1_5State;
    }

    public State getState() {
        return state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    //....

    @Override
    public String toString() {
        return "VendingMachines{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}


