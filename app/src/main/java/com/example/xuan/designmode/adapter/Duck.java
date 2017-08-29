package com.example.xuan.designmode.adapter;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/8/29.
 * Description :input the description of this file.
 */

public class Duck implements IDuck {
    @Override
    public void quack() {
        Log.i("TAG", "the duck quack");
    }

    @Override
    public void fly() {
        Log.i("TAG", "the duck fly");
    }
}
