package com.immoc.builder.food;

import java.math.BigDecimal;

/**
 * 定义一个鸡肉汉堡
 * 装配名称和价格
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(2);
    }
}
