package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */

public class Home6ViewHolder extends RecyclerView.ViewHolder {

    public final ImageView tuijian_image;
    public final ImageView image1;
    public final ImageView image2;
    public final ImageView image3;
    public final ImageView image4;

    public Home6ViewHolder(View itemView) {
        super(itemView);
        tuijian_image = (ImageView) itemView.findViewById(R.id.home6_tuijian_image);
        image1 = (ImageView) itemView.findViewById(R.id.home6_image1);
        image2 = (ImageView) itemView.findViewById(R.id.home6_image2);
        image3 = (ImageView) itemView.findViewById(R.id.home6_image3);
        image4 = (ImageView) itemView.findViewById(R.id.home6_image4);
    }
}
