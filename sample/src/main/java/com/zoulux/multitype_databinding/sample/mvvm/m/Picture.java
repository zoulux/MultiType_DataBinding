package com.zoulux.multitype_databinding.sample.mvvm.m;

/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class Picture {
    public String id;
    public String name;
    public String size;

    public Picture(String id, String name, String size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
