package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/13.
 * Home_advOne_ActivityAdapter的第一个viewholder类型
 */

public class Home_adv_ActivityAdapterViewHolder extends RecyclerView.ViewHolder {

    public final ImageView image;

    public Home_adv_ActivityAdapterViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.home_adv_imageone);
    }
}
