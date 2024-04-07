package com.jerry.iteratorandcompositepattern.iteratorpattern;

import java.util.Iterator;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 14:37
 * @注释 B餐馆的午餐菜单
 */
public class LunchMenu implements Menu {
    static final Integer MAX_VALUE = 4;
    int index = 0;
    private MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_VALUE];

        addItem("single lunch", "hot dog with coke", true, 18.0);
        addItem("soup", "soup with cake for lunch", true, 19.0);
        addItem("Tomato and egg rice bowl", "rice with Tomato and egg for lunch", true, 21.0);
    }

    private void addItem(String name, String disc, boolean vegetarian, double price) {
        if (menuItems.length > MAX_VALUE) {
            System.out.println("menu is full, not allowed to insert !");
        } else {
            menuItems[index] = new MenuItem(name, disc, vegetarian, price);
            index++;
        }
    }


    public Iterator createIterator() {
        return new MealIterator(menuItems);
    }
}
