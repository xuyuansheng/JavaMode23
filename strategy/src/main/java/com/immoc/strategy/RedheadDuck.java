package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的!");
    }
}
