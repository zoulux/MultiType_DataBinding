package com.zoulux.multitype_databinding.sample;

import android.app.Application;

import com.zoulux.multitype_databinding.sample.mvvm.m.Picture;
import com.zoulux.multitype_databinding.sample.mvvm.m.Picture2;
import com.zoulux.multitype_databinding.sample.mvvm.m.Product;
import com.zoulux.multitype_databinding.sample.provider.PictureViewProvider;
import com.zoulux.multitype_databinding.sample.provider.PictureViewProvider2;
import com.zoulux.multitype_databinding.sample.provider.ProductViewProvider;

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
        GlobalMultiTypePool.register(Picture.class, new PictureViewProvider(R.layout.item_picture));
        GlobalMultiTypePool.register(Picture2.class, new PictureViewProvider2(R.layout.item_picture_2));
        GlobalMultiTypePool.register(Product.class, new ProductViewProvider(R.layout.item_product));
    }
}
