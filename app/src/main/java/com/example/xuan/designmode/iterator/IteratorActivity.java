package com.example.xuan.designmode.iterator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.xuan.designmode.R;

public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        Menu dinner = new DinnerMenu();
        Menu pancake = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinner, pancake);
        waitress.printMenu();
    }
}
