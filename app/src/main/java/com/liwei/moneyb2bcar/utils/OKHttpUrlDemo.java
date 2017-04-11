package com.liwei.moneyb2bcar.utils;

import com.liwei.moneyb2bcar.interfacepager.CallBackString;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wu  suo  wei on 2017/4/11.
 */

public class OKHttpUrlDemo {
    public static void getStr(String url, final CallBackString callBackString){
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder()
                .url("https://github.com/hongyangAndroid")
                .build();
        //new call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                //返回的数据
                callBackString.getResponse(string);
            }
        });
    }
}
