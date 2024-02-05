package com.jerry.DecoratorPattern.JavaNative;

import java.io.*;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 10:49
 * @注释 java io 测试类
 */
public class Main {
    public static void main(String[] args) {
        int temp;
        try {
            InputStream resourceAsStream = Main.class.getResourceAsStream("/a.txt");

//            FileInputStream fileInputStream = new FileInputStream("D:\\workspace\\upDemo\\microservices\\DesignPatterns\\DecoratorPattern\\src\\main\\resources\\a.txt");

            InputStream inputStream = new MyFileRead(new BufferedInputStream(resourceAsStream));

            while ((temp = inputStream.read()) > 0) {
                System.out.println((char) temp);
            }
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
