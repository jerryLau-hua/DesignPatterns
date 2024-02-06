package com.jerry.FactoryPattern.factoryMethodMode;


import com.jerry.FactoryPattern.factoryMethodMode.pizzaStoreImpl.ChinesePizzaStore;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:20
 * @注释 客户端
 */
public class Client {
    public static void main(String[] args) {
        ChinesePizzaStore chinesePizzaStore = new ChinesePizzaStore();
        Pizza pizza = chinesePizzaStore.orderPizza("oo");
        System.out.println(pizza.getName());
    }
}
