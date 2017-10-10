package com.example.xuan.designmode.state;

import android.app.Activity;
import android.os.Bundle;

import com.example.xuan.designmode.R;

/**
 * Author : xuan.
 * Date : 2017/10/10.
 * Description :input the description of this file.
 */

public class StateActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        GumballMachine machine = new GumballMachine(2);
        for(int i= 0;i<3;i++) {
            machine.insertQuarter();
            machine.turnCrank();
        }
    }
}
