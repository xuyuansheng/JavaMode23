package com.immoc.adapter;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class GbTwoPlug implements TwoPlugInterface{
    /** 使用二相电流供电 */
    @Override
    public  void powerWithTwo(){
        System.out.println("使用二相电流供电");
    }
}
