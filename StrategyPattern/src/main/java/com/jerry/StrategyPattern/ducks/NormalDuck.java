package com.jerry.StrategyPattern.ducks;

import com.jerry.StrategyPattern.fly.Fly;
import com.jerry.StrategyPattern.quack.Quack;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:16
 * @注释
 */
public class NormalDuck extends Duck {
    public NormalDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Normal display");
    }


}
