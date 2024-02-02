package com.jerry.ObserverPattern.custom;

import com.jerry.ObserverPattern.custom.obvs.Impl.PadDisplay;
import com.jerry.ObserverPattern.custom.obvs.Impl.PhoneDisplay;

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
        PadDisplay pad = new PadDisplay(data);

        data.setData(1,2);
        data.setData(2,3);
        data.removeObv(pad);
        data.setData(2,3);
        data.setData(4,3);

    }
}
