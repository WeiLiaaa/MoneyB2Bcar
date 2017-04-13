package com.liwei.moneyb2bcar.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.activity.Home_adv_Activity;
import com.liwei.moneyb2bcar.adapter.HomeXRAdapter;
import com.liwei.moneyb2bcar.bean.HomeBean;
import com.liwei.moneyb2bcar.common.URLString;
import com.liwei.moneyb2bcar.interfacepager.CallBackString;
import com.liwei.moneyb2bcar.interfacepager.Home_startItemListener;
import com.liwei.moneyb2bcar.utils.OKHttpUrlDemo;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/11.
 */

public class FragmentHome extends Fragment implements CallBackString {

    private View view;
    private XRecyclerView xrecycerView;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    HomeBean homeBean= (HomeBean) msg.obj;
                    datas = homeBean.getDatas();
                    //操作xrecyclerview
                    setControlXRecyclerView();
                    break;
            }
        }
    };
    private List<HomeBean.DatasBean> datas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenthome, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //初始化数据
        initData();
        //初始化
        initView();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        String url= URLString.HOME;
        OKHttpUrlDemo.getStr(url,this);
    }

    /**
     * 初始化控件
     */
    private void initView() {
        //xrecylerView控件
        xrecycerView = (XRecyclerView) view.findViewById(R.id.home_xrecyclerView);
    }
    /**
     * 操作xrecyclerview
     */
    private void setControlXRecyclerView() {
        HomeXRAdapter adapter=new HomeXRAdapter(getActivity(),datas);
        //设置recyclerview的模式
        xrecycerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        xrecycerView.setAdapter(adapter);
        adapter.setOnItemListener(new Home_startItemListener() {
            //广告栏的点击事件
            @Override
            public void setItem_ADVstartListener(int position) {
                Intent intent=new Intent(getActivity(), Home_adv_Activity.class);
                startActivity(intent);
            }
        });
        //设置上拉加载   下拉刷新
        xrecycerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                //下拉刷新完成
                xrecycerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                //加载更多完成
                xrecycerView.loadMoreComplete();
            }
        });
    }
    /**
     * 返回data数据
     * @param str
     */
    @Override
    public void getResponse(String str) {
        //gson解析
        Gson gson=new Gson();
        HomeBean homeBean = gson.fromJson(str, HomeBean.class);
        //创建message对象
        Message msg=Message.obtain();

        msg.what=1;
        msg.obj=homeBean;
        //handler发送消息
        handler.sendMessage(msg);
    }
}
