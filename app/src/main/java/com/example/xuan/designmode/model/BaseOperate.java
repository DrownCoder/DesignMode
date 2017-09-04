package com.example.xuan.designmode.model;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/9/4.
 * Description :input the description of this file.
 */

public abstract class BaseOperate {
    public void Operate() {
        show();
        operate1();
        operate2();
        operate3();
    }

    public abstract void show();

    private void operate1() {
        Log.i("TAG", "base operate1");
    }
    private void operate2() {
        Log.i("TAG", "base operate2");
    }

    protected void operate3() {
        Log.i("TAG", "base operate3");
    }
}
