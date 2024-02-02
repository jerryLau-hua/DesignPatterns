package com.jerry.ObserverPattern.custom.obvs.Impl;

import com.jerry.ObserverPattern.custom.Subject;

import com.jerry.ObserverPattern.custom.obvs.Display;
import com.jerry.ObserverPattern.custom.obvs.Obv;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 14:41
 * @注释
 */
public class PhoneDisplay implements Obv , Display {
    private double temp;
    private double humidity;
    private Subject project;

    public PhoneDisplay(Subject project) {
        this.project = project;
        project.registerObv(this);
    }

    @Override
    public void display() {
        System.out.println("手机显示【温度：" + temp + "湿度：" + humidity+"】");

    }

    @Override
    public void update(double temp, double humidity) {
        this.temp = temp;
        this.humidity = humidity;
        this.display();
    }
}
