package com.immoc.prototype;

/**
 * 长方形
 * @author xuyuansheng
 */
public class Rectangle  extends AbstractShape {

    public Rectangle(){
        type = "长方形";
    }

    @Override
    void draw() {
        System.out.println("长方形类里面的draw()方法");
    }
}
