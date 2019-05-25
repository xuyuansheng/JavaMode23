package com.immoc.prototyppe;

/**
 * 正方形
 * @author xuyuansheng
 */
public class Square extends AbstractShape {


    public Square() {
        type = "正方形";
    }

    @Override
    void draw() {
        System.out.println("正方形里面的draw() 方法");
    }
}
