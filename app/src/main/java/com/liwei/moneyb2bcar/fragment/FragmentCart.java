package com.liwei.moneyb2bcar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * 购物车页面
 */

public class FragmentCart extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentcart, container, false);
        return view;
    }
}
