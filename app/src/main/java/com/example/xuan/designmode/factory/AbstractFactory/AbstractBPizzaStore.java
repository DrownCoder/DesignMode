package com.example.xuan.designmode.factory.AbstractFactory;

/**
 * Author : xuan.
 * Data : 2017/8/15.
 * Description :input the description of this file.
 */

public class AbstractBPizzaStore extends AbstractPizzaStore {
    PizzaIngredientFactory factory = new BIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "Ba":
                pizza = new BaPizza(factory);
                break;
            case "Bb":
                pizza = new BbPizza(factory);
                break;
        }
        return pizza;
    }
}
