package com.example.xuan.designmode.composite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xuan.designmode.R;

public class CompositeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);
        Menu allMenu = new Menu("TotalMenu", "this is the base Menu");
        Menu breakfastMenu = new Menu("breakfast", "this is the breakfast Menu");
        Menu lunchMenu = new Menu("lunch", "this is the lunch Menu");
        Menu dinnerMenu = new Menu("dinner", "this is the dinner Menu");
        allMenu.add(breakfastMenu);
        allMenu.add(lunchMenu);
        allMenu.add(dinnerMenu);

        String name = "name";
        double price = 1.5;
        String desc = "desc";
        boolean isVe = false;
        for(int i = 0;i<4;i++) {
            name += i;
            price += i;
            desc += i;
            isVe = (i % 2 == 0);
            MenuItem menuItem = new MenuItem(name, desc, isVe, price);
            dinnerMenu.add(menuItem);
        }

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();

    }
}
