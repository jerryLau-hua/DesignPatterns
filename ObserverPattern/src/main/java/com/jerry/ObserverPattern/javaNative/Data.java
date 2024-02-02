package com.jerry.ObserverPattern.javaNative;


import com.jerry.ObserverPattern.javaNative.obvs.Obv;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 14:26
 * @注释 数据Bean
 */
public class Data extends Observable {
    private double temperature;//温度
    private double humidity;//湿度

    public Data() {}


    public void setData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        dataChanged();
    }


    public void dataChanged() {
        //do something when data changed
        setChanged();
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }


    public double getHumidity() {
        return humidity;
    }



}
