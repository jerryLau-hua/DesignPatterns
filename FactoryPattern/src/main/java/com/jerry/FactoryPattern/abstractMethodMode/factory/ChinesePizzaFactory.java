package com.jerry.FactoryPattern.abstractMethodMode.factory;

import com.jerry.FactoryPattern.abstractMethodMode.material.*;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/18 16:43
 * @注释 中国pizza工厂
 */
public class ChinesePizzaFactory implements materialFactory {
    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Butter createButter() {
        return new Butter();
    }

    @Override
    public Chicken createChicken() {
        return new Chicken();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Ve_lettuce(), new Ve_onion(), new Ve_mushroom()
        };
        return veggies;
    }
}
