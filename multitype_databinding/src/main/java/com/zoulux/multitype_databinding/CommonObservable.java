package com.zoulux.multitype_databinding;

import android.content.Context;
import android.databinding.BaseObservable;

/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public abstract class CommonObservable<T> extends BaseObservable {
    protected Context context;

    public CommonObservable(Context context) {
        this.context = context;
    }


    abstract public void setData(T data);
}
