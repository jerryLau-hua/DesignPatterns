package com.jerry.StrategyPattern.quack;

import com.jerry.StrategyPattern.QuackBehavior;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:12
 * @注释
 */
public class LazyQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("lazy quack");
    }
}
