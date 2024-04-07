package com.jerry.iteratorandcompositepattern.compositePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/7 13:57
 * @注释 菜单项
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;

    public MenuItem(String name, String description, double price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.println(" " + getName() + (isVegetarian() ? "(N)" : "(Y)") + " " + getDescription() + " " + getPrice() + " ");
    }
}
