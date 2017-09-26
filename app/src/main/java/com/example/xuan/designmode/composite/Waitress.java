package com.example.xuan.designmode.composite;

/**
 * Author : xuan.
 * Data : 2017/9/26.
 * Description :input the description of this file.
 */

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
