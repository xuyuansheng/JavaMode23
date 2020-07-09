package com.xuyuansheng.java;

/**
 * 测试类
 *
 * @author Mr.Xu
 * @date 2020/7/9 22:32
 */
public class TestClass {

    public static void main(String[] args) {
        ActualObservable actualObservable = new ActualObservable();
        ActualObserver actualObserver = new ActualObserver();
        /*  添加观察者 */
        actualObservable.addObserver(actualObserver);

        actualObservable.changeState();
    }
}
