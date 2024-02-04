package com.jerry.DecoratorPattern.old;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/4 14:16
 * @注释 错误的设计模式
 */
@Deprecated
public class Drinks {
    public String description;
    public boolean Milk = false;
    public boolean Pudding = false;
    public boolean MilkCaps = false;
    public boolean Coconut = false;
    //...other ingredient

    public float cost() {
        if (hasMilk() || hasMilkCaps()) {
            return 1;
        } else if (hasCoconut()) {
            return 2;
        } else if (hasPudding()) {
            return 3;
        }
        return 0;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public boolean hasMilk() {
        return Milk;
    }

    public boolean hasPudding() {
        return Pudding;
    }

    public boolean hasMilkCaps() {
        return MilkCaps;
    }

    public boolean hasCoconut() {
        return Coconut;
    }

    public void setHasMilk(boolean hasMilk) {
        this.Milk = hasMilk;
    }

    public void setHasPudding(boolean hasPudding) {
        this.Pudding = hasPudding;
    }

    public void setHasMilkCaps(boolean hasMilkCaps) {
        this.MilkCaps = hasMilkCaps;
    }

    public void setHasCoconut(boolean hasCoconut) {
        this.Coconut = hasCoconut;
    }
    //other set options...
}
