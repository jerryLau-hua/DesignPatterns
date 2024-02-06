package com.jerry.FactoryPattern.simpleFactoryMode;

import com.jerry.FactoryPattern.simpleFactoryMode.pizzaStoreImpl.PizzaStore;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:20
 * @注释 客户端
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");

    }
}
