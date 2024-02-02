package com.jerry.StrategyPattern.fly;

import com.jerry.StrategyPattern.FlyBehavior;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 14:13
 * @注释
 */
public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("normal fly");
    }
}
