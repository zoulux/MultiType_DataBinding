package com.zoulux.multitype_databinding;

import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.MultiTypeAdapter;
import me.drakeet.multitype.TypePool;

/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class CommonAdapter extends MultiTypeAdapter {
    public final ObservableField<RecyclerView.LayoutManager> layoutmanager = new ObservableField<>();

    public CommonAdapter() {
        this(new ArrayList<>());
        applyGlobalMultiTypePool();
    }

    public CommonAdapter(@NonNull List<?> items) {
        super(items);
    }

    public CommonAdapter(@NonNull List<?> items, TypePool pool) {
        super(items, pool);
    }

    public List<Object> getData() {
        return (List<Object>) items;
    }

    @NonNull
    @Override
    public Class onFlattenClass(@NonNull Object item) {
        return super.onFlattenClass(item);
    }
}
