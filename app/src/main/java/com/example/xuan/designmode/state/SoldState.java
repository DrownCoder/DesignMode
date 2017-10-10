package com.example.xuan.designmode.state;

import android.util.Log;

/**
 * Author : xuan.
 * Date : 2017/10/10.
 * Description :input the description of this file.
 */

public class SoldState implements State {
    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        Log.e("STATE", "抓的时候投币没用啊");
    }

    @Override
    public void ejectQuarter() {
        Log.e("STATE", "已经开始抓了还想退币？");
    }

    @Override
    public void turnCrank() {
        Log.e("STATE", "你正在抓啊。。。还不停的抓操作干什么");
    }

    @Override
    public void dispense() {
        if (machine.catchBall()) {
            Log.e("STATE", "恭喜成功抓到娃娃！！！");
            machine.setCurState(machine.getNoQuarterState());
        }else{
            if (!machine.hasBalls()) {
                Log.e("STATE", "抱歉没娃娃了");
                machine.setCurState(machine.getSoldOutState());
            }else {
                Log.e("STATE", "遗憾，没有抓到");
                machine.setCurState(machine.getNoQuarterState());
            }
        }
    }
}
