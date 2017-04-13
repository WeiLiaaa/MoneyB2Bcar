package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/13.
 */

public class HomeADVAdapterViewHolder extends RecyclerView.ViewHolder {

    public final RecyclerView recyclerview;

    public HomeADVAdapterViewHolder(View itemView) {
        super(itemView);
        recyclerview = (RecyclerView) itemView.findViewById(R.id.home_adv_holder_rec);
    }
}
