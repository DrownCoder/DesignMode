package com.example.xuan.designmode.iterator;

import android.util.Log;

import java.util.Iterator;

/**
 * Author : xuan.
 * Data : 2017/9/19.
 * Description :input the description of this file.
 */

public class DinnerIterator implements Iterator {
    String[] menuItems;
    int index = 0;

    public DinnerIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (index > (menuItems.length - 1) || menuItems[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        return menuItems[index++];
    }

    @Override
    public void remove() {
        if (index == 0) {
            Log.e("ITERATOR", "there is null item in array");
            return;
        }
        menuItems[index--] = null;
    }
}
