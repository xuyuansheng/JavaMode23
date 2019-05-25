package com.immoc.builder.food;

import com.immoc.builder.itfc.Item;
import com.immoc.builder.itfc.Packing;
import com.immoc.builder.packing.Bottle;

import java.math.BigDecimal;

/**
 * 定义一个冷饮抽象类
 * 先装配好包装类型为 ： 瓶包装
 * @author xuyuansheng
 */
public abstract class AbstractColdDrink implements Item {
    /**
     * price
     * @return BigDecimal
     */
    @Override
    public abstract BigDecimal price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
