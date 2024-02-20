package com.jerry.commandPattern.simple;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 8:55
 * @注释 命令接收者
 * <p>
 * 具体的命令接收者，实现主要的一些命令逻辑
 */
public class TVCommandReceiver {

    public void on() throws InterruptedException {
        System.out.println("turn on tv");
        Thread.sleep(2000);
        System.out.println("now tv is on");
    }

    public void off() throws InterruptedException {
        System.out.println("turn off tv ");
        Thread.sleep(2000);
        System.out.println("now tv is off");
    }
}
