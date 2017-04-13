package com.liwei.moneyb2bcar.viewholder.home4adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.bean.HomeBean;
import com.liwei.moneyb2bcar.interfacepager.MyRecyclerViewItemLongClickListener;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */

public class Home4Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private final List<HomeBean.DatasBean.Home7Bean.ItemBeanX> item;
    private MyRecyclerViewItemLongClickListener listener;
    public Home4Adapter(Context context, List<HomeBean.DatasBean.Home7Bean.ItemBeanX> item) {
        this.context=context;
        this.item=item;
    }
    /**
     * 设置Item点击监听
     * @param listener
     */
    public void setOnItemClickListener(MyRecyclerViewItemLongClickListener listener){
        this.listener = listener;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Home4AdapterViewHolder(LayoutInflater.from(context).
                inflate(R.layout.home4viewholder_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Home4AdapterViewHolder holder1 = (Home4AdapterViewHolder) holder;
        holder1.name.setText(item.get(position).getGoods_name());
        holder1.price.setText("￥"+item.get(position).getGoods_price());
        Glide.with(context).load(item.get(position).getGoods_image()).
                placeholder(R.mipmap.yaopin).into(holder1.image);
        holder1.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener!=null){
                    listener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
    class Home4AdapterViewHolder extends RecyclerView.ViewHolder{

        public final ImageView image;
        public final TextView name;
        public final TextView price;

        public Home4AdapterViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.home4_item_image);
            name = (TextView) itemView.findViewById(R.id.home4_item_name);
            price = (TextView) itemView.findViewById(R.id.home4_item_price);
        }
    }
}
