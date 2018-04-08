package com.immoc.builder.packing;

import com.immoc.builder.itfc.Packing;

/**
 * 一个纸包装的类
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper 纸包装";
    }
}
