package com.example.xuan.designmode.composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author : xuan.
 * Data : 2017/9/25.
 * Description :input the description of this file.
 */

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> list = new ArrayList<>();
    String name;
    String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return list.get(i);
    }

    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        Log.i("MENU", "name：" + getName());
        Log.i("MENU", "desc：" + getDesc());
        Log.i("MENU", "==========================================");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }
    }
}
