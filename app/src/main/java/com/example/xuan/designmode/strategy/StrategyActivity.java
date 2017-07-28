package com.example.xuan.designmode.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.xuan.designmode.R;
import com.example.xuan.designmode.strategy.bean.Duck;
import com.example.xuan.designmode.strategy.bean.SmallDuck;
import com.example.xuan.designmode.strategy.bean.TopDuck;
import com.example.xuan.designmode.strategy.operator.BigQuack;
import com.example.xuan.designmode.strategy.operator.FlyBehavior;
import com.example.xuan.designmode.strategy.operator.PlaneFly;
import com.example.xuan.designmode.strategy.operator.QuackBehavior;
import com.example.xuan.designmode.strategy.operator.RocketFly;
import com.example.xuan.designmode.strategy.operator.SmallQuack;

public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TopDuck topDuck = new TopDuck();
        test(topDuck,new RocketFly(),new BigQuack());

        SmallDuck smallDuck = new SmallDuck();
        test(smallDuck,new PlaneFly(),new SmallQuack());
    }

    private void test(Duck duck, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        duck.display();
        duck.swim();
        duck.setmFlyBehavior(flyBehavior);
        duck.setmQuackBehavior(quackBehavior);
        duck.performFly();
        duck.performQuack();
    }
}
