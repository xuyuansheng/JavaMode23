package com.immoc.factory;

/**
 * 需要生产的具体对象
 */
public class TargetObj2 implements TargetInterface {
    public void method() {
        System.out.println("生成的目标对象 二");
    }
}
