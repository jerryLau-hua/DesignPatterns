package com.jerry.singlePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:10
 * @注释 懒汉式 双重锁机制保证线程安全
 */
public class SingleInstance3 {
    public static volatile SingleInstance3 singleInstance;

    private SingleInstance3() {
    }

    public static  SingleInstance3 getInstance() {

        if (singleInstance == null) {
            synchronized (SingleInstance3.class) {
                if (singleInstance == null) {
                    singleInstance = new SingleInstance3();
                }
            }
        }
        return singleInstance;
    }
}
