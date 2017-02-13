package com.zoulux.multitype_databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.lang.reflect.InvocationTargetException;

import me.drakeet.multitype.ItemViewProvider;

/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class CommonViewProvider<T> extends ItemViewProvider<T, CommonHolder<T>> {
    private int layoutId;
    private Class<CommonObservable> vmClazz;

    public CommonViewProvider(int layoutId, Class<CommonObservable> vmClazz) {
        this.layoutId = layoutId;
        this.vmClazz = vmClazz;
    }

    @NonNull
    @Override
    protected CommonHolder<T> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, this.layoutId, parent, false);
        try {
            return new CommonHolder(binding, vmClazz.getConstructor(Context.class).newInstance(parent.getContext()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onBindViewHolder(@NonNull CommonHolder<T> holder, @NonNull T t) {
        holder.bindData(t);
    }
}
