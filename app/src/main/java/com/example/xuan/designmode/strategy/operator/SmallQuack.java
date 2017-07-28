package com.example.xuan.designmode.strategy.operator;

import android.util.Log;


/**
 * Author : xuan.
 * Data : 2017/7/28.
 * Description :input the description of this file.
 */

public class SmallQuack implements QuackBehavior {
    @Override
    public void quack() {
        Log.i("TAG", "quack is small");
    }
}
