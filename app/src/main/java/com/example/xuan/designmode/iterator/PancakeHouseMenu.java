package com.example.xuan.designmode.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author : xuan.
 * Data : 2017/9/19.
 * Description :input the description of this file.
 */

public class PancakeHouseMenu implements Menu {
    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            addItem("pancakeDesc" + i);
        }
    }

    public void addItem(String desc) {
        menuItems.add(desc);
    }

    @Override
    public Iterator createIntercator() {
        return menuItems.iterator();
    }
}
