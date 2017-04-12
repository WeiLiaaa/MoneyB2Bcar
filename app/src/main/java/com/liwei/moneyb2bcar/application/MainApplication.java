package com.liwei.moneyb2bcar.application;

import android.app.Application;

import com.liwei.moneyb2bcar.common.LogUtils;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * application类用来初始化数据
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化imageLoder
        ImageLoaderConfiguration conf=new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(conf);
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device tken
                LogUtils.d(deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {

            }
        });
    }
}
