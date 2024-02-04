package com.jerry.DecoratorPattern.ingredient;

import com.jerry.DecoratorPattern.Coffee;
import com.jerry.DecoratorPattern.Drinks;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 15:49
 * @注释 奶盖
 */
public class MilkCup extends IngredientDecorator {
    Drinks drinks;

    public MilkCup(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public float cost() {
        return 1 + drinks.cost();
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + " with milkcup";
    }
}
