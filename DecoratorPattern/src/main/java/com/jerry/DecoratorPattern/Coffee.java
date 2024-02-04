package com.jerry.DecoratorPattern;


/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 14:19
 * @注释
 */


public class Coffee extends Drinks {

    public Coffee() {
        description = "coffee";
    }

    @Override
    public float cost() {
        return 5;
    }
}
