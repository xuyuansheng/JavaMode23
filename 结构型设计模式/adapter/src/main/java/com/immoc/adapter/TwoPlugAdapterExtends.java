package com.immoc.adapter;

/**
 * Created by xu on 2017/9/9.
 * 通过继承的方式实现适配器
 */
public class TwoPlugAdapterExtends  extends GBTwoPlug implements ThreePlugInterface{
    @Override
    public void powerWithThree() {
        // 通过转换 使用父类二相插座GBTwoPlug
        System.out.println("借助继承适配器 通过一系列的转换");
        super.powerWithTwo();
    }
}
