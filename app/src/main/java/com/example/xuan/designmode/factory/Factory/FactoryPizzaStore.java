package com.example.xuan.designmode.factory.Factory;


import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public abstract class FactoryPizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        Log.i("TAG", pizza.desc);
        pizza.operate1();
        pizza.operate2();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
