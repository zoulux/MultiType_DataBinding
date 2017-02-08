package com.zoulux.multitype_databinding.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;

import com.zoulux.multitype_databinding.CommonAdapter;
import com.zoulux.multitype_databinding.sample.databinding.ActivityMainBinding;
import com.zoulux.multitype_databinding.sample.mvvm.m.Picture;
import com.zoulux.multitype_databinding.sample.mvvm.m.Picture2;
import com.zoulux.multitype_databinding.sample.mvvm.m.Product;


public class MainActivity extends AppCompatActivity {
    CommonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        adapter = new CommonAdapter();
        binding.setAdapter(adapter);


        for (int i = 0; i < 50; i++) {
            adapter.getData().add(new Picture("相片:" + i, "pic:" + i, "size:" + i * i));
            int m = (int) (Math.random() * i);
            for (int j = 0; j < m; j++) {
                adapter.getData().add(new Product("产品:" + i, "product:" + i));
            }
            for (int j = 0; j < i - m; j++) {
                adapter.getData().add(new Picture2("相片:" + i, "pic:" + i, "size:" + i * i));
            }
        }
    }

    @Override
    public void onBackPressed() {
        double v = Math.random() * 10;
        RecyclerView.LayoutManager manager;
        if (v < 3) {
            manager = new GridLayoutManager(getApplicationContext(), 2, LinearLayoutManager.VERTICAL, false);
        } else if (v < 6) {
            manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        } else {
            manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        }
        adapter.layoutmanager.set(manager);
    }
}
