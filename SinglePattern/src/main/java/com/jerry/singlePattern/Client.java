package com.jerry.singlePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:12
 * @注释 测试类
 */
public class Client extends Thread {
    @Override
    public void run() {
        // 线程执行的代码
        SingleInstance5 instance = SingleInstance5.INSTANCE_5;

        System.out.println(instance + " <线程"+Thread.currentThread().getId()+"正在运行>");
    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            Client myThread = new Client();
            myThread.start(); // 启动线程
        }
    }

}