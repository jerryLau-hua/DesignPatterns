package com.jerry.commandPattern.other;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 8:52
 * @注释 抽象命令
 */
public interface Command {
    void execute();
    void undo();
}
