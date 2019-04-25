package com.immoc.adapter;

/**
 * Created by xu on 2017/9/9.
 */
public class TwoPlugAdapter implements ThreePlugInterface {
    /**
     * 二相转三相的插座适配器
     */
    private TwoPlugInterface  plugInterface;

    public TwoPlugAdapter(TwoPlugInterface plugInterface) {
        this.plugInterface = plugInterface;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过一系列的转换操作 ");
        plugInterface.powerWithTwo();
    }
}
