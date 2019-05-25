package com.immoc.builder.food;

import java.math.BigDecimal;

/**
 * 定义一个百事可乐
 * 装配上名称和价格
 * @author xuyuansheng
 */
public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(0.35);
    }
}
