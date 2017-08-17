package com.example.xuan.designmode.factory.AbstractFactory;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public class BIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Clams createClams() {
        return new AClams();
    }

    @Override
    public Dough createDough() {
        return new BDough();
    }
}
