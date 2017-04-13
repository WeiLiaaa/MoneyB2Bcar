package com.liwei.moneyb2bcar.viewholder.homeadvadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.bean.ADVBeanOne;
import com.liwei.moneyb2bcar.interfacepager.MyRecyclerViewItemLongClickListener;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */

public class HomeADVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private final List<ADVBeanOne.DatasBean.GoodsBean.ItemBean> item;
    private MyRecyclerViewItemLongClickListener listener;

    public HomeADVAdapter(Context context, List<ADVBeanOne.DatasBean.GoodsBean.ItemBean> item) {
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
        return new Home7AdapterViewHolder(LayoutInflater.from(context).
                inflate(R.layout.home7viewholder_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Home7AdapterViewHolder holder1 = (Home7AdapterViewHolder) holder;
        holder1.title.setText(item.get(position).getProduct_company());
        holder1.name.setText(item.get(position).getGoods_name());
        holder1.count.setText(item.get(position).getDrug_spec());
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
    class Home7AdapterViewHolder extends RecyclerView.ViewHolder{
        //公司名称
        public final TextView title;
        //图片
        public final ImageView image;
        //药品名称
        public final TextView name;
        //药品价格
        public final TextView price;
        //药品数量
        public final TextView count;

        public Home7AdapterViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.home7_item_title);
            image = (ImageView) itemView.findViewById(R.id.home7_item_image);
            name = (TextView) itemView.findViewById(R.id.home7_item_name);
            count = (TextView) itemView.findViewById(R.id.home7_item_count);
            price = (TextView) itemView.findViewById(R.id.home7_item_price);
        }
    }
}
