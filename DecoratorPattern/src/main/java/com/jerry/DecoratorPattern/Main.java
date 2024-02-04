package com.jerry.DecoratorPattern;


import com.jerry.DecoratorPattern.ingredient.Chocolate;
import com.jerry.DecoratorPattern.ingredient.MilkCup;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 14:21
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println(coffee.getDescription() + ":" + coffee.cost());

        Drinks coffee2 = new Coffee();
        coffee2 = new Chocolate(coffee2);
        coffee2 = new MilkCup(coffee2);
        System.out.println(coffee2.getDescription() + ":" + coffee2.cost());


    }
}
