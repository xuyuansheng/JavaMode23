package com.immoc.builder.itfc;


import java.math.BigDecimal;

/**
 * 一个表示食品的接口
 * 食品有：名称，包装，价格
 */
public interface Item {

    public String name();

    public BigDecimal price();

    public Packing packing();

}
