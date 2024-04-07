package com.jerry.iteratorandcompositepattern.compositePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 15:01
 * @注释 waiter
 */
public class Waiter {
    MenuComponent allMenus;

    public Waiter(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
