package com.example.xuan.designmode.factory.AbstractFactory;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public class BaPizza extends Pizza {
    PizzaIngredientFactory factory;
    public BaPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        clams = factory.createClams();
        dough =factory.createDough();
    }
}
