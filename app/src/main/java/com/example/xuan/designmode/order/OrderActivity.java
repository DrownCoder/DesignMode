package com.example.xuan.designmode.order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xuan.designmode.R;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Tv tv = new Tv();
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);

        OrderControl control = new OrderControl();
        control.setCommand(0,lightOnCommand,lightOffCommand);
        control.setCommand(1,tvOnCommand,tvOffCommand);

        control.onButtonOpenPressed(0);
        control.onButtonOpenPressed(1);
        control.onButtonOffPressed(1);
        control.onButtonOffPressed(0);

    }
}
