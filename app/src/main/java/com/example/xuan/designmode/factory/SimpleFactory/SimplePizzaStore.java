package com.example.xuan.designmode.factory.SimpleFactory;

/**
 * Author : xuan.
 * Data : 2017/8/14.
 * Description :简单工厂
 */

public class SimplePizzaStore {
    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
