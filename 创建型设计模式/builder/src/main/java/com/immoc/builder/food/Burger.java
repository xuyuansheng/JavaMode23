package com.immoc.builder.food;

import com.immoc.builder.itfc.Item;
import com.immoc.builder.itfc.Packing;
import com.immoc.builder.packing.Wrapper;

/**
 * 汉堡包食品
 * 先装配好包装类型为 ： 纸包装
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
