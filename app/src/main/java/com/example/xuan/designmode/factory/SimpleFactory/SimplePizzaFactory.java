package com.example.xuan.designmode.factory.SimpleFactory;

/**
 * Author : xuan.
 * Data : 2017/8/14.
 * Description :input the description of this file.
 */

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "A":
                pizza = new PizzaA(type);
                break;
            case "B":
                pizza = new PizzaB(type);
                break;
            case "C":
                pizza = new PizzaC(type);
                break;
        }
        return pizza;
    }
}
