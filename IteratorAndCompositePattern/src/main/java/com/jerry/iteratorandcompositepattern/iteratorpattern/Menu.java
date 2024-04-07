package com.jerry.iteratorandcompositepattern.iteratorpattern;

import java.util.Iterator;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/2/29 14:37
 * @注释 menu 公共接口
 */
public interface Menu {
    Iterator createIterator();
}
