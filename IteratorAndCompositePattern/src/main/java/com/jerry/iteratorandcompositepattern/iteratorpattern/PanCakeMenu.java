package com.jerry.iteratorandcompositepattern.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 14:37
 * @注释 A餐馆的馅饼菜单
 */
public class PanCakeMenu implements Menu{
    private ArrayList menuItems;

    public PanCakeMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B PanCake", "PanCake with eggs and beef", true, 18.0);
        addItem("normal PanCake", "PanCake with eggs", true, 10.0);
        addItem("blueberry PanCake", "PanCake with blue and cheese", false, 13.0);
    }

    private void addItem(String name, String disc, boolean vegetarian, double price) {

        menuItems.add(new MenuItem(name, disc, vegetarian, price));

    }

    public Iterator createIterator() {
        Iterator iterator = menuItems.iterator();
        return iterator;
    }

}
