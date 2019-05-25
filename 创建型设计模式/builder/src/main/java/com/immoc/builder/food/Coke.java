package com.immoc.builder.food;

import java.math.BigDecimal;

/**
 * 定义一个可口可乐冷饮
 * 装配名称和价格
 * @author xuyuansheng
 */
public class Coke extends AbstractColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(0.4);
    }
}
