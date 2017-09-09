package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 */
public class FlyingNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("我不会飞行!");
    }
}
