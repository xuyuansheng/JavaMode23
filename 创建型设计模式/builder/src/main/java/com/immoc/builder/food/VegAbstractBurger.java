package com.immoc.builder.food;

import java.math.BigDecimal;

/**
 * 定义一个具体的汉堡：鸡蛋汉堡
 * 装配名称和价格
 * @author xuyuansheng
 */
public class VegAbstractBurger extends AbstractBurger {
    @Override
    public String name() {
        return "鸡蛋汉堡";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(1);
    }
}
