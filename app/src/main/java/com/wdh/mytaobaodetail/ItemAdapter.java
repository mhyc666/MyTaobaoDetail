package com.wdh.mytaobaodetail;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hankkin.library.MyImageLoader;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/8/21.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHoldler> {
    private List<String> data;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int width;
    public ItemAdapter(Context mContext, List<String> mList,int width) {
        this.mContext = mContext;
        this.data = mList;
        this.width=width;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public MyViewHoldler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_adapter, parent, false);
        return new MyViewHoldler(view);
    }

    @Override
    public void onBindViewHolder(MyViewHoldler holder, int position) {
        MyImageLoader.getInstance().displayImageCen(mContext,data.get(position),holder.iv,width,width/2);
       // MyGlideImageLoader.displayImage(data.get(position),holder.iv);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHoldler extends RecyclerView.ViewHolder {
        @BindView(R.id.iv)
        ImageView iv;
        public MyViewHoldler(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
