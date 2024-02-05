package com.jerry.DecoratorPattern.JavaNative;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/5 10:50
 * @注释 自定义文件读取类
 */
public class MyFileRead extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected MyFileRead(InputStream in) {
        super(in);
    }

    //针对字节
    @Override
    public int read() throws IOException {
        int temp = super.read();
        return temp == -1 ? temp : Character.toUpperCase((char) temp);
    }

    //针对字节数组
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int temp = super.read(b, off, len);
        for (int i = off; i < off + temp; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }
        return temp;
    }

}
