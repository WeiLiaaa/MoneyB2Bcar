package com.liwei.moneyb2bcar.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.fragment.mainactivity.Login_DengLu;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * 个人中心页面
 */

public class FragmentMain extends Fragment implements View.OnClickListener {

    private View view;
    //设置
    private ImageView m_setting;
    //登录
    private ImageView m_login;
    //注册
    private ImageView m_register_zhuce;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentmain, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        //声明个人  设置控件
        m_setting = (ImageView) view.findViewById(R.id.m_setting);
        //登录
        m_login = (ImageView) view.findViewById(R.id.m_register);
        //注册
        m_register_zhuce = (ImageView) view.findViewById(R.id.m_register_zhuce);
        //登录   注册  的点击事件
        m_login.setOnClickListener(this);
        m_register_zhuce.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //登录
            case R.id.m_register:
                Intent intent=new Intent(getActivity(), Login_DengLu.class);
                //跳转到登录界面
                startActivity(intent);
                break;
            case R.id.m_register_zhuce:
                break;
        }
    }
}
