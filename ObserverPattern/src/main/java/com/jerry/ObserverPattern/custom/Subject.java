package com.jerry.ObserverPattern.custom;

import com.jerry.ObserverPattern.custom.obvs.Obv;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 15:03
 * @注释 观察者主题
 */
public interface Subject {

    public void registerObv(Obv obv);

    public void removeObv(Obv obv);

    //通知
    public void notifyAllObv();

}
