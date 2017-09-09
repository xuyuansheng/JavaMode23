package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 */
public class BigYellowDuck extends Duck {
    public BigYellowDuck() {
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大,全身黄黄!");
    }
}
