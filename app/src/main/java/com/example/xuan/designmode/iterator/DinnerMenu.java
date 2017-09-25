package com.example.xuan.designmode.iterator;

import android.util.Log;

import java.util.Iterator;

/**
 * Author : xuan.
 * Data : 2017/9/19.
 * Description :input the description of this file.
 */

public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    String menuItems[];
    int count = 0;

    public DinnerMenu() {
        menuItems = new String[MAX_ITEMS];
        for (int i = 0; i < 5; i++) {
            addItem("dinnerDesc" + i);
        }
    }

    public void addItem(String desc) {
        if (count < MAX_ITEMS) {
            menuItems[count] = desc;
            count++;
        } else {
            Log.e("ITERATOR", "the menu is filled");
        }
    }

    @Override
    public Iterator createIntercator() {
        return new DinnerIterator(menuItems);
    }
}
