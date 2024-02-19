package com.jerry.singlePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:10
 * @注释 静态内部类
 *
 * 这种方式利用了 classloader 的机制来保证初始化 instance 时只有一个线程，因此也是线程安全的。
 * 同时，这种方式也达到了懒加载的效果，即 Singleton 类被加载时，并没有立即实例化，而是在需要实例化时，调用 getInstance 方法，
 * 才会装载 SingletonHolder 类，从而完成 Singleton 的实例化。
 */
public class SingleInstance4 {
    private static class SingletonHolder {
        private static final SingleInstance4 INSTANCE = new SingleInstance4();
    }
    private SingleInstance4 (){}

    public static final SingleInstance4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
