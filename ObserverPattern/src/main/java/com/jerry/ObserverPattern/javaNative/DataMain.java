package com.jerry.ObserverPattern.javaNative;

import com.jerry.ObserverPattern.javaNative.obvs.Impl.PhoneDisplay;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 15:18
 * @注释 启动类
 */
public class DataMain {
    public static void main(String[] args) {
        Data data = new Data();
        PhoneDisplay phone = new PhoneDisplay(data);

        data.setData(1,2);
        data.setData(1,2);
        data.setData(2,3);
        data.setData(4,3);
    }
}
