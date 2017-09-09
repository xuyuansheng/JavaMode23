package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 */
public class MallardDuck  extends  Duck{

    public MallardDuck() {
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的!");
    }
}