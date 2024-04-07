package com.jerry.iteratorandcompositepattern.iteratorpattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 14:47
 * @注释
 */
public class MenuItem {
    String name;
    String disc;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String disc, boolean vegetarian, double price) {
        this.name = name;
        this.disc = disc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", disc='" + disc + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
