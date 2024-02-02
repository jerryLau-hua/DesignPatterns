package com.jerry.StrategyPattern.ducks;

import com.jerry.StrategyPattern.FlyBehavior;
import com.jerry.StrategyPattern.QuackBehavior;

/**
 * 策略模式
 *
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/1 13:34
 * @注释
 */
public  class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println("display");
    }

    public void PerformQuack() {
        quackBehavior.quack();
    }

    public void PerformFly() {
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
