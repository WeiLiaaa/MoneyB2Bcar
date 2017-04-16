package com.liwei.moneyb2bcar.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.fragment.classactivity.Contraceptive;
import com.liwei.moneyb2bcar.fragment.classactivity.Health;
import com.liwei.moneyb2bcar.fragment.classactivity.MedInstrumentation;
import com.liwei.moneyb2bcar.fragment.classactivity.NonBiomedicine;
import com.liwei.moneyb2bcar.fragment.classactivity.Traditional;
import com.liwei.moneyb2bcar.fragment.classactivity.Western;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * 全部分类页面
 */

public class FragmentClasst extends Fragment implements View.OnClickListener {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentclass, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        Button en= (Button) view.findViewById(R.id.class_en);
        Button ch= (Button) view.findViewById(R.id.class_ch);
        Button baoJian= (Button) view.findViewById(R.id.class_baoJian);
        Button yiLiao= (Button) view.findViewById(R.id.class_yiLiao);
        Button jiSheng= (Button) view.findViewById(R.id.class_jiSheng);
        Button noYao= (Button) view.findViewById(R.id.class_noYao);
        //点击事件
        en.setOnClickListener(this);
        ch.setOnClickListener(this);
        baoJian.setOnClickListener(this);
        yiLiao.setOnClickListener(this);
        jiSheng.setOnClickListener(this);
        noYao.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.class_en:
                //跳转到西药界面
                Intent in1=new Intent(getActivity(), Western.class);
                startActivity(in1);
                break;
            case R.id.class_ch:
                //跳转到中药界面
                Intent in2=new Intent(getActivity(), Traditional.class);
                startActivity(in2);
                break;
            case R.id.class_baoJian:
                //跳转到中药界面
                Intent in3=new Intent(getActivity(), Health.class);
                startActivity(in3);
                break;
            case R.id.class_yiLiao:
                //跳转到中药界面
                Intent in4=new Intent(getActivity(), MedInstrumentation.class);
                startActivity(in4);
                break;
            case R.id.class_jiSheng:
                //跳转到中药界面
                Intent in5=new Intent(getActivity(), Contraceptive.class);
                startActivity(in5);
                break;
            case R.id.class_noYao:
                //跳转到非药品界面
                Intent in6=new Intent(getActivity(), NonBiomedicine.class);
                startActivity(in6);
                break;
        }
    }
}
