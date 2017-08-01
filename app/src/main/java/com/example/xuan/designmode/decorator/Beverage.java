package com.example.xuan.designmode.decorator;

/**
 * Author : xuan.
 * Data : 2017/8/1.
 * Description :input the description of this file.
 */

public abstract class Beverage {
    String des;

    public String getDes() {
        return des;
    }

    public abstract double cost();
}
