package com.immoc.bridge.rightonbridge;

import com.immoc.bridge.DrawApi;

/**
 * 红色的圆形
 * @author xuyuansheng
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("通过桥的这个实现类可以画出 红色的不同大小的圆形");
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }

}
