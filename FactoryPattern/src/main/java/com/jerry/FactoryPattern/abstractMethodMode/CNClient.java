package com.jerry.FactoryPattern.abstractMethodMode;


import com.jerry.FactoryPattern.abstractMethodMode.pizzaStoreImpl.ChinesePizzaStore;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:20
 * @注释 客户端
 */
public class CNClient {
    public static void main(String[] args) {
        ChinesePizzaStore chinesePizzaStore = new ChinesePizzaStore();
        Pizza pizza = chinesePizzaStore.orderPizza("cheese&chicken");
        System.out.println(pizza.toString());
    }
}
