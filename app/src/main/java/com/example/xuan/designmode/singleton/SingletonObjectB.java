package com.example.xuan.designmode.singleton;

/**
 * Author : xuan.
 * Data : 2017/8/16.
 * Description :饿汉式
 */

public class SingletonObjectB {
    private static final SingletonObjectB instance = new SingletonObjectB();

    public static SingletonObjectB getInstance() {
        return instance;
    }
}
