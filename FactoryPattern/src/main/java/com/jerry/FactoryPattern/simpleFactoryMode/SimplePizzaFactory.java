package com.jerry.FactoryPattern.simpleFactoryMode;

import com.jerry.FactoryPattern.simpleFactoryMode.pizzaImpl.CheesePizza;
import com.jerry.FactoryPattern.simpleFactoryMode.pizzaImpl.ChickenPizza;
import com.jerry.FactoryPattern.simpleFactoryMode.pizzaImpl.NormalPizza;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:07
 * @注释
 */
public class SimplePizzaFactory {


    public Pizza creatPizza(String type) {
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
