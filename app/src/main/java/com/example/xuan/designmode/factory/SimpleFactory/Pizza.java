package com.example.xuan.designmode.factory.SimpleFactory;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/8/14.
 * Description :input the description of this file.
 */

public abstract class Pizza {
    String desc;

    public Pizza(String desc) {
        this.desc = desc;
    }
    public void prepare() {
        Log.i("TAG", desc);
    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }

    @Override
    public String toString() {
        return desc;
    }
}
