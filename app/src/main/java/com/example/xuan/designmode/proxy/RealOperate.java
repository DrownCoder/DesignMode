package com.example.xuan.designmode.proxy;

import android.util.Log;

/**
 * Author : xuan.
 * Date : 2017/10/18.
 * Description :input the description of this file.
 */

public class RealOperate implements Operate {
    @Override
    public void request() {
        Log.i("Proxy", "this is operated by real class");
    }
}
