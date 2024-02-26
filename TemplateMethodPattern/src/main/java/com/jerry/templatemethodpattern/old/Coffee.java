package com.jerry.templatemethodpattern.old;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/26 16:53
 * @注释
 */
@Deprecated
public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("step 1 Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("step 2 Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("step 3 Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("step 4 Adding Sugar and Milk");
    }
}

