package com.example.xuan.designmode.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author : xuan.
 * Date : 2017/10/18.
 * Description :input the description of this file.
 */

public class ProxyHandler implements InvocationHandler {
    private Operate real;

    public ProxyHandler(Operate real) {
        this.real = real;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Log.i("Proxy", "this is first operated by invoke");
        Object object = method.invoke(real, objects);
        Log.i("Proxy", "this is last operated by invoke");
        return object;
    }
}
