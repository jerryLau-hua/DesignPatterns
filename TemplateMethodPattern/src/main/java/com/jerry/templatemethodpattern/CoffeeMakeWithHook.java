package com.jerry.templatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/23 14:38
 * @注释
 */
public class CoffeeMakeWithHook extends DrinksMake {

    @Override
    protected void addTheIngredients() {
        System.out.println("step 4 : add Sugar and Milk into Coffee");
    }

    @Override
    protected void brew() {
        System.out.println("step 2 : brew Coffee");
    }

    @Override
    boolean ifNeedIngredients() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else
            return false;
    }

    //  让用户输入他们对调料的决定。根据用户的输入返回tue或false
    private String getUserInput() {
        String answer = null;
        System.out.print("would you like milk and sugar with your coffee (y/n) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}


