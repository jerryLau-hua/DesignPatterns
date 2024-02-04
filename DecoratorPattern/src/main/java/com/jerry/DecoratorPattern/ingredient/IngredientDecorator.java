package com.jerry.DecoratorPattern.ingredient;

import com.jerry.DecoratorPattern.Drinks;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 15:44
 * @注释 配料装饰类
 */
public abstract class IngredientDecorator extends Drinks {

    public abstract String getDescription();
}
