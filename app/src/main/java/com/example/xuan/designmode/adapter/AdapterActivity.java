package com.example.xuan.designmode.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xuan.designmode.R;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        IDuck duck = new Duck();
        duck.quack();
        duck.fly();

        ITurkey turkey = new Turkey();
        turkey.gobble();
        turkey.fly();

        IDuck adapter = new Adapter(turkey);
        adapter.quack();
        adapter.fly();
    }
}
