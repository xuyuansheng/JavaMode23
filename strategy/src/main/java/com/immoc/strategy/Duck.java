package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 * 鸭子的抽象类,所有鸭子的父类
 * 鸭子的行为 : 显示 和 鸣叫
 */
public abstract class Duck {
    /**
     * 通用的行为,直接实现
     */
    void quack() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 显示鸭子的外观,不同的鸭子样子不同,由子类实现
     */
    public abstract void display();

    /**
     * 增加鸭子的飞行能力
     */
    public void fly() {
        this.flyingStrategy.performFly();
    }

    ;
    //为飞行能力提供的策略
    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }
}
