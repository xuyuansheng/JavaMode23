package com.immoc.singleton;

public class NormalSingleton {

    //单例模式首先要隐藏构造
    private NormalSingleton() {
    }

    private static NormalSingleton instance = null;

    //懒汉模式
    public static NormalSingleton getInstance() {
        if (null == instance) {
            instance = new NormalSingleton();
        }
        return instance;
    }



}
