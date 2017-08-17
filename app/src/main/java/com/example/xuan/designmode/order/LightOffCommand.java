package com.example.xuan.designmode.order;

/**
 * Author : xuan.
 * Data : 2017/8/17.
 * Description :input the description of this file.
 */

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
