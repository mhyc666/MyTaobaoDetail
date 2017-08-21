package com.wdh.mytaobaodetail.views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * linearLayoutManager.setScrollEnabled(true);
 * 设置是否可以滑动
 * Created by Administrator on 2017/8/21.
 */

public class CustomLinearLayoutManager extends LinearLayoutManager {
    private boolean isScrollEnabled = true;

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }

    public void setScrollEnabled(boolean flag) {
        this.isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        //Similarly you can customize "canScrollHorizontally()" for managing horizontal scroll
        return isScrollEnabled && super.canScrollVertically();
    }
}