package com.jerry.statepattern.outdated;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/7 16:08
 * @注释 自动售卖机
 */
public class VendingMachines {
    final static Integer SOLD_OUT = 0;
    final static Integer NO_MONEY_1_5 = 1;
    final static Integer HAS_MONEY_1_5 = 2;
    final static Integer SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public VendingMachines(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_MONEY_1_5;
        }
    }

    /***
     * 投币
     */
    public void insertMoney() {
        if (state == HAS_MONEY_1_5) {
            System.out.println("you can't insert money ");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't insert money , the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("please wait, we give you a bottom of water");
        } else if (state == NO_MONEY_1_5) {
            state = HAS_MONEY_1_5;
            System.out.println("you inserted money");
        }
    }

    /***
     * 退币
     */
    public void ReturnMoney() {
        if (state == HAS_MONEY_1_5) {
            System.out.println("money returned");
            state = NO_MONEY_1_5;
        } else if (state == SOLD_OUT) {
            System.out.println("you can't return,you have not  insert money yet ");
        } else if (state == SOLD) {
            System.out.println("you already passed the button");
        } else if (state == NO_MONEY_1_5) {
            System.out.println("you have not  insert money");
        }
    }


    /***
     * 按钮按下
     */
    public void passButton() {
        if (state == HAS_MONEY_1_5) {
            System.out.println("you passed the button ...");
            state = SOLD;
            //发放水
            distribute();
        } else if (state == SOLD_OUT) {
            System.out.println("you passed the button,but no water sold ");
        } else if (state == SOLD) {
            System.out.println("pass button twice doesn't get another water");
        } else if (state == NO_MONEY_1_5) {
            System.out.println("you passed the button,but you should insert money first");
        }

    }

    /***
     * 分发水
     */
    public void distribute() {
        if (state == SOLD) {
            System.out.println("A bottom of water comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops,out of water!");
                state = SOLD_OUT;
            } else {
                state = NO_MONEY_1_5;
            }
        } else if (state == NO_MONEY_1_5) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No water distributed");
        } else if (state == HAS_MONEY_1_5) {
            System.out.println("No water distributed");
        }

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


