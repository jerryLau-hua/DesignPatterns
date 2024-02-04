package com.jerry.DecoratorPattern;

import com.jerry.DecoratorPattern.old.Drinks;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 14:20
 * @注释
 */
public class Tea extends Drinks {
    @Override
    public float cost() {
        return 5;
    }
}
