package com.jerry.FactoryPattern.abstractMethodMode.pizzaImpl;


import com.jerry.FactoryPattern.abstractMethodMode.Pizza;
import com.jerry.FactoryPattern.abstractMethodMode.factory.ChinesePizzaFactory;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:12
 * @注释
 */
public class CNCheeseChickenPizza extends Pizza {
    ChinesePizzaFactory chinesePizzaFactory;

    public CNCheeseChickenPizza(ChinesePizzaFactory chinesePizzaFactory) {
        this.chinesePizzaFactory = chinesePizzaFactory;
    }


    @Override
    protected void prepare() {
        butter = chinesePizzaFactory.createButter();
        cheese = chinesePizzaFactory.createCheese();
        chicken = chinesePizzaFactory.createChicken();
        veggies= chinesePizzaFactory.createVeggies();
    }
}
