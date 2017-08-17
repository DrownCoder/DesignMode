package com.example.xuan.designmode.factory.AbstractFactory;

import android.text.TextUtils;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public abstract class Pizza {
    Clams clams;
    Dough dough;

    abstract void prepare();

    @Override
    public String toString() {
        if (clams != null && dough != null) {
            return (TextUtils.isEmpty(clams.showDesc()) ? "no clams" : clams.showDesc()) + (TextUtils
                    .isEmpty(dough.showDesc()) ? "no dough" : dough.showDesc());
        }
        return "";
    }
}
