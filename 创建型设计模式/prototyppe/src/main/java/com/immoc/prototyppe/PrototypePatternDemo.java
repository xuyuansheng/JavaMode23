package com.immoc.prototyppe;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape circle = ShapeCache.getShape("1");
        System.out.println(circle.getType());
    }

}
