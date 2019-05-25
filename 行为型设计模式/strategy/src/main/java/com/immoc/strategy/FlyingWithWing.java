package com.immoc.strategy;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class FlyingWithWing implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("振翅高飞!");
    }
}
