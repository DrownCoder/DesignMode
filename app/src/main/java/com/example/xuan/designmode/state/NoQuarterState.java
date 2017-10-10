package com.example.xuan.designmode.state;

import android.util.Log;

/**
 * Author : xuan.
 * Date : 2017/10/10.
 * Description :input the description of this file.
 */

public class NoQuarterState implements State {
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        Log.e("STATE", "你已经成功投币");
        machine.setCurState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        Log.e("STATE", "你还没有投币，怎么退币");
    }

    @Override
    public void turnCrank() {
        Log.e("STATE", "没有投币，不能抓娃娃");
    }

    @Override
    public void dispense() {
        Log.e("STATE", "没有投币，不能得到娃娃");
    }
}
