package com.jerry.singlePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:10
 * @注释 懒汉式 锁机制保证线程安全
 *  这种实现方式虽然保证了线程安全，但是效率很低，每次调用 getInstance() 方法都要进行同步。
 */
public class SingleInstance2 {
    public static SingleInstance2 singleInstance;

    private SingleInstance2() {
    }

    public static synchronized SingleInstance2 getInstance() {

        if (singleInstance == null) {
            singleInstance = new SingleInstance2();
        }
        return singleInstance;
    }
}
