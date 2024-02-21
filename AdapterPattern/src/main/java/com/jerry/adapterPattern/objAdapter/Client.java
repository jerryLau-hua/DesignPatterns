package com.jerry.adapterPattern.objAdapter;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 10:23
 * @注释
 */
public class Client {
    public static void main(String[] args) {
        // 创建旧硬盘驱动器实例
        OldHardDrive oldHardDrive = new OldHardDriveImpl();

        // 创建适配器，将旧硬盘驱动器传递给适配器
        NewHardDrive adapter = new HardDriveAdapter(oldHardDrive);

        // 使用适配器调用新接口的方法
        adapter.connectToSystem();
        adapter.read();
        adapter.write();
    }
}