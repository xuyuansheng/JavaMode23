package com.immoc.prototyppe;

/**
 * 正方形
 */
public class Square extends Shape {


    public Square() {
        type = "正方形";
    }

    @Override
    void draw() {
        System.out.println("正方形里面的draw() 方法");
    }
}
