package com.liwei.moneyb2bcar.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.liwei.moneyb2bcar.R;
import com.liwei.moneyb2bcar.bean.HomeBean;
import com.liwei.moneyb2bcar.interfacepager.Home_startItemListener;
import com.liwei.moneyb2bcar.interfacepager.MyRecyclerViewItemLongClickListener;
import com.liwei.moneyb2bcar.viewholder.GlideImageLoader;
import com.liwei.moneyb2bcar.viewholder.Home1ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home2ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home3ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home4ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home5ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home6ViewHolder;
import com.liwei.moneyb2bcar.viewholder.Home7ViewHolder;
import com.liwei.moneyb2bcar.viewholder.home4adapter.Home4Adapter;
import com.liwei.moneyb2bcar.viewholder.home7adapter.Home7Adapter;
import com.youth.banner.listener.OnBannerListener;

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
    private Home4ViewHolder holder4;
    private Home5ViewHolder holder5;
    private Home6ViewHolder holder6;
    private Home7ViewHolder holder7;
    private Home_startItemListener home_startItemListener;

    public HomeXRAdapter(Context context, List<HomeBean.DatasBean> datas) {
        this.context = context;
        this.datas = datas;
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
            case 3:
                holder = new Home4ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home4viewholder, parent, false));
                break;
            case 4:
                holder = new Home5ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home5viewholder, parent, false));
                break;
            case 5:
                holder = new Home6ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home6viewholder, parent, false));
                break;
            case 6:
                holder = new Home7ViewHolder(LayoutInflater.from(context).
                        inflate(R.layout.home7viewholder, parent, false));
                break;
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
            case 3:
                holder4 = (Home4ViewHolder) holder;
                //新品推荐下面的商品
                setHome4ViewHolder();
                break;
            case 4:
                holder5 = (Home5ViewHolder) holder;
                //限时抢购
                setHome5ViewHolder();
                break;
            case 5:
                holder6 = (Home6ViewHolder) holder;
                //推荐品牌
                setHome6ViewHolder();
                break;
            case 6:
                holder7 = (Home7ViewHolder) holder;
                //首页底部的数据
                setHome7ViewHolder();
                break;
        }
    }

    /**
     * 首页底部的数据
    */
    private void setHome7ViewHolder() {
        //底部的数据
        List<HomeBean.DatasBean.GoodsBean.ItemBeanXX> item1 = datas.get(7).getGoods().getItem();
        Home7Adapter adapter=new Home7Adapter(context,item1);
        //设置recyclerview模式
        holder7.recyclerview.setLayoutManager(new GridLayoutManager(context,2));
        //设置adapter
        holder7.recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        //adapter的点击事件
        adapter.setOnItemClickListener(new MyRecyclerViewItemLongClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(context,"底部",Toast.LENGTH_SHORT).show();
                if (home_startItemListener!=null){
                    //home_startItemListener.setItem_ADVstartListener(position);
                }
            }
        });
    }

    /**
     * 推荐品牌
     */
    private void setHome6ViewHolder() {
        //推荐品牌
        Glide.with(context).load(datas.get(5).getHome1().getImage()).
                placeholder(R.mipmap.yaopin).into(holder6.tuijian_image);
        //推荐品牌下方的4张图片
        Glide.with(context).load(datas.get(6).getHome8().getRectangle1_image()).
                placeholder(R.mipmap.yaopin).into(holder6.image1);
        Glide.with(context).load(datas.get(6).getHome8().getRectangle2_image()).
                placeholder(R.mipmap.yaopin).into(holder6.image2);
        Glide.with(context).load(datas.get(6).getHome8().getRectangle3_image()).
                placeholder(R.mipmap.yaopin).into(holder6.image3);
        Glide.with(context).load(datas.get(6).getHome8().getRectangle4_image()).
                placeholder(R.mipmap.yaopin).into(holder6.image4);

    }

    /**
     * 限时抢购
     */
    private void setHome5ViewHolder() {
        holder5.name.setText(datas.get(3).getDeadline().getTitle());
        //现实抢购
        Glide.with(context).load(datas.get(3).getDeadline().getImage()).
                placeholder(R.mipmap.yaopin).into(holder5.xianshi_image);
        //安泰图片
        Glide.with(context).load(datas.get(4).getHome6().getRectangle1_image()).
                placeholder(R.mipmap.yaopin).into(holder5.image1);
        //江苏福林图片
        Glide.with(context).load(datas.get(4).getHome6().getRectangle2_image()).
                placeholder(R.mipmap.yaopin).into(holder5.image2);
        /**
         * 限时抢购的点击事件
         */

        holder5.xianshi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"限时抢购",Toast.LENGTH_SHORT).show();
            }
        });
        holder5.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"限时抢购",Toast.LENGTH_SHORT).show();
            }
        });
        holder5.image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"限时抢购",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 新品推荐下面的商品
     */
    private void setHome4ViewHolder() {
        //数据
        List<HomeBean.DatasBean.Home7Bean.ItemBeanX> item = datas.get(2).getHome7().getItem();
        Home4Adapter adapter=new Home4Adapter(context,item);
        //设置recyclerview的模式
        holder4.recyclerview.setLayoutManager(new LinearLayoutManager
                (context,LinearLayoutManager.HORIZONTAL,false));
        //设置adapter
        holder4.recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        //recyclerview的点击事件
        adapter.setOnItemClickListener(new MyRecyclerViewItemLongClickListener() {
            @Override
            public void onItemClick(int postion) {
                Toast.makeText(context,postion+"",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 新品推荐
     */
    private void setHome3ViewHolder() {
        holder3.title.setText(datas.get(1).getHome1().getTitle());
        Glide.with(context).load(datas.get(1).getHome1().getImage()).
                placeholder(R.mipmap.yaopin).into(holder3.image);
        holder3.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"新品推荐",Toast.LENGTH_SHORT).show();
            }
        });
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
        //banner的点击事件
        holder1.banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(context,position+"",Toast.LENGTH_SHORT).show();
                if (home_startItemListener!=null){
                    home_startItemListener.setItem_ADVstartListener(position);
                }
            }
        });

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
            case 3:
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
                break;
        }
        return type;
    }

    @Override
    public int getItemCount() {
        return 7;
    }

}
