package com.immoc.abstractFactory;

import com.immoc.factory.TargetInterface;
import com.immoc.factory.TargetInterface2;
import com.immoc.factory.TargetObj1;
import com.immoc.factory.TargetObj2;
import org.w3c.dom.views.AbstractView;

/**
 * 具体的工厂类，生产目标产品
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
