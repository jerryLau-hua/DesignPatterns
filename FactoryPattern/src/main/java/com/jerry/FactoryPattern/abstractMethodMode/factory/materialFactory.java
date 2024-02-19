package com.jerry.FactoryPattern.abstractMethodMode.factory;

import com.jerry.FactoryPattern.abstractMethodMode.material.Butter;
import com.jerry.FactoryPattern.abstractMethodMode.material.Cheese;
import com.jerry.FactoryPattern.abstractMethodMode.material.Chicken;
import com.jerry.FactoryPattern.abstractMethodMode.material.Veggies;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/18 16:13
 * @注释 原料工厂
 */
public interface materialFactory {

    Cheese createCheese();

    Butter createButter();

    Chicken createChicken();

    Veggies[] createVeggies();

}
