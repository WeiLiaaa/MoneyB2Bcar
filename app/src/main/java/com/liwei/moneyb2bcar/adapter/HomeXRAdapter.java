package com.liwei.moneyb2bcar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.bean.HomeBean;
import com.liwei.moneyb2bcar.viewholder.GlideImageLoader;
import com.liwei.moneyb2bcar.viewholder.Home1ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/11.
 */

public class HomeXRAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private List<HomeBean.DatasBean> datas;
    private final int TPYE1 = 0;
    private final int TPYE2 = 1;
    private final int TPYE3 = 2;
    private final int TPYE4 = 3;
    private final int TPYE5 = 4;
    private final int TPYE6 = 5;
    private final int TPYE7 = 6;
    private Home1ViewHolder holder1;
    private ArrayList<String> images;

    public HomeXRAdapter(Context context, List<HomeBean.DatasBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case 0:
                holder = new Home1ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home1viewholder, parent, false));
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //第一个类型
        holder1 = (Home1ViewHolder) holder;
        switch (getItemViewType(position)) {
            case 0:
                setHome1ViewHolder();
                break;
        }
    }

    /**
     * 广告栏图片轮播
     */
    private void setHome1ViewHolder() {
        images = new ArrayList<>();
        //创建轮播图片集合
        List<HomeBean.DatasBean.AdvListBean.ItemBean> item = datas.get(0).getAdv_list().getItem();
        for (int i = 0; i < item.size(); i++) {
            images.add(item.get(i).getImage());
        }
        //设置图片加载器
        holder1.banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        holder1.banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        holder1.banner.start();
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TPYE1;
            /*case 1:
                return TPYE2;
            case 2:
                return TPYE3;
            case 3:
                return TPYE4;
            case 4:
                return TPYE5;
            case 5:
                return TPYE6;
            case 6:
                return TPYE7;*/
        }
        return Integer.parseInt(null);
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
