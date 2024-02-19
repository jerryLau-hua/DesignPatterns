package com.jerry.singlePattern;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/19 13:10
 * @注释 枚举
 *
 */
public enum SingleInstance5 implements Serializable {
    INSTANCE_5;

    // 如果需要，可以添加其他属性或方法
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    // 其他需要的方法
}
