package com.jerry.commandPattern.other;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 11:33
 * @注释
 */

public class CommandQueue {
    private final LinkedBlockingQueue<Command> queue;

    public CommandQueue() {
        this.queue = new LinkedBlockingQueue<>();
    }

    public void addCommand(Command command) throws InterruptedException {
        queue.put(command);
    }

    public Command takeCommand() throws InterruptedException {
        return queue.take();
    }
}
