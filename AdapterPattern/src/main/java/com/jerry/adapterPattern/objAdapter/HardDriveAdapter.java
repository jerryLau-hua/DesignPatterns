package com.jerry.adapterPattern.objAdapter;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 10:22
 * @注释
 */
// 适配器类，将OldHardDrive接口适配到NewHardDrive接口
public class HardDriveAdapter implements NewHardDrive {
    private OldHardDrive oldHardDrive;

    public HardDriveAdapter(OldHardDrive oldHardDrive) {
        this.oldHardDrive = oldHardDrive;
    }

    @Override
    public void read() {
        oldHardDrive.readData();
    }

    @Override
    public void write() {
        oldHardDrive.writeData();
    }

    @Override
    public void connectToSystem() {
        oldHardDrive.connect();
        System.out.println("Adapter connected old hard drive to the new system.");
    }
}
