package com.jerry.templatemethodpattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/23 14:38
 * @注释
 *      客户端
 */
public class Client {
    public static void main(String[] args) {
        TeaMake teaMake = new TeaMake();
        CoffeeMake coffeeMake = new CoffeeMake();

        teaMake.makeDrinks();
        coffeeMake.makeDrinks();

    }
}
