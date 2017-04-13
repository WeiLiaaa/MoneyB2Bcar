package com.liwei.moneyb2bcar.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/13.
 */

public class Home_adv_Activity extends AppCompatActivity {

    private XRecyclerView recyclerview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_adv_activity);
        //初始化控件
        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        recyclerview = (XRecyclerView) findViewById(R.id.home_adv_recyclerview);
    }
}
