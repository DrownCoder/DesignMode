package com.example.xuan.designmode.decorator;

/**
 * Author : xuan.
 * Data : 2017/8/1.
 * Description :input the description of this file.
 */

public class Milk extends Beverage {
    public Milk() {
        des = "milk";
    }

    @Override
    public double cost() {
        return 8.5;
    }
}
