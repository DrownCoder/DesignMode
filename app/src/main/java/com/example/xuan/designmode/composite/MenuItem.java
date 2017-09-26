package com.example.xuan.designmode.composite;

import android.util.Log;

/**
 * Author : xuan.
 * Data : 2017/9/25.
 * Description :input the description of this file.
 */

public class MenuItem extends MenuComponent {
    String name;
    String desc;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        Log.i("MENUITEM", "name：" + getName());
        Log.i("MENUITEM", "desc：" + getDesc());
        Log.i("MENUITEM", "price：" + getPrice());
        Log.i("MENUITEM", "isVegetarian：" + (isVegetarian()?"true":"false"));
        Log.i("MENUITEM", "----------------------------------------------");
    }
}
