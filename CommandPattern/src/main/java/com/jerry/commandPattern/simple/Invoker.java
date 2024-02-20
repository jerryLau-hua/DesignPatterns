package com.jerry.commandPattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 9:07
 * @注释 命令调用者
 */
public class Invoker {

    private List<Command> commandList = new ArrayList<>();

    /***
     * 添加命令
     * @param command
     */
    public void putCommand(Command command) {
        commandList.add(command);
    }

    /***
     * 执行命令
     * @throws InterruptedException
     */
    public void runCommand() throws InterruptedException {
        if (commandList.size() == 0) {
            System.out.println("no command input");
        }
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

    /***
     * 取消命令
     * @param command
     */
    public void cancelCommand(Command command) {
        if (commandList.size() == 0) {
            System.out.println("no command input");
        }
        int index = commandList.indexOf(command);
        if (index == -1) {
            System.out.println("no such command find ");
        } else {

            commandList.remove(index);
            System.out.println("command " + command + "has been canceled");
        }
    }
}
