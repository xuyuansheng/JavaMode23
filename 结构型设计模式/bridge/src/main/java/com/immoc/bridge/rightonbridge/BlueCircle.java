package com.immoc.bridge.rightonbridge;

import com.immoc.bridge.DrawApi;

/**
 * 桥的另一端（目标端） 粗线画的圆形
 * @author xuyuansheng
 */
public class BlueCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("通过桥的这个实现类可以画出 蓝色的不同大小的圆形");
        System.out.println("Drawing Circle[ color: blue, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }


}
