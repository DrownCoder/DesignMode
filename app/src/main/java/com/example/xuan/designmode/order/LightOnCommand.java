package com.example.xuan.designmode.order;

/**
 * Author : xuan.
 * Data : 2017/8/17.
 * Description :input the description of this file.
 */

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
