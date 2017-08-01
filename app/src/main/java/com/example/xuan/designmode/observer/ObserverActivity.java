package com.example.xuan.designmode.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.xuan.designmode.R;
import com.example.xuan.designmode.observer.observable.IObserable;
import com.example.xuan.designmode.observer.observable.Observable;
import com.example.xuan.designmode.observer.observable.ObservableJava;
import com.example.xuan.designmode.observer.observer.IObserver;
import com.example.xuan.designmode.observer.observer.ObserverA;
import com.example.xuan.designmode.observer.observer.ObserverB;
import com.example.xuan.designmode.observer.observer.ObserverJavaA;
import com.example.xuan.designmode.observer.observer.ObserverJavaB;

import java.util.Observer;

public class ObserverActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        //push by self
        IObserable obserable = new Observable();
        IObserver observerB = new ObserverB(obserable);
        IObserver observerA = new ObserverA(obserable);
        obserable.setChanged();
        obserable.notifyObservers("this is done by self design observer,B is the first one ,A is the last one");
        //pull by java
        ObservableJava observableJava = new ObservableJava();
        Observer observerJavaB = new ObserverJavaB(observableJava);
        Observer observerJavaA = new ObserverJavaA(observableJava);
        observableJava.notifyAllObserver("this is done by java observer,i wang B is " +
                "the first ,A is the Last");

    }
}
