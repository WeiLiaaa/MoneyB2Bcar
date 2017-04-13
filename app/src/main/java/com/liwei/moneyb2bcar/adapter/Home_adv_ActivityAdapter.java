package com.liwei.moneyb2bcar.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.bean.ADCBean;
import com.liwei.moneyb2bcar.interfacepager.Home_startItemListener;
import com.liwei.moneyb2bcar.interfacepager.MyRecyclerViewItemLongClickListener;
import com.liwei.moneyb2bcar.viewholder.HomeADVAdapterViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home_adv_ActivityAdapterViewHolder;
import com.liwei.moneyb2bcar.viewholder.homeadvadapter.HomeADVAdapter2;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/13.
 */

public class Home_adv_ActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private final List<ADCBean.DatasBean> datas;
    private int type;
    private final int TYPE1=0;
    private final int TYPE2=1;
    private HomeADVAdapterViewHolder holder2;
    private Home_startItemListener home_startItemListener;

    public Home_adv_ActivityAdapter(Context context, List<ADCBean.DatasBean> datas) {
        this.context=context;
        this.datas=datas;
    }
    /**
     * xrecyclerview的点击事件
     * @param home_startItemListener
     */
    public void setOnItemListener(Home_startItemListener home_startItemListener){
        this.home_startItemListener=home_startItemListener;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder=null;
        switch (viewType){
            case 0:
                holder=new Home_adv_ActivityAdapterViewHolder(LayoutInflater.
                        from(context).inflate(R.layout.home_adv_activityadapterviewholder,
                        parent,false));
                break;
            case 1:
                holder=new HomeADVAdapterViewHolder(LayoutInflater.
                        from(context).inflate(R.layout.homeadvadapterviewholder,
                        parent,false));
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case 0:
                Home_adv_ActivityAdapterViewHolder holder1 = (Home_adv_ActivityAdapterViewHolder) holder;
                Glide.with(context).load(datas.get(0).getHome1().getImage()).
                        placeholder(R.mipmap.yaopin).into(holder1.image);
                break;
            case 1:
                holder2 = (HomeADVAdapterViewHolder) holder;

                setHomeADVAdapterViewHolder();
                break;
        }
    }

    private void setHomeADVAdapterViewHolder() {
        //数据
        List<ADCBean.DatasBean.GoodsBean.ItemBean> item = datas.get(1).getGoods().getItem();
        HomeADVAdapter2 adapter=new HomeADVAdapter2(context,item);
        //设置recyclerview模式
        holder2.recyclerview.setLayoutManager(new GridLayoutManager(context,2));
        //设置adapter
        holder2.recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        //adapter的点击事件
        adapter.setOnItemClickListener(new MyRecyclerViewItemLongClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(context,"底部",Toast.LENGTH_SHORT).show();
                if (home_startItemListener!=null){
                    home_startItemListener.setItem_ADVstartListener(position);
                }
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        switch (position){
            case 0:
                type=TYPE1;
                break;
            case 1:
                type=TYPE2;
                break;
        }
        return type;
    }
    @Override
    public int getItemCount() {
        return 2;
    }
}
