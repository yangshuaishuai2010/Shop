package com.stone.shop.main.ui.activity;

import android.os.Bundle;

import com.stone.shop.R;
import com.stone.shop.base.ui.BaseActivity;

/**
 * Created by stone on 15/5/6.
 */
public class SettingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initView();
    }

    private void initView() {

    }

}
