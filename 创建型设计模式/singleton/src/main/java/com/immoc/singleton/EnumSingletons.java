package com.immoc.singleton;

public enum EnumSingletons {

    INSTANCE;

    public void getInstance(){
        System.out.println(INSTANCE.getClass());
    }

}
