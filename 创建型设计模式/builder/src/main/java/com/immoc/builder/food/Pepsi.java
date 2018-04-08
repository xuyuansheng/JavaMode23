package com.immoc.builder.food;

import java.math.BigDecimal;

/**
 * 定义一个百事可乐
 * 装配上名称和价格
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(0.35);
    }
}
