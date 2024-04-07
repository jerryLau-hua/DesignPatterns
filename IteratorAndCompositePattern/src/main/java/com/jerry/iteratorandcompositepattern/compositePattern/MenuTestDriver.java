package com.jerry.iteratorandcompositepattern.compositePattern;

/**
 * @version 1.0
 * @Author jerryLau
 * @Date 2024/4/7 14:11
 * @注释 测试类
 */
public class MenuTestDriver {
    public static void main(String[] args) {
        MenuComponent menuComponentA = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent menuComponentB = new Menu("LUNCH MENU", "Lunch");
        MenuComponent innerMenu = new Menu("LUNCH inner MENU", "Dessert of Lunch ");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(menuComponentA);
        allMenus.add(menuComponentB);

        menuComponentB.add(new MenuItem("蛋炒饭", "蛋炒饭：米饭，鸡蛋", 15.0, false));
        menuComponentB.add(innerMenu);
        innerMenu.add(new MenuItem("甜点", "饭后甜点", 1.5, true));
        innerMenu.add(new MenuItem("水果", "饭后水果", 5.0, true));

        Waiter waiter = new Waiter(allMenus);
        waiter.printMenu();

    }

}
