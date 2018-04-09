package com.immoc.bridge.leftOnBridge;

import com.immoc.bridge.DrawAPI;
import com.immoc.bridge.Shape;

/**
 * Shape 的实现类 解耦的其中一方：桥的起点
 * 通过此类可以画出不同的圆形 通过构造方法的参数给圆形从不同维度（颜色，大小，坐标）赋予属性
 */
public class Circle extends Shape {

    private int x, y, radius;

    /**
     *
     * @param drawAPI  通过桥接口给圆形赋予颜色
     * @param x  普通构造赋予横坐标x
     * @param y  普通构造赋予纵坐标y
     * @param radius   普通构造赋予半径radius
     */
    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void drawCircle() {
        drawAPI.drawCircle(radius,x,y);
    }


}
