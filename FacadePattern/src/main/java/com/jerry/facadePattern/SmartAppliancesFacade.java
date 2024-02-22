package com.jerry.facadePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 17:23
 * @注释
 */
//智能音箱
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;

    //other household appliance

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message) {
        if (message.contains("开灯")) {
            onLamp();
        } else if (message.contains("关灯")) {
            offLamp();
        } else if (message.contains("开电视")) {
            onTV();
        } else if (message.contains("关电视")) {
            offTV();
        } else if (message.contains("开空调")) {
            onAirCondition();
        } else if (message.contains("关空调")) {
            offAirCondition();
        } else if (message.contains("打开家电")) {
            onLamp();
            onTV();
            onAirCondition();
            //on other household appliance
        } else if (message.contains("关闭家电")) {
            offLamp();
            offTV();
            offAirCondition();
            //off other household appliance
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    private void onLamp() {
        light.on();
    }

    private void offLamp() {
        light.off();
    }

    private void onTV() {
        tv.on();
    }

    private void offTV() {
        tv.off();
    }

    private void onAirCondition() {
        airCondition.on();
    }

    private void offAirCondition() {
        airCondition.off();
    }
}


