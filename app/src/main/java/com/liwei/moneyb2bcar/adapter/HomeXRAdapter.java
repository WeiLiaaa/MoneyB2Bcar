package com.liwei.moneyb2bcar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.bean.HomeBean;
import com.liwei.moneyb2bcar.viewholder.GlideImageLoader;
import com.liwei.moneyb2bcar.viewholder.Home1ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home2ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home3ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/11.
 */

public class HomeXRAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
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
    private int type;
    private Home2ViewHolder holder2;
    private Home3ViewHolder holder3;

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
                holder = new Home2ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home2viewholder, parent, false));
                break;
            case 2:
                holder = new Home3ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home3viewholder, parent, false));
                break;
            /*case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;*/
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)) {
            case 0:
                //第一个类型
                holder1 = (Home1ViewHolder) holder;
                //广告栏图片轮播
                setHome1ViewHolder();
                break;
            case 1:
                holder2 = (Home2ViewHolder) holder;
                //轮播图下方的5个按钮
                setHome2ViewHolder();
                break;
            case 2:
                holder3 = (Home3ViewHolder) holder;
                //新品推荐
                setHome3ViewHolder();

                break;
        }
    }

    /**
     * 新品推荐
     */
    private void setHome3ViewHolder() {
        holder3.title.setText(datas.get(1).getHome1().getTitle());
        Glide.with(context).load(datas.get(1).getHome1().getImage()).
                placeholder(R.mipmap.yaopin).into(holder3.image);
    }

    /**
     * 轮播图下方的5个按钮
     */
    private void setHome2ViewHolder() {

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
                type = TPYE1;
                break;
            case 1:
                type = TPYE2;
                break;
            case 2:
                type=TPYE3;
                break;
            /*case 3:
                type=TPYE4;
                break;
            case 4:
                type=TPYE5;
                break;
            case 5:
                type=TPYE6;
                break;
            case 6:
                type=TPYE7;
                break;*/
        }
        return type;
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}
