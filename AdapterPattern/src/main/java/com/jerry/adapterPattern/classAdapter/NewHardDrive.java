package com.jerry.adapterPattern.classAdapter;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 10:21
 * @注释 新的驱动
 */
public interface NewHardDrive {
    void read();
    void write();
    void connectToSystem();
}