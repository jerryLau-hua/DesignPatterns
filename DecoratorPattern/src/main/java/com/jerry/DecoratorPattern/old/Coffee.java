package com.jerry.DecoratorPattern.old;

import com.jerry.DecoratorPattern.old.Drinks;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 14:19
 * @注释
 */

@Deprecated
public class Coffee extends Drinks {

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public float cost() {
        return super.cost() + 3;
    }
}
