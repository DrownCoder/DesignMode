package com.example.xuan.designmode.state;

import android.util.Log;

/**
 * Author : xuan.
 * Date : 2017/10/10.
 * Description :input the description of this file.
 */

public class HasQuarterState implements State {
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        Log.e("STATE", "一次只能投一个币");
    }

    @Override
    public void ejectQuarter() {
        Log.e("STATE", "退出一个币");
        machine.setCurState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        Log.e("STATE", "开始抓娃娃");
        machine.setCurState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        Log.e("STATE", "还没抓哪来的娃娃");
    }
}
