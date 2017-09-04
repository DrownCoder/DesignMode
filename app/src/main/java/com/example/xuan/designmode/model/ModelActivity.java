package com.example.xuan.designmode.model;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.xuan.designmode.R;

/**
 * Author : xuan.
 * Data : 2017/9/4.
 * Description :input the description of this file.
 */

public class ModelActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);
        BaseOperate operate1 = new AOperate();
        operate1.Operate();
        BaseOperate operate2 = new BOperate();
        operate2.Operate();
    }
}
