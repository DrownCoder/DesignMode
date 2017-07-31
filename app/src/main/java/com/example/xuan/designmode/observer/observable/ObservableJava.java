package com.example.xuan.designmode.observer.observable;

import java.util.*;

/**
 * Author : xuan.
 * Data : 2017/7/31.
 * Description :input the description of this file.
 */

public class ObservableJava extends java.util.Observable {
    private String msg;
    public void notifyAllObserver(String msg) {
        this.msg = msg;

        setChanged();
        notifyObservers();
    }

    public String getMsg() {
        return msg;
    }
}
