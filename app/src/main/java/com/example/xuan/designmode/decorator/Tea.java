package com.example.xuan.designmode.decorator;

/**
 * Author : xuan.
 * Data : 2017/8/1.
 * Description :input the description of this file.
 */

public class Tea extends Beverage {
    public Tea(){
        des = "Tea";
    }
    @Override
    public double cost() {
        return 5.5;
    }
}
