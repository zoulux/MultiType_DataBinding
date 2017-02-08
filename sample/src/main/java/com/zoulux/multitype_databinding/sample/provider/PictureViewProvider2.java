package com.zoulux.multitype_databinding.sample.provider;

import android.databinding.ViewDataBinding;

import com.zoulux.multitype_databinding.CommonHolder;
import com.zoulux.multitype_databinding.CommonObservable;
import com.zoulux.multitype_databinding.CommonViewProvider;
import com.zoulux.multitype_databinding.sample.mvvm.m.Product;
import com.zoulux.multitype_databinding.sample.mvvm.vm.PictureViewModule2;


/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class PictureViewProvider2 extends CommonViewProvider<Product> {
    public PictureViewProvider2(int layoutId) {
        super(layoutId);
    }

    @Override
    protected CommonHolder<Product> onCreateViewHolder(ViewDataBinding binding) {
        return new ViewHolder(binding);
    }

    /**
     * 每一个vh 都对应一个vm
     */
    static class ViewHolder extends CommonHolder<Product> {

        public ViewHolder(ViewDataBinding binding) {
            super(binding);
        }

        @Override
        protected CommonObservable onCreateViewModule() {
            return new PictureViewModule2(context);
        }
    }
}
