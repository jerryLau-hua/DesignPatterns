package com.jerry.FactoryPattern.abstractMethodMode.pizzaStoreImpl;

import com.jerry.FactoryPattern.abstractMethodMode.Pizza;
import com.jerry.FactoryPattern.abstractMethodMode.PizzaStore;
import com.jerry.FactoryPattern.abstractMethodMode.factory.ChinesePizzaFactory;
import com.jerry.FactoryPattern.abstractMethodMode.pizzaImpl.CNCheeseChickenPizza;


/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/6 11:29
 * @注释 中国pizza 店
 */
public class ChinesePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        ChinesePizzaFactory chinesePizzaFactory = new ChinesePizzaFactory();
        if (type.equals("cheese&chicken")) {
            CNCheeseChickenPizza cnCheeseChickenPizza = new CNCheeseChickenPizza(chinesePizzaFactory);
            cnCheeseChickenPizza.setName("chinese cheese chicken pizza");
            return cnCheeseChickenPizza;
        }

        return null;
    }
}
