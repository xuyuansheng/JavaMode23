package com.immoc.bridge.rightOnBridge;

import com.immoc.bridge.DrawAPI;

/**
 * 红色的圆形
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("通过桥的这个实现类可以画出 红色的不同大小的圆形");
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }

}
