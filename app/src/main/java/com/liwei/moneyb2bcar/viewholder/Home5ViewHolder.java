package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */
public class Home5ViewHolder extends RecyclerView.ViewHolder{

    public final TextView name;
    public final ImageView xianshi_image;
    public final ImageView image1;
    public final ImageView image2;

    public Home5ViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.home5_name);
        xianshi_image = (ImageView) itemView.findViewById(R.id.home5_xianshi_image);
        image1 = (ImageView) itemView.findViewById(R.id.home5_image1);
        image2 = (ImageView) itemView.findViewById(R.id.home5_image2);
    }
}
