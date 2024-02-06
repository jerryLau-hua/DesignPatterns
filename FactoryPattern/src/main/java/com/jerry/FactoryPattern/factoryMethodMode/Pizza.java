package com.jerry.FactoryPattern.factoryMethodMode;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 14:09
 * @注释 🍕 接口
 */
public abstract class Pizza {
    public String name;

    void prepare() {
        System.out.println("prepare");
    }


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
}
