package com.jerry.FactoryPattern.simpleFactoryMode.pizzaStoreImpl;

import com.jerry.FactoryPattern.simpleFactoryMode.Pizza;
import com.jerry.FactoryPattern.simpleFactoryMode.SimplePizzaFactory;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:06
 * @注释
 */
public  class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.creatPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}

