package com.jerry.ObserverPattern.custom;


import com.jerry.ObserverPattern.custom.obvs.Obv;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 14:26
 * @注释 数据Bean
 */
public class Data implements Subject {
    private double temperature;//温度
    private double humidity;//湿度

    private List<Obv> ObvList;

    public Data() {
        ObvList = new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }


    public double getHumidity() {
        return humidity;
    }

    public void setData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        dataChanged();
    }


    public void dataChanged() {
        //do something when data changed
        notifyAllObv();
    }


    @Override
    public void registerObv(Obv obv) {
        ObvList.add(obv);
    }

    @Override
    public void removeObv(Obv obv) {
        ObvList.remove(obv);
    }

    @Override
    public void notifyAllObv() {
        for (Obv obv : ObvList) {
            obv.update(temperature, humidity);
        }
    }


}
