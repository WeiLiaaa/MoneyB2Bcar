package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.liwei.moneyb2bcar.R;
import com.youth.banner.Banner;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */

public class Home1ViewHolder extends RecyclerView.ViewHolder {

    public Banner banner;

    public Home1ViewHolder(View itemView) {
        super(itemView);
        banner = (Banner) itemView.findViewById(R.id.home1_banner);
    }
}
