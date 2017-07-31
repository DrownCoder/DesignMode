package com.example.xuan.designmode.observer.observer;

import android.util.Log;

import com.example.xuan.designmode.observer.observable.IObserable;

/**
 * Author : xuan.
 * Data : 2017/7/31.
 * Description :input the description of this file.
 */

public class ObserverA implements IObserver {
    private IObserable mObserable;

    public ObserverA(IObserable obserable) {
        this.mObserable = obserable;
        mObserable.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.i("TAG", "A receives the msg:" + msg);
    }
}
