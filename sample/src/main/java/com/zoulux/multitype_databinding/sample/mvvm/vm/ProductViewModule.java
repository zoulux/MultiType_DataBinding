package com.zoulux.multitype_databinding.sample.mvvm.vm;

import android.content.Context;
import android.databinding.Bindable;

import com.zoulux.multitype_databinding.CommonObservable;
import com.zoulux.multitype_databinding.sample.BR;
import com.zoulux.multitype_databinding.sample.mvvm.m.Product;


/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class ProductViewModule extends CommonObservable<Product> {
    private Product product;

    public ProductViewModule(Context context) {
        super(context);
    }

    @Bindable
    public String getId() {
        return product != null ? product.id : "";
    }

    @Bindable
    public String getName() {
        return product != null ? product.name : "";
    }

    @Override
    public void setData(Product data) {
        this.product = data;
        notifyPropertyChanged(BR.id);
        notifyPropertyChanged(BR.name);
    }

}
