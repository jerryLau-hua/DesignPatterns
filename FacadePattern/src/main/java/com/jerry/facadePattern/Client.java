package com.jerry.facadePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/21 17:21
 * @注释
 */
public class Client {
    public static void main(String[] args) {
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("小雷同学，请打开家电");
//        facade.say("关闭家电");
    }
}
