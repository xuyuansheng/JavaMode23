package com.immoc.abstractfactory;

import com.immoc.factory.TargetInterface;
import com.immoc.factory.TargetInterface2;
import com.immoc.factory.TargetObj1;
import com.immoc.factory.TargetObj2;

/**
 * 具体的工厂类，生产目标产品
 * 这个工厂生产的是第一类别的产品TargetInterface，实现了抽象工厂的getInstance方法
 * @author xuyuansheng
 */
public class TargetFactory extends AbstractFactory {
    @Override
	public TargetInterface getInstance(String param) {

        String one = "一";
        String two = "二";
        if (one.equals(param)) {
            return new TargetObj1();
        } else if (two.equals(param)) {
            return new TargetObj2();
        }
        return null;
    }

    @Override
	public TargetInterface2 getInstance2(String param) {
        return null;
    }
}
