package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */

public class Home3ViewHolder extends RecyclerView.ViewHolder {


    public TextView title;
    public ImageView image;

    public Home3ViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.home3_title);
        image = (ImageView) itemView.findViewById(R.id.home3_image);
    }
}
