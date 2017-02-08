package com.zoulux.multitype_databinding.databinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zoulux.multitype_databinding.CommonAdapter;


/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class DataBindingAdapter {

    @BindingAdapter(value = {"adapter", "layoutmanager"}, requireAll = false)
    public static void setAdapter(RecyclerView v, CommonAdapter adapter, RecyclerView.LayoutManager layoutManager) {
        if (adapter == null) {
            return;
        }
        if (layoutManager == null) {
            layoutManager = new LinearLayoutManager(v.getContext(), LinearLayoutManager.VERTICAL, false);
        }
        v.setLayoutManager(layoutManager);
        v.setAdapter(adapter);
    }


}
