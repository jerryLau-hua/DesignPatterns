package com.jerry.StrategyPattern;

import com.jerry.StrategyPattern.ducks.Duck;
import com.jerry.StrategyPattern.ducks.ModelDuck;
import com.jerry.StrategyPattern.fly.RocketFly;
import com.jerry.StrategyPattern.quack.NoQuack;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:25
 * @注释
 */
public class MainDuck {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        System.out.println("设置之前");
        modelDuck.PerformFly();
        modelDuck.PerformQuack();

        modelDuck.setFlyBehavior(new RocketFly());
        modelDuck.setQuackBehavior(new NoQuack());
        System.out.println("设置之后");
        modelDuck.PerformFly();
        modelDuck.PerformQuack();


    }
}
