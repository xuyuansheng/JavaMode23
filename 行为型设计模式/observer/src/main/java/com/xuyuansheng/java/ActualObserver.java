package com.xuyuansheng.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 实际的观察者
 *
 * @author Mr.Xu
 * @date 2020/7/9 22:27
 * @see Observer 观察者
 */
public class ActualObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ActualObservable actualObserver = (ActualObservable) o;
        System.out.println(actualObserver.state);
        System.out.println(arg);
    }
}
