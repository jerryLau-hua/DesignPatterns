package com.jerry.ObserverPattern.javaNative.obvs.Impl;

import com.jerry.ObserverPattern.javaNative.Data;
import com.jerry.ObserverPattern.javaNative.obvs.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 14:41
 * @注释
 */
public class PhoneDisplay implements Observer, Display {
    private double temp;
    private double humidity;
    Observable observable;

    public PhoneDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("手机显示【温度：" + temp + "湿度：" + humidity + "】");

    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Data) {
            Data data = (Data) o;
            this.temp = data.getTemperature();
            this.humidity = data.getHumidity();
            display();
        }
    }
}
