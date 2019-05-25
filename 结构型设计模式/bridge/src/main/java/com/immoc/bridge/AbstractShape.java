package com.immoc.bridge;

/**
 * 形状的抽象类 可以使用 DrawApi  画出不同的圆形
 * 这个是桥的抽象起始端（即起始段的抽象类），这个抽象类的实现类可以通过DrawAPI drawAPI中的方法实现特定的功能（drawCircle画出不同大小，颜色的圆形）
 * @author xuyuansheng
 */
public abstract class AbstractShape {

    protected DrawApi drawAPI;

    public AbstractShape(DrawApi drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     * drawCircle
     */
    public abstract void drawCircle();

}
