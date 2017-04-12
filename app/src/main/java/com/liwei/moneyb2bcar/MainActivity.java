package com.liwei.moneyb2bcar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.liwei.moneyb2bcar.fragment.FragmentCart;
import com.liwei.moneyb2bcar.fragment.FragmentClasst;
import com.liwei.moneyb2bcar.fragment.FragmentHome;
import com.liwei.moneyb2bcar.fragment.FragmentMain;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * 定义框架
 * 实现底部导航栏的4个按钮
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //定义一个long类型的数据
    private long clickTime = 0;
    private Fragment fragment;
    private FrameLayout main_fragment;
    private LinearLayout main_home;
    private ImageView main_home_image;
    private TextView main_home_tv;
    private LinearLayout main_class;
    private ImageView main_class_image;
    private TextView main_class_tv;
    private LinearLayout main_cart;
    private ImageView main_cart_image;
    private TextView main_cart_tv;
    private LinearLayout main_main;
    private ImageView main_main_image;
    private TextView main_main_tv;
    private FragmentHome home;
    private FragmentMain main;
    private FragmentClasst fclass;
    private FragmentCart cart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        initView();
    }

    private void initView() {
        //FrameLayout控件
        main_fragment = (FrameLayout) findViewById(R.id.main_fragment);
        //首页控件
        main_home = (LinearLayout) findViewById(R.id.main_home);
        main_home_image = (ImageView) findViewById(R.id.main_home_image);
        main_home_tv = (TextView) findViewById(R.id.main_home_tv);
        //分类控件
        main_class = (LinearLayout) findViewById(R.id.main_class);
        main_class_image = (ImageView) findViewById(R.id.main_class_image);
        main_class_tv = (TextView) findViewById(R.id.main_class_tv);
        //购物车控件
        main_cart = (LinearLayout) findViewById(R.id.main_cart);
        main_cart_image = (ImageView) findViewById(R.id.main_cart_image);
        main_cart_tv = (TextView) findViewById(R.id.main_cart_tv);
        //我的控件
        main_main = (LinearLayout) findViewById(R.id.main_main);
        main_main_image = (ImageView) findViewById(R.id.main_main_image);
        main_main_tv = (TextView) findViewById(R.id.main_main_tv);
        //默认显示首页
        if (home == null) {
            home = new FragmentHome();
        }
        showFragment(home);
        //按钮的点击事件
        main_home.setOnClickListener(this);
        main_class.setOnClickListener(this);
        main_cart.setOnClickListener(this);
        main_main.setOnClickListener(this);

    }

    //操作点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //点击首页
            case R.id.main_home:
                if (home == null) {
                    home = new FragmentHome();
                }
                showFragment(home);
                //修改图片和textView的颜色
                main_home_image.setImageResource(R.mipmap.main_index_my_home_p);
                main_home_tv.setTextColor(Color.parseColor("#00ffff"));

                main_class_image.setImageResource(R.mipmap.main_index_my_class_n);
                main_class_tv.setTextColor(Color.parseColor("#000000"));

                main_cart_image.setImageResource(R.mipmap.main_index_my_cart_n);
                main_cart_tv.setTextColor(Color.parseColor("#000000"));

                main_main_image.setImageResource(R.mipmap.main_index_my_mine_n);
                main_main_tv.setTextColor(Color.parseColor("#000000"));
                break;
            //点击分类
            case R.id.main_class:
                if (fclass == null) {
                    fclass = new FragmentClasst();
                }
                showFragment(fclass);
                //修改图片和textView的颜色
                main_home_image.setImageResource(R.mipmap.main_index_my_home_n);
                main_home_tv.setTextColor(Color.parseColor("#000000"));

                main_class_image.setImageResource(R.mipmap.main_index_my_class_p);
                main_class_tv.setTextColor(Color.parseColor("#00ffff"));

                main_cart_image.setImageResource(R.mipmap.main_index_my_cart_n);
                main_cart_tv.setTextColor(Color.parseColor("#000000"));

                main_main_image.setImageResource(R.mipmap.main_index_my_mine_n);
                main_main_tv.setTextColor(Color.parseColor("#000000"));
                break;

            //点击购物车      实现的是一个跳转到购物车啊activity界面
            case R.id.main_cart:
                if (cart == null) {
                    cart = new FragmentCart();
                }
                showFragment(cart);
                main_home_image.setImageResource(R.mipmap.main_index_my_home_n);
                main_home_tv.setTextColor(Color.parseColor("#000000"));

                main_class_image.setImageResource(R.mipmap.main_index_my_class_n);
                main_class_tv.setTextColor(Color.parseColor("#000000"));

                main_cart_image.setImageResource(R.mipmap.main_index_my_cart_p);
                main_cart_tv.setTextColor(Color.parseColor("#00ffff"));

                main_main_image.setImageResource(R.mipmap.main_index_my_mine_n);
                main_main_tv.setTextColor(Color.parseColor("#000000"));
                break;
            //点击个人中心
            case R.id.main_main:
                if (main == null) {
                    main = new FragmentMain();
                }
                showFragment(main);
                //修改图片和textView的颜色
                main_home_image.setImageResource(R.mipmap.main_index_my_home_n);
                main_home_tv.setTextColor(Color.parseColor("#000000"));

                main_class_image.setImageResource(R.mipmap.main_index_my_class_n);
                main_class_tv.setTextColor(Color.parseColor("#000000"));

                main_cart_image.setImageResource(R.mipmap.main_index_my_cart_n);
                main_cart_tv.setTextColor(Color.parseColor("#000000"));

                main_main_image.setImageResource(R.mipmap.main_index_my_mine_p);
                main_main_tv.setTextColor(Color.parseColor("#00ffff"));
                break;
        }
    }

    /**
     *  使用Fragment 的hide和show展示4个fragment方法
     */
    public void showFragment(Fragment f) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (fragment != null) {
            transaction.hide(fragment);
        }
        if (!f.isAdded()) {
            transaction.add(R.id.main_fragment, f);
        }

        transaction.show(f);
        transaction.commit();
        fragment = f;
    }

    //监听返回键
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     *  再按一次后退键退出程序
     */
    private void exit() {
        if ((System.currentTimeMillis() - clickTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次后退键退出程序",
                    Toast.LENGTH_SHORT).show();
            clickTime = System.currentTimeMillis();
        } else {
            this.finish();
            //     System.exit(0);
        }
    }
}
