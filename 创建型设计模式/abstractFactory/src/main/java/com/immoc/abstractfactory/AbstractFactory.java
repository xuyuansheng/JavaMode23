package com.immoc.abstractfactory;

import com.immoc.factory.TargetInterface;
import com.immoc.factory.TargetInterface2;

/**
 * 抽象工厂类
 * 定义这个工厂可以生产哪些类别的产品，具体的生产过程在其子类中实现
 * @author xuyuansheng
 */
public abstract class AbstractFactory {
    /**
     * 需要生产的第一种类型的产品
     * @param param
     * @return
     */
    public abstract TargetInterface  getInstance(String param);

    /**
     * 需要生产的第二种类型的产品
     * @param param
     * @return
     */
    public abstract TargetInterface2 getInstance2(String param);
}
