package com.zoulux.multitype_databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import me.drakeet.multitype.ItemViewProvider;

/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public abstract class CommonViewProvider<T> extends ItemViewProvider<T, CommonHolder<T>> {
    private int layoutId;

    public CommonViewProvider(int layoutId) {
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    protected CommonHolder<T> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, this.layoutId, parent, false);
        return onCreateViewHolder(binding);
    }

    abstract protected CommonHolder<T> onCreateViewHolder(ViewDataBinding binding);

    @Override
    protected void onBindViewHolder(@NonNull CommonHolder<T> holder, @NonNull T t) {
        holder.bindData(t);
    }
}
