package com.immoc.strategy;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class FlyingNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("我不会飞行!");
    }
}
