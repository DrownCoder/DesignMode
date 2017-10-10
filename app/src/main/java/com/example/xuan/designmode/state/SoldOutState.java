package com.example.xuan.designmode.state;

import android.util.Log;

/**
 * Author : xuan.
 * Date : 2017/10/10.
 * Description :input the description of this file.
 */

public class SoldOutState implements State {
    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        Log.e("STATE", "没有娃娃了，你确定你还要投币？");
    }

    @Override
    public void ejectQuarter() {
        Log.e("STATE", "不投币，退什么退！");
    }

    @Override
    public void turnCrank() {
        Log.e("STATE", "没有娃娃了，你抓有用？");
    }

    @Override
    public void dispense() {
        Log.e("STATE", "说了几遍没娃娃了！");
    }
}
