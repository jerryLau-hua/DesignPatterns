package com.jerry.iteratorandcompositepattern.iteratorpattern;

import java.util.Iterator;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 15:01
 * @注释 合并后的B餐厅的waiter
 */
public class Waiter {
    private Menu panCakeMenu;
    private Menu lunchMenu;

    public Waiter(Menu panCakeMenu, Menu lunchMenu) {
        this.panCakeMenu = panCakeMenu;
        this.lunchMenu = lunchMenu;
    }

    public void showMenu() {
        //展示菜单

        Iterator iterator1 = panCakeMenu.createIterator();
        Iterator iterator = lunchMenu.createIterator();
        System.out.println("breakfast-");
        showMenu(iterator1);
        System.out.println("lunch-");
        showMenu(iterator);
        System.out.println("remove-");
        iterator.remove();
        showMenu(iterator);
    }

    public void showMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
