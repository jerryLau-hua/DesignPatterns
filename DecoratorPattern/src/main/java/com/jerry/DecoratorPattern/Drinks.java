package com.jerry.DecoratorPattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 14:16
 * @注释 装饰者模式
 */

public abstract class Drinks {
    public String description;

    public abstract float cost();

    public String getDescription() {
        return description;
    }
    //other set options...
}
