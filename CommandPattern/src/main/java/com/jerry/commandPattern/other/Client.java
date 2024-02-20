package com.jerry.commandPattern.other;

import com.jerry.commandPattern.simple.CommandOff;
import com.jerry.commandPattern.simple.CommandOn;
import com.jerry.commandPattern.simple.Invoker;
import com.jerry.commandPattern.simple.TVCommandReceiver;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 9:19
 * @注释 测试客户端
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        CommandQueue commandQueue = new CommandQueue();
        CommandInvoker invoker = new CommandInvoker(commandQueue);
        invoker.start(); // 启动命令执行线程

        // 添加命令到队列
        commandQueue.addCommand(new ExampleCommand("First command"));
        commandQueue.addCommand(new ExampleCommand("Second command"));

        // 在需要的时候停止命令执行线程
//         invoker.interrupt();

    }
}
