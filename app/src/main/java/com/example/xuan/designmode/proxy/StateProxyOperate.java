package com.example.xuan.designmode.proxy;

import android.util.Log;

/**
 * Author : xuan.
 * Date : 2017/10/18.
 * Description :input the description of this file.
 */

public class StateProxyOperate implements Operate {
    private Operate real;

    public StateProxyOperate(Operate real) {
        this.real = real;
    }

    @Override
    public void request() {
        Log.i("Proxy", "this is first operated by StateProxyOperate");
        real.request();
        Log.i("Proxy", "this is last operated by StateProxyOperate");
    }
}
