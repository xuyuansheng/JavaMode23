package com.immoc.bridge;

/**
 * 形状的抽象类 可以使用 DrawAPI  画出不同的圆形
 * 这个是桥的抽象起始端（即起始段的抽象类），这个抽象类的实现类可以通过DrawAPI drawAPI中的方法实现特定的功能（drawCircle画出不同大小，颜色的圆形）
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void drawCircle();

}
