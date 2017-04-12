package com.liwei.moneyb2bcar.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.liwei.moneyb2bcar.R;

/**
 * Created by wu  suo  wei on 2017/4/12.
 */

public class Home2ViewHolder extends RecyclerView.ViewHolder {


    public LinearLayout xiyao;
    public LinearLayout zhongyao;
    public LinearLayout baojian;
    public LinearLayout yiliao;
    public LinearLayout jisheng;

    public Home2ViewHolder(View itemView) {
        super(itemView);
        xiyao = (LinearLayout) itemView.findViewById(R.id.home2_xiyao);
        zhongyao = (LinearLayout) itemView.findViewById(R.id.home2_zhongyao);
        baojian = (LinearLayout) itemView.findViewById(R.id.home2_baojian);
        yiliao = (LinearLayout) itemView.findViewById(R.id.home2_yiliao);
        jisheng = (LinearLayout) itemView.findViewById(R.id.home2_jisheng);
    }
}
