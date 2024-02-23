package com.jerry.templatemethodpattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/23 14:34
 * @注释
 */
abstract class DrinksMake {
    //模板方法
    public final void makeDrinks() {

        //step 1 烧水
        boiledWater();
        //step 2 冲泡
        brew();
        //step3 倒出到杯子中
        pourInCup();
        //step4 添加配料
        addTheIngredients();

    }


    protected abstract void addTheIngredients();

    protected abstract void brew();

    protected void boiledWater() {
        System.out.println("step1:boiled water!");
    }

    protected void pourInCup() {
        System.out.println("step3: pourInCup !");
    }


}
