package com.example.xuan.designmode.adapter;

/**
 * Author : xuan.
 * Data : 2017/8/29.
 * Description :input the description of this file.
 */

public class Adapter implements IDuck {
    private ITurkey mTurkey;

    public Adapter(ITurkey mTurkey) {
        this.mTurkey = mTurkey;
    }

    @Override
    public void quack() {
        mTurkey.gobble();
    }

    @Override
    public void fly() {
        mTurkey.fly();
    }
}
