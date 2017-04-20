package com.liwei.moneyb2bcar.utils;

import com.liwei.moneyb2bcar.interfacepager.CallBackString;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * okhttp网络请求数据
 * 简单封装
 */

public class OKHttpUrlDemo {
    //创建okHttpClient对象
    static OkHttpClient mOkHttpClient = new OkHttpClient();
    private static String key;
    private static String value;

    //okhttp的get请求
    public static void getStr( String url, final CallBackString callBackString){

        //创建一个Request
        final Request request = new Request.Builder()
                .url(url)
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
    //okhttp的get请求
    public static void postStr(String url, Map<String, String> map,final CallBackString callBackString){
        for(Map.Entry<String,String> entry:map.entrySet()){
            key = entry.getKey();
            value = entry.getValue();
        }
        FormBody formBody=new FormBody.Builder()
                .add(key,value)
                .build();
        Request request=new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        Call call=mOkHttpClient.newCall(request);
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
