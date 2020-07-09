package com.xuyuansheng.java;

import java.util.Observable;

/**
 * 实际的被观察者
 *
 * @author Mr.Xu
 * @date 2020/7/9 22:30
 * @see Observable 被观察者
 */
public class ActualObservable extends Observable {

    public int state;

    public boolean changeState() {
        this.state++;
        super.setChanged();
        notifyObservers("parameter");
        return true;
    }

}
