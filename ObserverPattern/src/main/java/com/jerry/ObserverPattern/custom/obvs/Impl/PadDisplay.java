package com.jerry.ObserverPattern.custom.obvs.Impl;

import com.jerry.ObserverPattern.custom.Subject;
import com.jerry.ObserverPattern.custom.obvs.Display;
import com.jerry.ObserverPattern.custom.obvs.Obv;


/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/2 14:42
 * @注释
 */
public class PadDisplay implements Obv, Display {
    private double temp;

    private Subject subject;

    public PadDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObv(this);
    }

    @Override
    public void display() {
        System.out.println("pad 显示：温度【" + temp + "】");
    }

    @Override
    public void update(double temp, double humidity) {
        this.temp = temp;
        display();
    }
}
