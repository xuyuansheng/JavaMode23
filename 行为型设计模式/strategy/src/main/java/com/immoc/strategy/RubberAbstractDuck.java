package com.immoc.strategy;

/**
 *
 * @author xu
 * @date 2017/9/9
 * 橡胶呀
 */
public class RubberAbstractDuck extends AbstractDuck {
    public RubberAbstractDuck() {
        super.setFlyingStrategy(new FlyingWithWing());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄,嘴巴很红!");
    }

    /**
     *  橡胶鸭的叫声不同
     */
    @Override
    public void quack() {
        System.out.println("嘎~嘎~嘎~");
    }
}
