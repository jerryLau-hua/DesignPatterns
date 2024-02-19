package com.jerry.singlePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:10
 * @注释 懒汉式 线程不安全
 */
public class SingleInstance {
    public static SingleInstance singleInstance;

    private SingleInstance() {
    }

    public static SingleInstance getInstance() {

        if (singleInstance == null) {
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }
}
