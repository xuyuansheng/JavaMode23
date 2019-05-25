package com.immoc.strategy;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class MallardAbstractDuck extends AbstractDuck {

    public MallardAbstractDuck() {
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的!");
    }
}
