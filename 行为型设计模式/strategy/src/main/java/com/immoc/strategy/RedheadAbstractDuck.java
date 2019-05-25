package com.immoc.strategy;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class RedheadAbstractDuck extends AbstractDuck {
    public RedheadAbstractDuck() {
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的!");
    }
}
