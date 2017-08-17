package com.example.xuan.designmode.singleton;

/**
 * Author : xuan.
 * Data : 2017/8/16.
 * Description :双重锁
 */

public class SingletonAB {
    private static volatile SingletonAB instance = null;

    public static SingletonAB getInstance() {
        if (instance == null) {
            synchronized (SingletonAB.class) {
                if (instance == null) {
                    instance = new SingletonAB();
                }
            }
        }
        return instance;
    }
}
