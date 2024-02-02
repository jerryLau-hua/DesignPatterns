package com.jerry.StrategyPattern.fly;

import com.jerry.StrategyPattern.FlyBehavior;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:13
 * @注释
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
