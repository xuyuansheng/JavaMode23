package com.immoc.prototyppe;

/**
 * 长方形
 */
public class Rectangle  extends Shape{

    public Rectangle(){
        type = "长方形";
    }

    @Override
    void draw() {
        System.out.println("长方形类里面的draw()方法");
    }
}
