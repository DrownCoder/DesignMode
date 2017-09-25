package com.example.xuan.designmode.iterator;

import android.util.Log;

import java.util.Iterator;

/**
 * Author : xuan.
 * Data : 2017/9/25.
 * Description :input the description of this file.
 */

public class Waitress {
    Menu dinner,pancake;

    public Waitress(Menu dinner, Menu pancake) {
        this.dinner = dinner;
        this.pancake = pancake;
    }

    public void printMenu() {
        Iterator dinnerIterator = dinner.createIntercator();
        Iterator pancakeIterator = pancake.createIntercator();
        printDesc(dinnerIterator);
        printDesc(pancakeIterator);
    }

    public void printDesc(Iterator iterator) {
        while (iterator.hasNext()) {
            Log.i("desc", iterator.next().toString());
        }
    }
}
