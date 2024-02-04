package com.jerry.DecoratorPattern.ingredient;

import com.jerry.DecoratorPattern.Coffee;
import com.jerry.DecoratorPattern.Drinks;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 15:49
 * @注释 巧克力
 */
public class Chocolate extends IngredientDecorator {
    Drinks drinks;

    public Chocolate(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public float cost() {
        return 2 + drinks.cost();
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + " with Chocolate";
    }
}
