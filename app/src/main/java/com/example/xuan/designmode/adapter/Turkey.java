package com.example.xuan.designmode.adapter;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/8/29.
 * Description :input the description of this file.
 */

public class Turkey implements ITurkey {
    @Override
    public void gobble() {
        Log.i("TAG", "the turkey gobble");
    }

    @Override
    public void fly() {
        Log.i("TAG", "the turkey fly");
    }
}
