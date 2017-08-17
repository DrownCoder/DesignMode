package com.example.xuan.designmode.order;

/**
 * Author : xuan.
 * Data : 2017/8/17.
 * Description :input the description of this file.
 */

public class OrderControl {
    Command[] commandOn;
    Command[] commandOff;

    public OrderControl() {
        commandOn = new Command[2];
        commandOff = new Command[2];
        Command nouseComment = new NouseCommand();
        for (int i = 0; i < 2; i++) {
            commandOn[i] = nouseComment;
            commandOff[i] = nouseComment;
        }
    }

    public void setCommand(int i,Command commandOn,Command commandOff) {
        this.commandOn[i] = commandOn;
        this.commandOff[i] = commandOff;
    }

    public void onButtonOpenPressed(int i) {
        commandOn[i].execute();
    }

    public void onButtonOffPressed(int i) {
        commandOff[i].execute();
    }
}
