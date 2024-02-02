package com.jerry.StrategyPattern.quack;

import com.jerry.StrategyPattern.QuackBehavior;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:11
 * @注释
 */
public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("no quack");
    }
}
