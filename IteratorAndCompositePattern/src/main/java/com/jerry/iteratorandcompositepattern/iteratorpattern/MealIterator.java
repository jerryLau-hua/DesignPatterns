package com.jerry.iteratorandcompositepattern.iteratorpattern;

import java.util.Iterator;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 15:11
 * @注释 MealIterator
 */
public class MealIterator implements Iterator {
    private MenuItem[] menuItems;
    private int index = 0;

    public MealIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (menuItems.length <= index||menuItems[index]==null) {
            return false;
        } else
            return true;
    }

    @Override
    public Object next() {

        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (index < 0) {
            throw new IllegalArgumentException("list is empty，no element can be removed !");
        }
        if (menuItems[index - 1] != null) {
            for (int i = index - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[index - 1] = null;
        }

    }
}
