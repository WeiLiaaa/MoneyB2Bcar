package com.liwei.moneyb2bcar.fragment.mainactivity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.fragment.mainactivity.loginfragment.FragmentDenglu;
import com.liwei.moneyb2bcar.fragment.mainactivity.loginfragment.FragmentPhone;

/**
 * Created by wu  suo  wei on 2017/4/17.
 */

public class Login_DengLu extends AppCompatActivity implements View.OnClickListener {

    private TextView m_login_de;
    private TextView m_login_phone;
    private ViewPager vp;
    private ImageView image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_denglu);
        initView();
    }

    private void initView() {
        //退出
        image = (ImageView) findViewById(R.id.m_login_image);
        //登录
        m_login_de = (TextView) findViewById(R.id.m_login_de);
        //手机登录
        m_login_phone = (TextView) findViewById(R.id.m_login_phone);
        //viewpager
        vp = (ViewPager) findViewById(R.id.m_login_vp);
        //设置adapter
        vp.setAdapter(new LoginFragment(getSupportFragmentManager()));
        //设置退出的点击事件
        image.setOnClickListener(this);
        m_login_de.setOnClickListener(this);
        m_login_phone.setOnClickListener(this);
        //默认
        vp.setCurrentItem(0);
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position){
                    case 0:
                        m_login_de.setTextColor(Color.parseColor("#ffffff"));
                        m_login_phone.setTextColor(Color.BLACK);
                        break;
                    case 1:
                        m_login_de.setTextColor(Color.BLACK);
                        m_login_phone.setTextColor(Color.parseColor("#ffffff"));
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.m_login_image:
                finish();
                break;
            //账号登录
            case R.id.m_login_de:
                vp.setCurrentItem(0);

                break;
            //手机登录
            case R.id.m_login_phone:
                vp.setCurrentItem(1);

                break;

        }
    }

    class LoginFragment extends FragmentPagerAdapter{

        public LoginFragment(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment=null;
            switch (position){
                case 0:
                    fragment=new FragmentDenglu();
                    break;
                case 1:
                    fragment=new FragmentPhone();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
