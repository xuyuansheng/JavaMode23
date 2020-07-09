package com.immoc.prototype;

import java.util.Hashtable;

/**
 * @author xuyuansheng
 */
public class ShapeCache {


    private static Hashtable<String, AbstractShape> shapeMap = new Hashtable<String, AbstractShape>();

    /**
     *  // 对每种形状都运行数据库查询，并创建该形状
     *     // shapeMap.put(shapeKey, shape);
     *     // 例如，我们要添加三种形状
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

    public static AbstractShape getShape(String shapeId) {
        AbstractShape cachedAbstractShape = shapeMap.get(shapeId);
        return (AbstractShape) cachedAbstractShape.clone();
    }



}
