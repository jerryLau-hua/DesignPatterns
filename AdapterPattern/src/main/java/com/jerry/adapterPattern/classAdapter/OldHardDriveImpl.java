package com.jerry.adapterPattern.classAdapter;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 10:22
 * @注释
 */
// 旧硬盘驱动器实现
public class OldHardDriveImpl implements OldHardDrive {
    @Override
    public void readData() {
        System.out.println("Reading data from old hard drive...");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to old hard drive...");
    }

    @Override
    public void connect() {
        System.out.println("Connecting old hard drive...");
    }
}
