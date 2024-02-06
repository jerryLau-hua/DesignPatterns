package com.jerry.FactoryPattern.factoryMethodMode.pizzaStoreImpl;

import com.jerry.FactoryPattern.factoryMethodMode.Pizza;
import com.jerry.FactoryPattern.factoryMethodMode.PizzaStore;
import com.jerry.FactoryPattern.factoryMethodMode.pizzaImpl.CheesePizza;
import com.jerry.FactoryPattern.factoryMethodMode.pizzaImpl.ChickenPizza;
import com.jerry.FactoryPattern.factoryMethodMode.pizzaImpl.NormalPizza;


/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/6 11:29
 * @注释 中国pizza 店
 */
public class ChinesePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = new NormalPizza();
        if (type == "cheese") {
            return new CheesePizza();
        } else if (type=="chicken") {
            return new ChickenPizza();
        }
        //other pizza

        return pizza;

    }
}
