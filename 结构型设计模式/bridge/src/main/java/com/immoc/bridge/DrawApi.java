package com.immoc.bridge;

/**
 * 通过实现此接口来实现桥接的功能，
 * @author xuyuansheng
 */
public interface DrawApi {
    /**
     * drawCircle
     * @param radius
     * @param x
     * @param y
     */
     void drawCircle(int radius, int x, int y);
}
