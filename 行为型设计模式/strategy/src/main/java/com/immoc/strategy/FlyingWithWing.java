package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 */
public class FlyingWithWing implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("振翅高飞!");
    }
}
