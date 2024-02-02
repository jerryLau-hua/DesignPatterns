package com.jerry.StrategyPattern.fly;

import com.jerry.StrategyPattern.FlyBehavior;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:35
 * @注释
 */
public class RocketFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
