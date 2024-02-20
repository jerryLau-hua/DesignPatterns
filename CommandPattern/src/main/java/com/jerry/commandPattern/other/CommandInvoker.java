package com.jerry.commandPattern.other;


/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 9:07
 * @注释 命令调用者
 */

public class CommandInvoker extends Thread {
    private final CommandQueue commandQueue;

    public CommandInvoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Command command = commandQueue.takeCommand();
                System.out.println("command is "+command);
                command.execute();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}