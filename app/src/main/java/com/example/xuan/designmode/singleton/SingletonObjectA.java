package com.example.xuan.designmode.singleton;

/**
 * Author : xuan.
 * Data : 2017/8/16.
 * Description :懒汉式
 */

public class SingletonObjectA {
    private static SingletonObjectA instance = null;

    public static synchronized SingletonObjectA getInstance() {
        if (instance == null) {
            instance = new SingletonObjectA();
        }
        return instance;
    }
}
