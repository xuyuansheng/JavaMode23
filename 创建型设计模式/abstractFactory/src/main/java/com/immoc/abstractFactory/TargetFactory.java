package com.immoc.abstractFactory;

import com.immoc.factory.TargetInterface;
import com.immoc.factory.TargetInterface2;
import com.immoc.factory.TargetObj1;
import com.immoc.factory.TargetObj2;
import org.w3c.dom.views.AbstractView;

/**
 * 具体的工厂类，生产目标产品
 * 这个工厂生产的是第一类别的产品TargetInterface，实现了抽象工厂的getInstance方法
 */
public class TargetFactory extends AbstractFactory {
    public TargetInterface getInstance(String param) {
        if ("一".equals(param)) {
            return new TargetObj1();
        } else if ("二".equals(param)) {
            return new TargetObj2();
        }
        return null;
    }

    public TargetInterface2 getInstance2(String param) {
        return null;
    }
}
