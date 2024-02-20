package com.jerry.commandPattern.other;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 11:32
 * @注释
 */
public class ExampleCommand implements Command {
    private final String message;

    public ExampleCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Executing: " + message);
        // 执行具体的操作
    }

    @Override
    public void undo() {
        System.out.println("Undoing: " + message);
        // 执行撤销操作
    }
}
