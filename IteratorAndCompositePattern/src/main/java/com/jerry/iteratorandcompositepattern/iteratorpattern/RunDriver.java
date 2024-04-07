package com.jerry.iteratorandcompositepattern.iteratorpattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 15:55
 * @注释
 */
public class RunDriver {
    public static void main(String[] args) {
        PanCakeMenu panCakeMenu = new PanCakeMenu();
        LunchMenu lunchMenu = new LunchMenu();
        Waiter waiter = new Waiter(panCakeMenu, lunchMenu);
        waiter.showMenu();
    }
}
