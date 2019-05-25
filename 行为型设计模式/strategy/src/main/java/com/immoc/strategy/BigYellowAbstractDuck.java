package com.immoc.strategy;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class BigYellowAbstractDuck extends AbstractDuck {
    public BigYellowAbstractDuck() {
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大,全身黄黄!");
    }
}
