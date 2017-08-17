package com.example.xuan.designmode.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xuan.designmode.R;
import com.example.xuan.designmode.factory.AbstractFactory.AbstractAPizzaStore;
import com.example.xuan.designmode.factory.AbstractFactory.AbstractBPizzaStore;
import com.example.xuan.designmode.factory.AbstractFactory.AbstractPizzaStore;
import com.example.xuan.designmode.factory.Factory.APizzaStore;
import com.example.xuan.designmode.factory.Factory.BPizzaStore;
import com.example.xuan.designmode.factory.Factory.FactoryPizzaStore;
import com.example.xuan.designmode.factory.SimpleFactory.SimplePizzaStore;
import com.example.xuan.designmode.factory.SimpleFactory.SimplePizzaFactory;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        Log.i("TAG", "---------------------SimpleFactory--------------------------");
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(simplePizzaFactory);
        simplePizzaStore.orderPizza("A");
        Log.i("TAG", "---------------------Factory------------------------");
        FactoryPizzaStore factoryPizzaStore = new APizzaStore();
        factoryPizzaStore.orderPizza("Aa");
        factoryPizzaStore.orderPizza("Ab");
        factoryPizzaStore = new BPizzaStore();
        factoryPizzaStore.orderPizza("Ba");
        factoryPizzaStore.orderPizza("Bb");
        Log.i("TAG", "---------------------AbstractFactory--------------------");
        AbstractPizzaStore abstractPizzaStore = new AbstractAPizzaStore();
        abstractPizzaStore.orderPizza("Aa");
        abstractPizzaStore.orderPizza("Ab");
        abstractPizzaStore = new AbstractBPizzaStore();
        abstractPizzaStore.orderPizza("Ba");
        abstractPizzaStore.orderPizza("Bb");
    }
}
