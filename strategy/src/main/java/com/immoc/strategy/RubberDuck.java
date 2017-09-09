package com.immoc.strategy;

/**
 * Created by xu on 2017/9/9.
 * 橡胶呀
 */
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我全身发黄,嘴巴很红!");
    }

    /**
     *  橡胶鸭的叫声不同
     */
    @Override
    void quack() {
        System.out.println("嘎~嘎~嘎~");
    }
}
