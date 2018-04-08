package com.immoc.abstractFactory;

import com.immoc.factory.TargetInterface;
import com.immoc.factory.TargetInterface2;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    /**
     * 需要生产的第一种类型的产品
     */
    public abstract TargetInterface  getInstance(String param);
    /**
     * 需要生产的第二种类型的产品
     */
    public abstract TargetInterface2 getInstance2(String param);
}
