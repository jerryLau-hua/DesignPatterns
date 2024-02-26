package com.jerry.templatemethodpattern.old;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/26 16:53
 * @注释
 */
@Deprecated
public class Tea {
    void prepareRecipe() {
        boilwater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilwater() {
        System.out.println("step 1 Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("step 2 Steeping the tea");
    }

    public void addLemon() {
        System.out.println("step 3 Adding Lemon");
    }

    public void pourInCup() {
        System.out.println("step 4 Pouring into cup");
    }


}