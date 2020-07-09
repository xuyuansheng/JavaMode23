package com.immoc.prototype;

/**
 * @author xuyuansheng
 */
public class Circle extends AbstractShape {
    public Circle() {
        super.type = "圆形";
    }

    @Override
    void draw() {
        System.out.println("圆形里面的draw()方法");
    }
}
