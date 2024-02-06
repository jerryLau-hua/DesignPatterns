package com.jerry.FactoryPattern.simpleFactoryMode.pizzaImpl;

import com.jerry.FactoryPattern.simpleFactoryMode.Pizza;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:16
 * @注释
 */
public class NormalPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NormalPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NormalPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NormalPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NormalPizza box");
    }
}
