package com.jerry.FactoryPattern.abstractMethodMode;

import com.jerry.FactoryPattern.abstractMethodMode.material.Butter;
import com.jerry.FactoryPattern.abstractMethodMode.material.Cheese;
import com.jerry.FactoryPattern.abstractMethodMode.material.Chicken;
import com.jerry.FactoryPattern.abstractMethodMode.material.Veggies;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:09
 * @注释 🍕 接口
 */
public abstract class Pizza {
    public String name;

    public Butter butter;
    public Cheese cheese;
    public Chicken chicken;
    public Veggies[] veggies;

    protected abstract void prepare();


    void bake() {
        System.out.println("bake");
    }


    void cut() {
        System.out.println("cut");
    }

    void box() {
        System.out.println("box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", butter=" + butter +
                ", cheese=" + cheese +
                ", chicken=" + chicken +
                ", veggies=" + veggies +
                '}';
    }
}
