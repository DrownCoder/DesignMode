package com.example.xuan.designmode.observer.observable;

import com.example.xuan.designmode.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : xuan.
 * Data : 2017/7/31.
 * Description :input the description of this file.
 */

public class Observable implements IObserable{
    private List<IObserver> mObservers;
    boolean mChanged;

    public Observable() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        mObservers.remove(o);
    }

    @Override
    public void notifyObservers(String msg) {
        if (mChanged) {
            for (IObserver o : mObservers) {
                o.update(msg);
            }
            mChanged = false;
        }
    }

    @Override
    public void setChanged() {
        mChanged = true;
    }

    public void notifyAllObserver(String msg) {
        notifyObservers(msg);
    }
}
