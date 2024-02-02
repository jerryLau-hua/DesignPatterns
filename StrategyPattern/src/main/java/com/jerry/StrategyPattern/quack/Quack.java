package com.jerry.StrategyPattern.quack;

import com.jerry.StrategyPattern.QuackBehavior;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:10
 * @注释
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("normal quack");
    }
}
