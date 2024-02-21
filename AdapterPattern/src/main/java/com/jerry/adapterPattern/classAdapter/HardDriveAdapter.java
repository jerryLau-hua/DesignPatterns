package com.jerry.adapterPattern.classAdapter;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 10:22
 * @注释
 */
// 适配器类，将OldHardDrive接口适配到NewHardDrive接口
public class HardDriveAdapter extends OldHardDriveImpl implements NewHardDrive {
    // 由于继承了Adaptee，所以可以直接使用Adaptee的方法
    // 同时也需要实现Target接口中的方法
    @Override
    public void read() {
        readData();
    }

    @Override
    public void write() {
      writeData();
    }

    @Override
    public void connectToSystem() {
       connect();
        System.out.println("Adapter connected old hard drive to the new system.");
    }
}
