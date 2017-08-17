package com.example.xuan.designmode.factory.AbstractFactory;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public abstract class AbstractPizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        Log.i("TAG", pizza.toString());
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
