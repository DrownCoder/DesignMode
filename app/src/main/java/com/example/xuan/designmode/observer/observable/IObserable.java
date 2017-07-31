package com.example.xuan.designmode.observer.observable;

import com.example.xuan.designmode.observer.observer.IObserver;

/**
 * Author : xuan.
 * Data : 2017/7/31.
 * Description :input the description of this file.
 */

public interface IObserable {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers(String msg);

    void setChanged();

}
