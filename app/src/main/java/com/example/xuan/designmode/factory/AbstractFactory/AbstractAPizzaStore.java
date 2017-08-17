package com.example.xuan.designmode.factory.AbstractFactory;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public class AbstractAPizzaStore extends AbstractPizzaStore {
    PizzaIngredientFactory factory = new AIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "Aa":
                pizza = new AaPizza(factory);
                break;
            case "Ab":
                pizza = new AbPizza(factory);
                break;
        }
        return pizza;
    }
}
