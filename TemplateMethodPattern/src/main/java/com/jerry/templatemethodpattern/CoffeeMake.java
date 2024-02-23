package com.jerry.templatemethodpattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/23 14:38
 * @注释
 */
public class CoffeeMake extends DrinksMake {

    @Override
    protected void addTheIngredients() {
        System.out.println("step 4 : add milkCup into Coffee");
    }

    @Override
    protected void brew() {
        System.out.println("step 2 : brew Coffee");
    }
}
