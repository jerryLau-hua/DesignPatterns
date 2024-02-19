package com.jerry.FactoryPattern.abstractMethodMode;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:06
 * @注释
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}

