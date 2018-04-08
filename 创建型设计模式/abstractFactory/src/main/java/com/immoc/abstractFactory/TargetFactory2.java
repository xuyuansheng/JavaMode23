package com.immoc.abstractFactory;

import com.immoc.factory.*;

/**
 * 具体的工厂类，生产目标产品
 */
public class TargetFactory2 extends AbstractFactory {
    public TargetInterface getInstance(String param) {
        return null;
    }

    public TargetInterface2 getInstance2(String param) {
        if ("三".equals(param)) {
            return new TargetObj3();
        } else if ("四".equals(param)) {
            return new TargetObj4();
        }
        return null;
    }
}
