package com.jerry.singlePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:10
 * @注释
 * 饿汉式 线程安全
 * 在这个实现中，我们在类加载时就完成了初始化，所以类加载较慢，
 * 但获取对象的速度快。这种方式是基于 classloader 机制避免了多线程的同步问题。
 */
public class SingleInstance1 {
    public static SingleInstance1 singleInstance=new SingleInstance1();

   private SingleInstance1() {
    }

    public static SingleInstance1 getInstance() {
        return singleInstance;
    }
}
