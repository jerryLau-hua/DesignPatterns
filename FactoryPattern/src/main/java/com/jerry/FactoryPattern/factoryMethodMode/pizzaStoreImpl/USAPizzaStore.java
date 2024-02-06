package com.jerry.FactoryPattern.factoryMethodMode.pizzaStoreImpl;

import com.jerry.FactoryPattern.factoryMethodMode.Pizza;
import com.jerry.FactoryPattern.factoryMethodMode.PizzaStore;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/6 11:29
 * @注释 美国pizza 店
 */
public class USAPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
