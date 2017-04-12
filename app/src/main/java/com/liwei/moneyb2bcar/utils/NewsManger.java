package com.liwei.moneyb2bcar.utils;

import android.content.Context;

import com.liwei.moneyb2bcar.interfacepager.CallBackString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by wu  suo  wei on 2017/4/11.
 * 缓存数据同时判断网络
 */

public class NewsManger {
    public static void getNews(final Context context, final String url, final CallBackString requestCallBack) {

        //做判断--是否有网
        boolean networkConnected = HttpNetwork.isNetworkConnected(context);
        //没有网络---去缓存中获取信息
        if (!networkConnected) {
            //缓存怎么处理---
            File cacheDir = context.getCacheDir();
            //拼接成对应的文件名称
            File targetFile = null;
            try {
                targetFile = new File(cacheDir, MD5Encoder.encode(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader=null;
            try {
                bufferedReader=new BufferedReader(new FileReader(targetFile));
                StringBuilder stringBuilder=new StringBuilder();
                String line=null;
                while((line=bufferedReader.readLine())!=null){
                    //读到信息
                    stringBuilder.append(line);
                }
                //获取到了缓存的文件内容--回调
                requestCallBack.getResponse(stringBuilder.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        } else {
            //获取缓存的文件信息--

            //去网路获取信息 http://www.baidu.com  MD5--sjsjsdbfakefhawkenfddd
            OKHttpUrlDemo.getStr(url,new CallBackString() {
                @Override
                public void getResponse(String str) {
                    //存到文件中---文件名（根据url定义  文件信息 文件内容）
                    File cacheDir = context.getCacheDir();
                    //拼接成对应的文件名称
                    File targetFile = null;
                    try {
                        targetFile = new File(cacheDir, MD5Encoder.encode(url));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //往文件中存储信息
                    BufferedWriter bufferedWriter = null;
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
                        bufferedWriter.write(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    //从网络上读取
                    requestCallBack.getResponse(str);
                }

            });
        }
    }
}
