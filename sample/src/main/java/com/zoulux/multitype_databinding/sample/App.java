package com.zoulux.multitype_databinding.sample;

import android.app.Application;

import com.zoulux.multitype_databinding.CommonViewProvider;
import com.zoulux.multitype_databinding.sample.mvvm.m.Picture;
import com.zoulux.multitype_databinding.sample.mvvm.m.Picture2;
import com.zoulux.multitype_databinding.sample.mvvm.m.Product;
import com.zoulux.multitype_databinding.sample.mvvm.vm.PictureViewModule;
import com.zoulux.multitype_databinding.sample.mvvm.vm.PictureViewModule2;
import com.zoulux.multitype_databinding.sample.mvvm.vm.ProductViewModule;

import me.drakeet.multitype.GlobalMultiTypePool;


/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GlobalMultiTypePool.register(Picture.class, new CommonViewProvider(R.layout.item_picture, PictureViewModule.class));
        GlobalMultiTypePool.register(Picture2.class, new CommonViewProvider(R.layout.item_picture_2, PictureViewModule2.class));
        GlobalMultiTypePool.register(Product.class, new CommonViewProvider(R.layout.item_product, ProductViewModule.class));
    }
}
