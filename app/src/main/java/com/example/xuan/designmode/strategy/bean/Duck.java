package com.example.xuan.designmode.strategy.bean;

import com.example.xuan.designmode.strategy.operator.FlyBehavior;
import com.example.xuan.designmode.strategy.operator.QuackBehavior;

/**
 * Author : xuan.
 * Data : 2017/7/28.
 * Description :input the description of this file.
 */

public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public abstract void display();

    public abstract void swim();

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }
}
