package com.immoc.prototyppe;

/**
 * @author xuyuansheng
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        AbstractShape circle = ShapeCache.getShape("1");
        System.out.println(circle.getType());
    }

}
