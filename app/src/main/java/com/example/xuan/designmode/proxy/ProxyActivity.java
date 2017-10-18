package com.example.xuan.designmode.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xuan.designmode.R;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        RealOperate operate = new RealOperate();

        Log.i("Proxy", "==================静态代理=====================");
        Operate stateProxyOperate = new StateProxyOperate(operate);
        stateProxyOperate.request();
        Log.i("Proxy", "==================动态代理方式一=====================");
        ProxyHandler handler = new ProxyHandler(operate);
        Operate proxyOperate1 = (Operate) Proxy.newProxyInstance(RealOperate.class.getClassLoader(),
                RealOperate.class.getInterfaces(), handler);
        proxyOperate1.request();
        Log.i("Proxy", "==================动态代理方式二=====================");
        Class proxyClass = Proxy.getProxyClass(RealOperate.class.getClassLoader(), RealOperate
                .class.getInterfaces());
        try {
            Constructor constructor = proxyClass.getConstructor(InvocationHandler.class);
            Operate proxyOperate2 = (Operate) constructor.newInstance(handler);
            proxyOperate2.request();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
