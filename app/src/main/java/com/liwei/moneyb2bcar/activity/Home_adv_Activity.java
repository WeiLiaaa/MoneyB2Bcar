package com.liwei.moneyb2bcar.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.adapter.Home_advOne_ActivityAdapter;
import com.liwei.moneyb2bcar.adapter.Home_adv_ActivityAdapter;
import com.liwei.moneyb2bcar.bean.ADCBean;
import com.liwei.moneyb2bcar.bean.ADVBeanOne;
import com.liwei.moneyb2bcar.common.URLString;
import com.liwei.moneyb2bcar.interfacepager.CallBackString;
import com.liwei.moneyb2bcar.utils.OKHttpUrlDemo;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/13.
 */

public class Home_adv_Activity extends AppCompatActivity implements CallBackString {

    private XRecyclerView recyclerview;
    private String[] index={"33","36","32","34"};
    //广告栏的下标
    private int position;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    dataOne = (List<ADVBeanOne.DatasBean>) msg.obj;
                    setHomeADVoneAdapterData();
                    break;
                case 2:
                    datas = (List<ADCBean.DatasBean>) msg.obj;
                    setHomeAdapterData();
                    break;
            }
        }
    };
    /**
     * 设置下标不为0的adapter
     */
    private void setHomeAdapterData() {
        Home_adv_ActivityAdapter  adapter=new Home_adv_ActivityAdapter(this,datas);
        //设置模式
        recyclerview.setLayoutManager(new LinearLayoutManager
                (Home_adv_Activity.this,LinearLayoutManager.VERTICAL,false));
        //设置adapter
        recyclerview.setAdapter(adapter);
        //刷新数据
        adapter.notifyDataSetChanged();
    }

    /**
     * 设置下标位0的adapter
     */
    private void setHomeADVoneAdapterData() {
        Home_advOne_ActivityAdapter adapter=new Home_advOne_ActivityAdapter(this,dataOne);
        //设置模式
        recyclerview.setLayoutManager(new LinearLayoutManager
                (Home_adv_Activity.this,LinearLayoutManager.VERTICAL,false));
        //设置adapter
        recyclerview.setAdapter(adapter);
        //刷新数据
        adapter.notifyDataSetChanged();
    }

    private List<ADVBeanOne.DatasBean> dataOne;
    private List<ADCBean.DatasBean> datas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_adv_activity);
        //初始化数据
        initData();
        //初始化控件
        initView();
    }

    private void initData() {
        //得到广告栏传递的数据
        Intent intent = getIntent();
        position = intent.getIntExtra("position", 0);
        String url= URLString.HOME_ADV+index[position];
        OKHttpUrlDemo.getStr(url,this);
    }

    /**
     * 初始化控件
     */
    private void initView() {
        recyclerview = (XRecyclerView) findViewById(R.id.home_adv_recyclerview);
        //设置上拉加载   下拉刷新
        recyclerview.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                //下拉刷新完成
                recyclerview.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                //加载更多完成
                recyclerview.loadMoreComplete();
            }
        });
    }

    /**
     * 接口回调回来的数据
     */
    @Override
    public void getResponse(String str) {
        Gson gson=new Gson();
        //判断如果传递的数据等于0是加载ADCBenaOne   否则加载ADCBena
        if (position==0){
            ADVBeanOne advBeanOne = gson.fromJson(str, ADVBeanOne.class);
            List<ADVBeanOne.DatasBean> datas = advBeanOne.getDatas();
            Message msg=Message.obtain();
            msg.what=1;
            msg.obj=datas;
            handler.sendMessage(msg);
        }else{
            ADCBean advBeanOne = gson.fromJson(str, ADCBean.class);
            List<ADCBean.DatasBean> datas = advBeanOne.getDatas();
            Message msg=Message.obtain();
            msg.what=2;
            msg.obj=datas;
            handler.sendMessage(msg);
        }

    }
}
