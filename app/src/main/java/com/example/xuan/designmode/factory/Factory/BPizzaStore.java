package com.example.xuan.designmode.factory.Factory;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public class BPizzaStore extends FactoryPizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "Ba":
                pizza = new BaPizza();
                break;
            case "Bb":
                pizza = new BbPizza();
                break;
        }
        return pizza;
    }
}
