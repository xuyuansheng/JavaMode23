package com.immoc.abstractfactory;

import com.immoc.factory.*;

/**
 * 具体的工厂类，生产目标产品
 * 这个工厂生产的是第二类别的产品TargetInterface2，实现了抽象工厂的getInstance2方法
 * @author xuyuansheng
 */
public class TargetFactory2 extends AbstractFactory {
    @Override
	public TargetInterface getInstance(String param) {
        return null;
    }

    @Override
	public TargetInterface2 getInstance2(String param) {
        String three = "三";
        String four = "四";
        if (three.equals(param)) {
            return new TargetObj3();
        } else if (four.equals(param)) {
            return new TargetObj4();
        }
        return null;
    }
}
