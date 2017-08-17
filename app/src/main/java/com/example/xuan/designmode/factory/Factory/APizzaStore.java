package com.example.xuan.designmode.factory.Factory;


/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public class APizzaStore extends FactoryPizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "Aa":
                pizza = new AaPizza();
                break;
            case "Ab":
                pizza = new AbPizza();
                break;
        }
        return pizza;
    }
}
