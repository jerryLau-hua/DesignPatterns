package com.jerry.FactoryPattern.simpleFactoryMode.pizzaImpl;

import com.jerry.FactoryPattern.simpleFactoryMode.Pizza;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:12
 * @注释
 */
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box");
    }
}
