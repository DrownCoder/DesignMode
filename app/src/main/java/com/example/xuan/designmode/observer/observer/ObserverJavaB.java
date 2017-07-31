package com.example.xuan.designmode.observer.observer;

import android.util.Log;

import com.example.xuan.designmode.observer.observable.ObservableJava;

import java.util.Observable;
import java.util.Observer;

/**
 * Author : xuan.
 * Data : 2017/7/31.
 * Description :input the description of this file.
 */

public class ObserverJavaB implements Observer {
    private String msg;
    Observable observable;

    public ObserverJavaB(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof ObservableJava) {
            ObservableJava observableJava = (ObservableJava) observable;
            this.msg = observableJava.getMsg();
            Log.i("TAG", "ObserverJavaB receives ths msg:" + msg);
        }
    }
}
