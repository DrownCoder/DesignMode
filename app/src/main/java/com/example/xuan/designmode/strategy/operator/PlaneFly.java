package com.example.xuan.designmode.strategy.operator;

import android.util.Log;


/**
 * Author : xuan.
 * Data : 2017/7/28.
 * Description :input the description of this file.
 * 飞机
 */

public class PlaneFly implements FlyBehavior {
    @Override
    public void fly() {
        Log.i("TAG", "fly by plane");
    }
}
