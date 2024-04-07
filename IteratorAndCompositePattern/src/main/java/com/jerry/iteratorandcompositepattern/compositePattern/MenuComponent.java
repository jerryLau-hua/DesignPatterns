package com.jerry.iteratorandcompositepattern.compositePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/7 13:52
 * @注释 菜单组件
 */
public abstract class MenuComponent {
    //操作 range start
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    //操作 range end

    //基本属性 range start
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
    //基本属性 range end
}
