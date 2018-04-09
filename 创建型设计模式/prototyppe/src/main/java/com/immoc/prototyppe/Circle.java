package com.immoc.prototyppe;

public class Circle extends Shape {
    public Circle() {
        super.type = "圆形";
    }

    @Override
    void draw() {
        System.out.println("圆形里面的draw()方法");
    }
}
