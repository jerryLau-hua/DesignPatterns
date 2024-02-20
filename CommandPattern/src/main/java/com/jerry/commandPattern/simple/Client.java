package com.jerry.commandPattern.simple;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 9:19
 * @注释 测试客户端
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        //注册接收者
        TVCommandReceiver receiver = new TVCommandReceiver();
        //注册命令
        CommandOn tvOnCommand = new CommandOn(receiver);
        CommandOff tvOffCommand = new CommandOff(receiver);

        //添加命令
        Invoker invoker = new Invoker();
        invoker.putCommand(tvOnCommand);
        invoker.putCommand(tvOffCommand);

        invoker.cancelCommand(tvOffCommand);

        //命令执行
        invoker.runCommand();

    }
}
