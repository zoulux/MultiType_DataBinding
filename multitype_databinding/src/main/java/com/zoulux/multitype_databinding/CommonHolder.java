package com.zoulux.multitype_databinding;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;


/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
 public class CommonHolder<T> extends RecyclerView.ViewHolder {
    public CommonObservable<T> vm;
    protected Context context;

    public CommonHolder(ViewDataBinding binding, CommonObservable<T> vm) {
        super(binding.getRoot());
        this.context = binding.getRoot().getContext();
        this.vm = vm;
        binding.setVariable(com.zoulux.multitype_databinding.BR.module, vm);
    }

    public void bindData(T t) {
        vm.setData(t);
    }
}
