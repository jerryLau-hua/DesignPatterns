package com.jerry.commandPattern.simple;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/20 8:58
 * @注释 具体的命令 Off
 */
public class CommandOff implements Command{
    TVCommandReceiver tvCommandReceiver;

    public CommandOff(TVCommandReceiver tvCommandReceiver) {
        this.tvCommandReceiver = tvCommandReceiver;
    }


    @Override
    public void execute() throws InterruptedException {
        tvCommandReceiver.off();
    }

}
