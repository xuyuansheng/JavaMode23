package com.immoc.builder.packing;

import com.immoc.builder.itfc.Packing;

public class Bottle implements Packing
{
    @Override
    public String pack() {
        return "Bottle 瓶包装";
    }
}
