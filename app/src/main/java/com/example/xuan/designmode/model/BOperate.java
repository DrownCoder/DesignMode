package com.example.xuan.designmode.model;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/9/4.
 * Description :input the description of this file.
 */

public class BOperate extends BaseOperate {
    @Override
    public void show() {
        Log.i("TAG", "BOperate show");
    }

    @Override
    protected void operate3() {
        Log.i("TAG", "BOperate operate3");
    }
}
