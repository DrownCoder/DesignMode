package com.example.xuan.designmode.strategy.bean;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/7/28.
 * Description :input the description of this file.
 */

public class TopDuck extends Duck {
    @Override
    public void display() {
        Log.i("TAG", "I am a TopDuck");
    }

    @Override
    public void swim() {
        Log.i("TAG", "I can swim fast");
    }
}
