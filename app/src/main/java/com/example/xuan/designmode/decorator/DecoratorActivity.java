package com.example.xuan.designmode.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xuan.designmode.R;

public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        Beverage milk = new Milk();
        Beverage milkSugar = new Sugar(milk);
        Beverage mikeIceSugar = new Ice(milkSugar);
        Log.i("TAG", mikeIceSugar.getDes() + mikeIceSugar.cost());

        Beverage tea = new Tea();
        Beverage teaSugar = new Sugar(tea);
        Beverage tea2Sugar = new Sugar(teaSugar);
        Log.i("TAG", tea2Sugar.getDes() + tea2Sugar.cost());
    }
}
